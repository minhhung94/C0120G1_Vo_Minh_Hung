import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {EquipmentModel} from '../../../model/equipment.model';
import {EquipmentService} from '../../../service/equipment.service';
import {MatDialog} from '@angular/material';
import {EquipmentDeleteComponent} from '../equipment-delete/equipment-delete.component';
import {EquipmentAddComponent} from '../equipment-add/equipment-add.component';
import {EquipmentEditComponent} from '../equipment-edit/equipment-edit.component';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-equipment-list',
  templateUrl: './equipment-list.component.html',
  styleUrls: ['./equipment-list.component.css']
})
export class EquipmentListComponent implements OnInit, OnDestroy {
  public formAddNewEquipment: FormGroup;
  public subscription: Subscription;
  public equipmentOfId;
  public flag;
  public equipmentModel: EquipmentModel[];
  public totalRec: number;
  public page = 1;
  public checkEdit= false;
  public searchText;
  constructor(
    public formBuilder: FormBuilder,
    public equipmentService: EquipmentService,
    public dialog: MatDialog,
    public activateRouter: ActivatedRoute,
    public router: Router
  ) { }

  ngOnInit() {
    this.subscription = this.equipmentService.getAllEquipment().subscribe((data: EquipmentModel[]) => {
      this.equipmentModel = data;
      this.totalRec = this.equipmentModel.length;
    });
    this.formAddNewEquipment = this.formBuilder.group({
      type: ['', [Validators.required]],
      deviceName: ['', [Validators.required]],
      amount: ['', [Validators.required]],
      status: ['', [Validators.required]],
      amountOfBroken: ['', [Validators.required]],
      note: ['', [Validators.required]],
    });

  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  addNewEquipment() {
    this.equipmentService.addNewEquipment(this.formAddNewEquipment.value).subscribe(data => {
      this.redirectTo('equipment-list');
    });
    console.log(this.formAddNewEquipment);
  }
  redirectTo(uri:string){
    this.router.navigateByUrl('/', {skipLocationChange: true}).then(()=>
      this.router.navigate([uri]));
  }
  checkEditEquipment(id) {
    if (!this.checkEdit){
        this.checkEdit = !this.checkEdit;
        this.flag=id;
        this.equipmentOfId = id;
        this.equipmentService.getEquipmentById(this.equipmentOfId).subscribe(data => {
          this.formAddNewEquipment.patchValue(data);
        });
    }
  }
  editEquipment() {
    this.equipmentService.editEquipment(this.formAddNewEquipment.value, this.equipmentOfId).subscribe(data => {
      this.redirectTo('equipment-list');
    });
  }
  openDialogDelete(id): void {
    // @ts-ignore
    this.equipmentService.getAllEquipment(id).subscribe(dataOfEquipment => {
      const dialogRef = this.dialog.open(EquipmentDeleteComponent, {
        width: '500px',
        data: {data1: dataOfEquipment},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}

import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Service} from '../../../model/service';
import {ServiceService} from '../../../services/service.service';
import {MatDialog} from '@angular/material/dialog';
import {ServiceDeleteComponent} from '../service-delete/service-delete.component';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public services: Service[];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(
    public serviceService: ServiceService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.subscription = this.serviceService.getAllServices().subscribe((data: Service[]) => {
      this.services = data;
      this.totalRec = this.services.length;
    });
  }
  // onDeleteService(id: number) {
  //   this.subscription = this.serviceService.deleteService(id).subscribe((data: Service) => {
  //     this.updateDataAfterDelete(id);
  //   });
  // }

  // updateDataAfterDelete(id: number) {
  //   for (let i = 0; i < this.services.length; i++) {
  //     // tslint:disable-next-line:triple-equals
  //     if (this.services[i].id == id) {
  //       this.services.splice(i, 1);
  //       break;
  //     }
  //   }
  // }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  openDialog(serviceId): void {
    this.serviceService.getServiceById(serviceId).subscribe(dataOfService => {
      const dialogRef = this.dialog.open(ServiceDeleteComponent, {
        width: '500px',
        data: {data1: dataOfService},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    });
  }

}

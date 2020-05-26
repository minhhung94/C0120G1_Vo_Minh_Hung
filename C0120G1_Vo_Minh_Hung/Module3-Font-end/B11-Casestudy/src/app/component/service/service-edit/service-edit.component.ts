import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ServiceService} from '../../../services/service.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-service-edit',
  templateUrl: './service-edit.component.html',
  styleUrls: ['./service-edit.component.css']
})
export class ServiceEditComponent implements OnInit {
  public formEditService: FormGroup;
  public serviceOfId;
  constructor(
    public formBuilder: FormBuilder,
    public serviceService: ServiceService,
    public router: Router,
    public activateRouter: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.formEditService = this.formBuilder.group({
      code: ['', [Validators.required, Validators.pattern('^(SV)-[a-zA-Z0-9]{4}$')]],
      areaUsed: ['', [Validators.required]],
      maximumPeople: ['', [Validators.required]],
      typeRent: ['', [Validators.required]],
      typeService: ['', [Validators.required]],
      roomStandard: ['', [Validators.required]],
      numberOfFloors: ['', [Validators.required]],
      areaPool: ['', [Validators.required]],
      amount: ['', [Validators.required]]
    });

    // load data
    this.activateRouter.params.subscribe(data => {
      this.serviceOfId = data.id;
      this.serviceService.getServiceById(this.serviceOfId).subscribe(data => {
        this.formEditService.patchValue(data);
      });
    });
  }
  editService() {
    this.serviceService.editService(this.formEditService.value, this.serviceOfId).subscribe(data => {
      this.router.navigateByUrl('service-list');
    });
  }
}

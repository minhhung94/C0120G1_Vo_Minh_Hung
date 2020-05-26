import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ServiceService} from '../../../services/service.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-service-add',
  templateUrl: './service-add.component.html',
  styleUrls: ['./service-add.component.css']
})
export class ServiceAddComponent implements OnInit {
  public formAddNewService: FormGroup;
  constructor(
    public formBuilder: FormBuilder,
    public serviceService: ServiceService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.formAddNewService = this.formBuilder.group({
      code: ['', [Validators.required, Validators.pattern('^(DV)-[a-zA-Z0-9]{4}$')]],
      areaUsed: ['', [Validators.required]],
      maximumPeople: ['', [Validators.required, Validators.min(1)]],
      typeRent: ['', [Validators.required]],
      typeService: ['', [Validators.required]],
      roomStandard: ['', [Validators.required]],
      numberOfFloors: ['', [Validators.required]],
      areaPool: ['', [Validators.required]],
      amount: ['', [Validators.required]]
    });
  }
  addNewService() {
    this.serviceService.addNewService(this.formAddNewService.value).subscribe(data => {
      this.router.navigateByUrl('service-list');
    });
    console.log(this.formAddNewService);
  }
}

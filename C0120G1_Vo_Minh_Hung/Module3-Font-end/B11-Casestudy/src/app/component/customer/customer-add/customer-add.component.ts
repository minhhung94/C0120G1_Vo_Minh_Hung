import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../services/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {
  public formAddNewCustomer: FormGroup;
  constructor(
    public formBuilder: FormBuilder,
    public customerService: CustomerService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.formAddNewCustomer = this.formBuilder.group({
      fullName: ['', [Validators.required]],
      code: ['', [Validators.required, Validators.pattern('^(KH)-[0-9]{4}$')]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      email: ['', [Validators.required, Validators.email]],
      typeCustomer: ['', [Validators.required]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]]
    });
  }

  addNewCustomer() {
    this.customerService.addNewCustomer(this.formAddNewCustomer.value).subscribe(data => {
      this.router.navigateByUrl('customer-list');
    });
    console.log(this.formAddNewCustomer);
  }
}

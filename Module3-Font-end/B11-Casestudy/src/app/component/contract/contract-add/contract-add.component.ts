import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ContractService} from '../../../services/contract.service';
import {Router} from '@angular/router';
import {Customer} from '../../../model/customer';
import {Employee} from '../../../model/employee';
import {Service} from '../../../model/service';
import {CustomerService} from '../../../services/customer.service';
import {EmployeeService} from '../../../services/employee.service';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-contract-add',
  templateUrl: './contract-add.component.html',
  styleUrls: ['./contract-add.component.css']
})
export class ContractAddComponent implements OnInit {
  public formAddNewContract: FormGroup;
  public customers: Customer[] = [];
  public employees: Employee[] = [];
  public services: Service[] = [];


  constructor(
    public formBuilder: FormBuilder,
    public contractService: ContractService,
    public router: Router,
    public customerService: CustomerService,
    public employeeService: EmployeeService,
    public serviceService: ServiceService
  ) { }
  ngOnInit(): void {
    this.customerService.getAllCustomers().subscribe(data =>
      this.customers = data);
    this.employeeService.getAllEmployees().subscribe(data =>
      this.employees = data);
    this.serviceService.getAllServices().subscribe(data =>
      this.services = data);
    this.formAddNewContract = this.formBuilder.group({
      codeEmployee: ['', [Validators.required]],
      codeCustomer: ['', [Validators.required]],
      codeService: ['', [Validators.required]],
      startDate: ['', [Validators.required]],
      endDate: ['', [Validators.required]],
      deposit: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      total: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
  }

  addNewContract() {
    this.contractService.addNewwContract(this.formAddNewContract.value).subscribe(data => {
      this.router.navigateByUrl('contract-list');
    });

    console.log(this.formAddNewContract);
  }
}

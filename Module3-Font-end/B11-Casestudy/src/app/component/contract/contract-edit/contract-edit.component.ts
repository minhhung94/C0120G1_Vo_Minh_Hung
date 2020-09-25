import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../../../model/customer';
import {Employee} from '../../../model/employee';
import {Service} from '../../../model/service';
import {ContractService} from '../../../services/contract.service';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerService} from '../../../services/customer.service';
import {EmployeeService} from '../../../services/employee.service';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-contract-edit',
  templateUrl: './contract-edit.component.html',
  styleUrls: ['./contract-edit.component.css']
})
export class ContractEditComponent implements OnInit {
  public formEditContract: FormGroup;
  public contractOfId;
  public customers: Customer[] = [];
  public employees: Employee[] = [];
  public services: Service[] = [];

  constructor(
    public formBuilder: FormBuilder,
    public contractService: ContractService,
    public router: Router,
    public activatedRouter: ActivatedRoute,
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
    this.formEditContract = this.formBuilder.group({
      codeEmployee: ['', [Validators.required]],
      codeCustomer: ['', [Validators.required]],
      codeService: ['', [Validators.required]],
      startDate: ['', [Validators.required]],
      endDate: ['', [Validators.required]],
      deposit: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      total: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
    });
    // load data
    this.activatedRouter.params.subscribe(data => {
      this.contractOfId = data.id;
      this.contractService.getContractById(this.contractOfId).subscribe(data => {
        this.formEditContract.patchValue(data);
      });
    });
  }
  editContract() {
    this.contractService.editContract(this.formEditContract.value, this.contractOfId).subscribe(data => {
      this.router.navigateByUrl('contract-list');
    });
  }
}

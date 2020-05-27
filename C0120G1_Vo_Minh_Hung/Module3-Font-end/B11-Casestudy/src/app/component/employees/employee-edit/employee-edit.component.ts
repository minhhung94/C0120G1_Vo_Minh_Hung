import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {EmployeeService} from '../../../services/employee.service';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  public formEditCustomer: FormGroup;
  public employeeOfId;
  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router,
    public activateRouter: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.formEditCustomer = this.formBuilder.group({
      code: ['', [Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]],
      fullName: ['', [Validators.required]],
      position: ['', [Validators.required]],
      degree: ['', [Validators.required]],
      part: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]]
    });
    // load data
    this.activateRouter.params.subscribe(data => {
      this.employeeOfId = data.id;
      this.employeeService.getEmployeeById(this.employeeOfId).subscribe(data => {
        this.formEditCustomer.patchValue(data);
      });
    });
  }
  editEmployee() {
    this.employeeService.editEmployee(this.formEditCustomer.value, this.employeeOfId).subscribe(data => {
      this.router.navigateByUrl('employee-list');
    });
  }
}

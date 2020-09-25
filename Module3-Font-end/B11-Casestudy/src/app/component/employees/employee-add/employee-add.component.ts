import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {EmployeeService} from '../../../services/employee.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  public formAddNewEmployee: FormGroup;
  constructor(
    public formBuilder: FormBuilder,
    public employeeService: EmployeeService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.formAddNewEmployee = this.formBuilder.group({
      code: ['', [Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]],
      fullName: ['', [Validators.required]],
      position: ['', [Validators.required]],
      degree: ['', [Validators.required]],
      part: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern(/^\d{9}(\d{3})?$/)]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]]
    });
  }
  addNewEmployee() {
    this.employeeService.addNewEmployee(this.formAddNewEmployee.value).subscribe(data => {
      this.router.navigateByUrl('employee-list');
    });

    console.log(this.formAddNewEmployee);
  }
}

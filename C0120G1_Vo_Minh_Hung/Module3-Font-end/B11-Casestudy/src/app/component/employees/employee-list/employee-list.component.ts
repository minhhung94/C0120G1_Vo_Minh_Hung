import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Employee} from '../../../model/employee';
import {EmployeeService} from '../../../services/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public employees: Employee[];

  constructor(public employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.subscription = this.employeeService.getAllEmployees().subscribe((data: Employee[]) => {
      this.employees = data;
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  onDeleteEmployee(id: number) {
    this.subscription = this.employeeService.deleteEmployee(id).subscribe((data: Employee) => {
      this.updateDataAfterDelete(id);
    });
  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.employees.length; i++) {
      // tslint:disable-next-line:triple-equals
      if (this.employees[i].id == id) {
        this.employees.splice(i, 1);
        break;
      }
    }
  }
}

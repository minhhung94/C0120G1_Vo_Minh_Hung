import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Employee} from '../../../model/employee';
import {EmployeeService} from '../../../services/employee.service';
import {EmployeeDeleteComponent} from '../employee-delete/employee-delete.component';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public employees: Employee[];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.subscription = this.employeeService.getAllEmployees().subscribe((data: Employee[]) => {
      this.employees = data;
      this.totalRec = this.employees.length;
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  // onDeleteEmployee(id: number) {
  //   this.subscription = this.employeeService.deleteEmployee(id).subscribe((data: Employee) => {
  //     this.updateDataAfterDelete(id);
  //   });
  // }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.employees.length; i++) {
      // tslint:disable-next-line:triple-equals
      if (this.employees[i].id == id) {
        this.employees.splice(i, 1);
        break;
      }
    }
  }
  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(dataOfEmployee => {
      const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
        width: '500px',
        data: {data1: dataOfEmployee},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();

      });
    });
  }
}

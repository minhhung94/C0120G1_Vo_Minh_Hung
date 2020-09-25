import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {EmployeeService} from '../../../services/employee.service';

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
  public employeeOfFullName;
  public employeeOfId;

  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public employeeService: EmployeeService,
  ) { }

  ngOnInit(): void {
    this.employeeOfFullName = this.data.data1.fullName;
    this.employeeOfId = this.data.data1.id;
  }
  deleteEmployee() {
    this.employeeService.deleteEmployee(this.employeeOfId).subscribe(data => {
      this.dialogRef.close();
    });
  }
}

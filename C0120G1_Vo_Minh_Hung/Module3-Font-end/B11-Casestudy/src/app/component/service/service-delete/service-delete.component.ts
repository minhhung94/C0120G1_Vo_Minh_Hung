import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-service-delete',
  templateUrl: './service-delete.component.html',
  styleUrls: ['./service-delete.component.css']
})
export class ServiceDeleteComponent implements OnInit {
  public serviceOfCode;
  public serviceOfId;

  constructor(
    public dialogRef: MatDialogRef<ServiceDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public serviceService: ServiceService
  ) { }

  ngOnInit(): void {
    this.serviceOfCode = this.data.data1.code;
    this.serviceOfId = this.data.data1.id;
  }
  deleteService() {
    this.serviceService.deleteService(this.serviceOfId).subscribe(data => {
      this.dialogRef.close();
    });
  }
}

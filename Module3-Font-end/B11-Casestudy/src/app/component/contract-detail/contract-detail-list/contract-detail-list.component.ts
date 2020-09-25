import { Component, OnInit } from '@angular/core';
import {ContractDetailService} from '../../../services/contract-detail.service';
import {MatDialog} from '@angular/material/dialog';
import {Subscription} from 'rxjs';
import {ContractDetailDeleteComponent} from '../contract-detail-delete/contract-detail-delete.component';

@Component({
  selector: 'app-contract-detail-list',
  templateUrl: './contract-detail-list.component.html',
  styleUrls: ['./contract-detail-list.component.css']
})
export class ContractDetailListComponent implements OnInit {
  public contractDetails;
  public totalRec: number;
  public page = 1;
  public searchText;
  public subscription: Subscription;

  constructor(
    public contractDetailService: ContractDetailService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.contractDetailService.getAllContractDetail().subscribe(data => {
      this.contractDetails = data;
      console.log(this.contractDetails);
    });
  }

  openDialog(contractDetailId): void {
    this.contractDetailService.getContractDetailById(contractDetailId).subscribe(dataOfContractDetail => {
      const dialogRef = this.dialog.open(ContractDetailDeleteComponent, {
        width: '500px',
        data: {data1: dataOfContractDetail},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();

      });
    });
  }
}

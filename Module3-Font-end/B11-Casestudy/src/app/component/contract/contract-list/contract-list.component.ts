import {Component, OnDestroy, OnInit} from '@angular/core';
import {Subscription} from 'rxjs';
import {Contract} from '../../../model/contract';
import {ContractService} from '../../../services/contract.service';
import {MatDialog} from '@angular/material/dialog';
import {ContractDeleteComponent} from '../contract-delete/contract-delete.component';

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public contracts: Contract[];
  public totalRec: number;
  public page = 1;
  public searchText;
  public totalMoneyOfAllService = 0;

  constructor(
    public contractService: ContractService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.subscription = this.contractService.getAllContracts().subscribe((data: Contract[]) => {
      this.contracts = data;
      this.totalRec = this.contracts.length;
      // tslint:disable-next-line:prefer-for-of
      // for (let i = 0; i < this.contracts.length; i++) {
      //   this.totalMoneyOfAllService =  (this.totalMoneyOfAllService) * 1 + (this.contracts[i].total) * 1;
      // }
      let sum = 0;
      // tslint:disable-next-line:prefer-for-of
      for (let i = 0; i < this.contracts.length; i++) {
        sum += this.contracts[i].total;
      }
      this.totalMoneyOfAllService = sum;
      this.totalRec = this.contracts.length;

    });
  }

  // updateDataAfterDelete(id: number) {
  //   for (let i = 0; i < this.contracts.length; i++) {
  //     // tslint:disable-next-line:triple-equals
  //     if (this.contracts[i].id == id) {
  //       this.contracts.splice(i, 1);
  //       break;
  //     }
  //   }
  // }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  openDialog(contractId): void {
    this.contractService.getContractById(contractId).subscribe(dataOfContract => {
      const dialogRef = this.dialog.open(ContractDeleteComponent, {
        width: '500px',
        height: '200px',
        data: {data1: dataOfContract},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }
}

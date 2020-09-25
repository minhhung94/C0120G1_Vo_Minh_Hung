import {Component, OnDestroy, OnInit} from '@angular/core';
import {CustomerService} from '../../../services/customer.service';
import {Customer} from '../../../model/customer';
import {Subscription} from 'rxjs';
import {MatDialog} from '@angular/material/dialog';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public customers: Customer[];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.subscription = this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
      this.totalRec = this.customers.length;
    });
  }

  // onDeleteCustomer(id: number) {
  //   this.subscription = this.customerService.deleteCustomer(id).subscribe((data: Customer) => {
  //     this.updateDataAfterDelete(id);
  //   });
  // }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.customers.length; i++) {
      // tslint:disable-next-line:triple-equals
      if (this.customers[i].id == id) {
        this.customers.splice(i, 1);
        break;
      }
    }
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
  openDialog(customerId): void {
    this.customerService.getCustomerById(customerId).subscribe(dataOfCustomer => {
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '500px',
        height: '200px',
        data: {data1: dataOfCustomer},
        disableClose: true,
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }
}

import {Component, OnDestroy, OnInit} from '@angular/core';
import {CustomerService} from '../../../services/customer.service';
import {Customer} from '../../../model/customer';
import {Subscription} from 'rxjs';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public customers: Customer[];

  constructor(public customerService: CustomerService) { }

  ngOnInit(): void {
    this.subscription = this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
    });
  }

  onDeleteCustomer(id: number) {
    this.subscription = this.customerService.deleteCustomer(id).subscribe((data: Customer) => {
      this.updateDataAfterDelete(id);
    });
  }

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
}

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EmployeeListComponent} from './component/employees/employee-list/employee-list.component';
import {EmployeeAddComponent} from './component/employees/employee-add/employee-add.component';
import {EmployeeEditComponent} from './component/employees/employee-edit/employee-edit.component';
import {CustomerListComponent} from './component/customer/customer-list/customer-list.component';
import {CustomerAddComponent} from './component/customer/customer-add/customer-add.component';
import {CustomerEditComponent} from './component/customer/customer-edit/customer-edit.component';
import {ContractListComponent} from './component/contract/contract-list/contract-list.component';
import {ContractAddComponent} from './component/contract/contract-add/contract-add.component';
import {ContractEditComponent} from './component/contract/contract-edit/contract-edit.component';
import {ServiceListComponent} from './component/service/service-list/service-list.component';
import {ServiceAddComponent} from './component/service/service-add/service-add.component';
import {ServiceEditComponent} from './component/service/service-edit/service-edit.component';
import {ContractDetailListComponent} from './component/contract-detail/contract-detail-list/contract-detail-list.component';
import {ContractDetailAddComponent} from './component/contract-detail/contract-detail-add/contract-detail-add.component';
import {ContractDetailEditComponent} from './component/contract-detail/contract-detail-edit/contract-detail-edit.component';


const routes: Routes = [
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-add', component: EmployeeAddComponent},
  {path: 'employee-edit/:id', component: EmployeeEditComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-add', component: CustomerAddComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent},
  {path: 'service-list', component: ServiceListComponent},
  {path: 'service-add', component: ServiceAddComponent},
  {path: 'service-edit/:id', component: ServiceEditComponent},
  {path: 'contract-list', component: ContractListComponent},
  {path: 'contract-add', component: ContractAddComponent},
  {path: 'contract-edit/:id', component: ContractEditComponent},
  {path: 'contract-detail-list', component: ContractDetailListComponent},
  {path: 'contract-detail-add', component: ContractDetailAddComponent},
  {path: 'contract-detail-edit/:id', component: ContractDetailEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerAddComponent } from './component/customer/customer-add/customer-add.component';
import { CustomerEditComponent } from './component/customer/customer-edit/customer-edit.component';
import { CustomerListComponent } from './component/customer/customer-list/customer-list.component';
import { HomeComponent } from './component/home/home.component';
import { EmployeeAddComponent } from './component/employees/employee-add/employee-add.component';
import { EmployeeEditComponent } from './component/employees/employee-edit/employee-edit.component';
import { EmployeeListComponent } from './component/employees/employee-list/employee-list.component';
import { ContractAddComponent } from './component/contract/contract-add/contract-add.component';
import { ContractEditComponent } from './component/contract/contract-edit/contract-edit.component';
import { ContractListComponent } from './component/contract/contract-list/contract-list.component';
import {HttpClientModule} from '@angular/common/http';
import {MatDialogModule} from '@angular/material/dialog';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MAT_DATE_LOCALE, MatNativeDateModule} from '@angular/material/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import { ServiceAddComponent } from './component/service/service-add/service-add.component';
import { ServiceEditComponent } from './component/service/service-edit/service-edit.component';
import { ServiceListComponent } from './component/service/service-list/service-list.component';
import { ContractDetailAddComponent } from './component/contract-detail/contract-detail-add/contract-detail-add.component';
import { ContractDetailEditComponent } from './component/contract-detail/contract-detail-edit/contract-detail-edit.component';
import { ContractDetailListComponent } from './component/contract-detail/contract-detail-list/contract-detail-list.component';
import { CustomerDeleteComponent } from './component/customer/customer-delete/customer-delete.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { ContractDeleteComponent } from './component/contract/contract-delete/contract-delete.component';
import { ContractDetailDeleteComponent } from './component/contract-detail/contract-detail-delete/contract-detail-delete.component';


@NgModule({
  declarations: [
    AppComponent,
    CustomerAddComponent,
    CustomerEditComponent,
    CustomerListComponent,
    HomeComponent,
    EmployeeAddComponent,
    EmployeeEditComponent,
    EmployeeListComponent,
    ContractAddComponent,
    ContractEditComponent,
    ContractListComponent,
    ServiceAddComponent,
    ServiceEditComponent,
    ServiceListComponent,
    ContractDetailAddComponent,
    ContractDetailEditComponent,
    ContractDetailListComponent,
    CustomerDeleteComponent,
    ContractDeleteComponent,
    ContractDetailDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgxPaginationModule,
    HttpClientModule,
    MatDialogModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    FormsModule,
    Ng2SearchPipeModule
  ],

  providers: [{provide: MAT_DATE_LOCALE, useValue: 'en-GB'}],
  bootstrap: [AppComponent],
})
export class AppModule { }

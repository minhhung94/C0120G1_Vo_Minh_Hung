import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerAddComponent } from './component/customer/customer-add/customer-add.component';
import { CustomerDeleteComponent } from './component/customer/customer-delete/customer-delete.component';
import { CustomerEditComponent } from './component/customer/customer-edit/customer-edit.component';
import { CustomerListComponent } from './component/customer/customer-list/customer-list.component';
import { HomeComponent } from './component/home/home.component';
import { EmployeeAddComponent } from './component/employees/employee-add/employee-add.component';
import { EmployeeEditComponent } from './component/employees/employee-edit/employee-edit.component';
import { EmployeeListComponent } from './component/employees/employee-list/employee-list.component';
import {Ng2FilterPipeModule} from 'ng2-filter-pipe';
import { ContractAddComponent } from './component/contract/contract-add/contract-add.component';
import { ContractEditComponent } from './component/contract/contract-edit/contract-edit.component';
import { ContractListComponent } from './component/contract/contract-list/contract-list.component';
import {HttpClientModule} from '@angular/common/http';
import {MatDialogModule} from '@angular/material/dialog';
import {ReactiveFormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';


@NgModule({
  declarations: [
    AppComponent,
    CustomerAddComponent,
    CustomerDeleteComponent,
    CustomerEditComponent,
    CustomerListComponent,
    HomeComponent,
    EmployeeAddComponent,
    EmployeeEditComponent,
    EmployeeListComponent,
    ContractAddComponent,
    ContractEditComponent,
    ContractListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    Ng2FilterPipeModule,
    HttpClientModule,
    MatDialogModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatFormFieldModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

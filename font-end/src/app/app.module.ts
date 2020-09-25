import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EquipmentAddComponent } from './component/equipment/equipment-add/equipment-add.component';
import { EquipmentEditComponent } from './component/equipment/equipment-edit/equipment-edit.component';
import { EquipmentListComponent } from './component/equipment/equipment-list/equipment-list.component';
import { EquipmentDeleteComponent } from './component/equipment/equipment-delete/equipment-delete.component';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import {MatDialogModule, MatFormFieldModule} from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    EquipmentAddComponent,
    EquipmentEditComponent,
    EquipmentListComponent,
    EquipmentDeleteComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatDialogModule,
    MatFormFieldModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents:[
    EquipmentAddComponent,
    EquipmentEditComponent,
    EquipmentDeleteComponent]
})
export class AppModule { }

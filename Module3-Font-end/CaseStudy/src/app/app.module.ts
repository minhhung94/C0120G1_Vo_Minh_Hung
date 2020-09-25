import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LayoutComponent } from './layout/layout.component';
import { ServiceComponent } from './service/service.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AddComponent } from './service/add/add.component';
import { EditComponent } from './service/edit/edit.component';
import { DeleteComponent } from './service/delete/delete.component';
import { TodoComponent } from './todo/todo.component';

@NgModule({
  declarations: [
    AppComponent,
    LayoutComponent,
    ServiceComponent,
    AddComponent,
    EditComponent,
    DeleteComponent,
    TodoComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

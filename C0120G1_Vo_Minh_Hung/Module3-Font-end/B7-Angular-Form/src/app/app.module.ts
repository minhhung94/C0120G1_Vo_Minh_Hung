import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RegisterFormComponent } from './register-form/register-form.component';
import {ReactiveFormsModule} from '@angular/forms';
import { TodoComponent } from './todo/todo.component';
import { LoginComponent } from './login/login.component';
import { MotoFormComponent } from './moto-form/moto-form.component';
import { MenuComponent } from './menu/menu.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterFormComponent,
    TodoComponent,
    LoginComponent,
    MotoFormComponent,
    MenuComponent
  ],
    imports: [
        BrowserModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

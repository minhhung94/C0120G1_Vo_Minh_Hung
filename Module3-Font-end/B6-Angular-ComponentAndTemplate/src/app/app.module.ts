import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NameCardComponent } from './name-card/name-card.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { RatingBarComponent } from './rating-bar/rating-bar.component';
import {FormsModule} from '@angular/forms';
import { RatingBar2Component } from './rating-bar2/rating-bar2.component';
import { CountdownTimerComponent } from './countdown-timer/countdown-timer.component';
import { HocAngularComponent } from './hoc-angular/hoc-angular.component';

@NgModule({
  declarations: [
    AppComponent,
    NameCardComponent,
    ProgressBarComponent,
    RatingBarComponent,
    RatingBar2Component,
    CountdownTimerComponent,
    HocAngularComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

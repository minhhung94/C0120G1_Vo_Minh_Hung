import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hoc-angular',
  templateUrl: './hoc-angular.component.html',
  styleUrls: ['./hoc-angular.component.css']
})
export class HocAngularComponent implements OnInit {
  name = '';
  constructor() { }

  ngOnInit() {
  }

  // showEvent(event) {
  //   this.name = event.target.value;
  //   console.log(event);
  // }
}

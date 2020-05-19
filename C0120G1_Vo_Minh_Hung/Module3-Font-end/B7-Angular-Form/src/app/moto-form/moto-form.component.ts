import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-moto-form',
  templateUrl: './moto-form.component.html',
  styleUrls: ['./moto-form.component.css']
})
export class MotoFormComponent implements OnInit {
  motoForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
  }

}

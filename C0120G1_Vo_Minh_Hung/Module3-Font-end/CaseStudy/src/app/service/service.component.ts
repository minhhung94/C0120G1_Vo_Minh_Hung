import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}
@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {
  registerForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.registerForm = this.fb.group({
      service_name: ['', Validators.required],
      service_type: ['', Validators.required],
      area_used: ['', [Validators.required]],
      type_rent: ['', [Validators.required]],
      rental: ['', [Validators.required]],
      max_number: ['', [Validators.required]],
      phone: ['', [Validators.required, Validators.pattern(/^\(\+84\)\d{9,10}$/)]]
    });

    // update form state
    this.registerForm.patchValue({
     service_name : 'SV-'
    });
  }
  onSubmit() {
    console.log(this.registerForm);
  }
}

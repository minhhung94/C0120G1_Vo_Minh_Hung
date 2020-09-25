import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HocAngularComponent } from './hoc-angular.component';

describe('HocAngularComponent', () => {
  let component: HocAngularComponent;
  let fixture: ComponentFixture<HocAngularComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HocAngularComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HocAngularComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

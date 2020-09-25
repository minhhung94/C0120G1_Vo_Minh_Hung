import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RatingBar2Component } from './rating-bar2.component';

describe('RatingBar2Component', () => {
  let component: RatingBar2Component;
  let fixture: ComponentFixture<RatingBar2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RatingBar2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RatingBar2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

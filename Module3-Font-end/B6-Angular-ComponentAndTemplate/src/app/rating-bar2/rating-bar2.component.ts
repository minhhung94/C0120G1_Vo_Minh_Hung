import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';
interface IRatingUnit {
  value: number;
  active: boolean;
}
@Component({
  selector: 'app-rating-bar2',
  templateUrl: './rating-bar2.component.html',
  styleUrls: ['./rating-bar2.component.css']
})
export class RatingBar2Component implements OnInit, OnChanges {
  @Input()
  max = 10;
  @Input()
  ratingValue = 10;
  @Input()
  showRatingValue = true;

  @Output()
  rateChange = new EventEmitter<number>();

  ratingUnits: Array<IRatingUnit> = [];

  constructor() { }

  ngOnInit() {
    this.calculate(this.max, this.ratingValue);
  }

  ngOnChanges(changes: SimpleChanges): void {
    if ('max' in changes) {
      let max = changes.max.currentValue;
      max = typeof max === 'undefined' ? 10 : max;
      this.max = max;
      this.calculate(max, this.ratingValue);
    }
  }
  calculate(max, ratingValue) {
    this.ratingUnits = Array.from({length: max},
      (_, index) => ({
        value: index + 1,
        active: index < ratingValue
      }));
  }
  select(index) {
    this.ratingValue = index + 1;
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.ratingValue);
    this.rateChange.emit(this.ratingValue);
  }

  enter(index) {
    this.ratingUnits.forEach((item, idx) => item.active = idx <= index);
  }

  reset() {
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.ratingValue);
  }

}

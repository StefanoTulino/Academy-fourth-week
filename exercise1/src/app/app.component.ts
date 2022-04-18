import { Component, OnInit, Output, EventEmitter} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  value: any;
  title = 'exercise1';

  allItems= [
    { value: 'Javascript' },
    { value: 'Python' },
    { value: 'Angular' },
    { value: 'React' },
    { value: 'Vue.js' },
  ];

  ngOnInit(): void {

  }

  @Output() remove: EventEmitter<string> = new EventEmitter<string>();

  get items() {
    return this.value;
  }


  addItem() {
    this.allItems.unshift({
      value: this.value
  })

}

removeItem() {
  this.allItems.shift()

}

}

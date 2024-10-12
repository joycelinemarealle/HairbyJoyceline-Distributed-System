import {Component, inject} from '@angular/core';
import {CommonModule} from '@angular/common'
import {ActivatedRoute} from "@angular/router";
import {HairService} from "../hair.service";
import {HairStyle} from "../hair-style";

@Component({
  selector: 'app-details',
  standalone: true,
  imports: [],
  templateUrl: './details.component.html',
  styleUrl: './details.component.css'
})
export class DetailsComponent {
  route : ActivatedRoute = inject(ActivatedRoute);
  hairServiceId = -1;
  constructor (){
    this.hairServiceId = Number(this.route.snapshot.params['id']);
  }
}

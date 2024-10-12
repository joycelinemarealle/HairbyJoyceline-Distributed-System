import {Component, inject} from '@angular/core';
import {CommonModule} from '@angular/common'
import {ActivatedRoute} from "@angular/router";
import {HairService} from "../hair.service";
import {HairStyle} from "../hair-style";
import {HairStyleComponent} from "../hair-style/hair-style.component";

@Component({
  selector: 'app-details',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './details.component.html',
  styleUrl: './details.component.css'
})
export class DetailsComponent {
  route : ActivatedRoute = inject(ActivatedRoute);
  hairService = inject (HairService)
  hairStyle: HairStyle | undefined
  hairStyleId = -1;
  constructor (){
    const hairStyleId = Number (this.route.snapshot.params['id']);
    this.hairStyle = this.hairService.getHairStyleById(hairStyleId);
  }
}

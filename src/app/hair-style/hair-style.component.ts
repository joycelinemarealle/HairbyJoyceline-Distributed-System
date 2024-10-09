import { Component, Input } from '@angular/core';
import {CommonModule} from "@angular/common";
import {HairStyle} from '../hair-style';


@Component({
  selector: 'app-hair-style',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './hair-style.component.html',
  styleUrl: './hair-style.component.css'
})
export class HairStyleComponent {
@Input() hairStyle!: HairStyle;
}

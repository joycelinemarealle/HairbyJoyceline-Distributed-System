import { Component, Input } from '@angular/core';
import {CommonModule} from "@angular/common";
import {HairStyle} from '../hair-style';
import {RouterLink} from "@angular/router";
import {RouterOutlet} from "@angular/router";


@Component({
  selector: 'app-hair-style',
  standalone: true,
  imports: [CommonModule, RouterLink, RouterOutlet],
  templateUrl: './hair-style.component.html',
  styleUrl: './hair-style.component.css'
})
export class HairStyleComponent {
@Input() hairStyle!: HairStyle;
}

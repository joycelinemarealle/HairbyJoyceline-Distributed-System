import {Component, inject} from '@angular/core';
import {CommonModule} from "@angular/common";
import {HairStyleComponent} from '../hair-style/hair-style.component';
import {HairStyle} from '../hair-style';
import {HairService} from "../hair.service";


@Component({
    selector: 'app-home',
    standalone: true,
    imports: [CommonModule, HairStyleComponent],
    templateUrl: './home.component.html',
    styleUrl: './home.component.css'
})
export class HomeComponent {
    hairStyleList: HairStyle [] = []
    hairStyLe: HairService = inject(HairService)
    constructor(){
        this.hairStyleList = this.hairStyLe.getAllHairStyles()
    }
/**/
}

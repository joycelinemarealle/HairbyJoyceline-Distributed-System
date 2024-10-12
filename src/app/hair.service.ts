import { Injectable } from '@angular/core';
import {HairStyle} from "./hair-style";

@Injectable({
  providedIn: 'root'
})
export class HairService {
  protected hairStyleList: HairStyle [] =   [{
    id: 1,
    name: 'Small Boho braids',
    photo: '/assets/Boho braids.jfif',
    price: '$200',
    duration : " 7 hours"
  },

{
  id: 2,
  name: 'Small Box braids',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
},

{
  id: 3,
    name: 'Medium box braids',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
}
,
{
  id: 4,
    name: 'Large box braids',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
}
,
{
  id: 5,
    name: 'Fulani braids',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
},

{
  id: 6,
    name: 'Large Bob braids',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
},
{
  id: 7,
    name: ' Starter locs Extension',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
},

{
  id: 8,
    name: ' Starter locs',
  photo: '/assets/Boho braids.jfif',
  price: '$200',
  duration : " 7 hours"
},
]

  getAllHairStyles(): HairStyle[] {
    return this.hairStyleList
  }
  getHairStyleById(id: number): HairStyle | undefined {
    /*search entire list and find hairstyle by ID..*/
    return this.hairStyleList.find((hairStyle) => hairStyle.id === id)
  }
}

import { Component, OnInit } from '@angular/core';
import { ExploreService } from '../services/explore.service';
import { Explore } from '../../models/explore';

@Component({
  selector: 'app-explore',
  templateUrl: './explore.component.html',
  styleUrls: ['./explore.component.css']
})
export class ExploreComponent implements OnInit {

  explores: Explore[];

  constructor(private exploreService: ExploreService) { }

  ngOnInit(): void {
    this.getExplores();
  }

  getExplores(): void {
    this.exploreService.getExplores()
      .subscribe(explores => this.explores = explores);
  }

}
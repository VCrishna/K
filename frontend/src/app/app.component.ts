import { Component } from '@angular/core';
import { ProblemService } from './services/problem.service';
import { ExploreService } from './services/explore.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Placement Preparation Tracker';

  constructor(private problemService: ProblemService, private exploreService: ExploreService) { }

  ngOnInit() {
    this.problemService.fetchProblems();
    this.exploreService.fetchExploreItems();
  }
}
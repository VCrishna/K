import { Component, OnInit } from '@angular/core';
import { Problem } from '../models/problem.model';
import { ProblemService } from '../services/problem.service';

@Component({
  selector: 'app-problems',
  templateUrl: './problems.component.html',
  styleUrls: ['./problems.component.css']
})
export class ProblemsComponent implements OnInit {

  problems: Problem[] = [];

  constructor(private problemService: ProblemService) { }

  ngOnInit(): void {
    this.getProblems();
  }

  getProblems(): void {
    this.problemService.getProblems().subscribe(problems => this.problems = problems);
  }

}
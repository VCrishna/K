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
    this.problemService.getProblems().subscribe(
      (data: Problem[]) => {
        this.problems = data;
      },
      (error: any) => {
        console.error('Error: ', error);
      }
    );
  }

  addProblem(problem: Problem): void {
    this.problemService.addProblem(problem).subscribe(
      (data: Problem) => {
        this.problems.push(data);
      },
      (error: any) => {
        console.error('Error: ', error);
      }
    );
  }

  updateProblem(problem: Problem): void {
    this.problemService.updateProblem(problem).subscribe(
      (updatedProblem: Problem) => {
        this.problems = this.problems.map(p => p.id === updatedProblem.id ? updatedProblem : p);
      },
      (error: any) => {
        console.error('Error: ', error);
      }
    );
  }

  deleteProblem(id: number): void {
    this.problemService.deleteProblem(id).subscribe(
      (deletedProblem: Problem) => {
        this.problems = this.problems.filter(p => p.id !== deletedProblem.id);
      },
      (error: any) => {
        console.error('Error: ', error);
      }
    );
  }

}
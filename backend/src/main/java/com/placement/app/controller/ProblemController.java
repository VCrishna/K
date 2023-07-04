```java
package com.placement.app.controller;

import com.placement.app.model.Problem;
import com.placement.app.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@RequestMapping("/api/problems")
@Api(value = "Problem Management System")
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    @ApiOperation(value = "View a list of available problems", response = List.class)
    @GetMapping
    public List<Problem> getAllProblems() {
        return problemService.getAllProblems();
    }

    @ApiOperation(value = "Get a problem by Id")
    @GetMapping("/{id}")
    public ResponseEntity<Problem> getProblemById(@PathVariable(value = "id") Long problemId) {
        return problemService.getProblemById(problemId);
    }

    @ApiOperation(value = "Add a problem")
    @PostMapping
    public Problem createProblem(@RequestBody Problem problem) {
        return problemService.createProblem(problem);
    }

    @ApiOperation(value = "Update a problem")
    @PutMapping("/{id}")
    public ResponseEntity<Problem> updateProblem(@PathVariable(value = "id") Long problemId, @RequestBody Problem problemDetails) {
        return problemService.updateProblem(problemId, problemDetails);
    }

    @ApiOperation(value = "Delete a problem")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProblem(@PathVariable(value = "id") Long problemId) {
        return problemService.deleteProblem(problemId);
    }
}
```
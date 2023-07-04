```java
package com.placement.app.service;

import com.placement.app.model.Problem;
import com.placement.app.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    @Transactional
    public Problem addProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    @Transactional
    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    @Transactional
    public Problem getProblemById(Long id) {
        return problemRepository.findById(id).orElse(null);
    }

    @Transactional
    public Problem updateProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    @Transactional
    public void deleteProblem(Long id) {
        problemRepository.deleteById(id);
    }
}
```
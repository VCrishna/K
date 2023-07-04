```java
package com.placement.app.controller;

import com.placement.app.model.Explore;
import com.placement.app.service.ExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/explore")
public class ExploreController {

    @Autowired
    private ExploreService exploreService;

    @PostMapping
    public ResponseEntity<Explore> addExplore(@RequestBody Explore explore) {
        return ResponseEntity.ok(exploreService.addExplore(explore));
    }

    @GetMapping
    public ResponseEntity<List<Explore>> getAllExplores() {
        return ResponseEntity.ok(exploreService.getAllExplores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Explore> getExploreById(@PathVariable Long id) {
        return ResponseEntity.ok(exploreService.getExploreById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Explore> updateExplore(@PathVariable Long id, @RequestBody Explore explore) {
        return ResponseEntity.ok(exploreService.updateExplore(id, explore));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExplore(@PathVariable Long id) {
        exploreService.deleteExplore(id);
        return ResponseEntity.ok("Explore deleted successfully");
    }
}
```
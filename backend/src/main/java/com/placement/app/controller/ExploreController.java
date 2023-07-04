```java
package com.placement.app.controller;

import com.placement.app.model.Explore;
import com.placement.app.service.ExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@RequestMapping("/api/explore")
@Api(value = "Explore Controller", description = "Operations pertaining to explore in Placement Preparation Application")
public class ExploreController {

    @Autowired
    private ExploreService exploreService;

    @GetMapping
    @ApiOperation(value = "View a list of available explores", response = List.class)
    public ResponseEntity<List<Explore>> getAllExplores() {
        return ResponseEntity.ok(exploreService.getAllExplores());
    }
}
```
```java
package com.placement.app.service;

import com.placement.app.model.Explore;
import com.placement.app.repository.ExploreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExploreService {

    @Autowired
    private ExploreRepository exploreRepository;

    public List<Explore> getAllExplores() {
        return exploreRepository.findAll();
    }

    public Explore getExploreById(Long id) {
        return exploreRepository.findById(id).orElse(null);
    }

    public Explore createExplore(Explore explore) {
        return exploreRepository.save(explore);
    }

    public Explore updateExplore(Explore explore) {
        return exploreRepository.save(explore);
    }

    public void deleteExplore(Long id) {
        exploreRepository.deleteById(id);
    }
}
```
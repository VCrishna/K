```java
package com.placement.app.service;

import com.placement.app.model.Explore;
import com.placement.app.repository.ExploreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExploreService {

    @Autowired
    private ExploreRepository exploreRepository;

    @Transactional
    public List<Explore> getAllExplores() {
        return exploreRepository.findAll();
    }

    @Transactional
    public Explore getExploreById(Long id) {
        return exploreRepository.findById(id).orElse(null);
    }

    @Transactional
    public Explore addExplore(Explore explore) {
        return exploreRepository.save(explore);
    }

    @Transactional
    public Explore updateExplore(Explore explore) {
        return exploreRepository.save(explore);
    }

    @Transactional
    public void deleteExplore(Long id) {
        exploreRepository.deleteById(id);
    }
}
```
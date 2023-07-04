```java
package com.placement.app.repository;

import com.placement.app.model.Explore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExploreRepository extends JpaRepository<Explore, Long> {
}
```
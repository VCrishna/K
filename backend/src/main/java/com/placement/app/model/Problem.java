```java
package com.placement.app.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "problems")
public class Problem {

    @Id
    private Long id;

    private String title;

    private String description;

    private String difficulty;

    private String solvedStatus;

    private String url;

}
```
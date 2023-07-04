```sql
CREATE TABLE problem (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    solved BOOLEAN DEFAULT false,
    difficulty VARCHAR(50),
    url VARCHAR(255)
);

CREATE TABLE explore (
    id SERIAL PRIMARY KEY,
    topic VARCHAR(255) NOT NULL,
    description TEXT,
    url VARCHAR(255)
);
```
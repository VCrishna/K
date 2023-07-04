CREATE TABLE IF NOT EXISTS problems (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    difficulty VARCHAR(50),
    solved BOOLEAN DEFAULT FALSE,
    url VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS explore (
    id SERIAL PRIMARY KEY,
    topic VARCHAR(255) NOT NULL,
    description TEXT,
    url VARCHAR(255)
);
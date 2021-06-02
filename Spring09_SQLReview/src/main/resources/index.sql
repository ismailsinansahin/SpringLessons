select *
from towns
where name='903cd9ee9dcd6b0d491ef98dc3d542f0'
and article='a9c1428797719f18a453d44ce8a039ab';

CREATE INDEX idx_towns_name ON towns(name);
CREATE INDEX idx_towns_name ON towns(article);
CREATE INDEX idx_towns_name ON towns(code);

DROP INDEX IF EXISTS idx_towns_name;

SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;


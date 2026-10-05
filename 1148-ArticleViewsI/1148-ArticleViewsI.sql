-- Last updated: 10/5/2026, 10:07:55 AM
SELECT DISTINCT author_id AS id FROM Views
WHERE author_id = viewer_id
ORDER BY author_id ASC;
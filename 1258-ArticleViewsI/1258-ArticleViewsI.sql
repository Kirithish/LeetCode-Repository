-- Last updated: 2/25/2026, 9:09:20 AM
SELECT DISTINCT author_id AS id FROM Views
WHERE author_id = viewer_id
ORDER BY author_id ASC;
-- Last updated: 4/1/2026, 10:45:04 PM
SELECT
  score,
  DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM
  Scores
ORDER BY
  score DESC;

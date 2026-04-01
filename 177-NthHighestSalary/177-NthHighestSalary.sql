-- Last updated: 4/1/2026, 10:45:05 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
        SELECT DISTINCT(salary)
          FROM Employee
         ORDER BY salary DESC
         LIMIT 1
        OFFSET N
  );
END
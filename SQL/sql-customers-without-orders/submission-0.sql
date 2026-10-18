-- Write your query below
Select customers.name as name
FROM customers 
LEFT JOIN orders ON customers.id = orders.customer_id
Where orders.customer_id IS NULL;
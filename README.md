Diagrama de Relacionamento do Banco de Dados

+----------------+         +------------------+         +-------------------+         +------------------+
|      User      | 1 --- n |     Order        | 1 --- n |  OrderItem        | n --- 1 |    Product       |
|----------------|         |----------------- |         |-------------------|         |------------------|
| id (PK)        |         | id (PK)          |         | id (PK)           |         | id (PK)          |
| name           |         | user_id (FK)     |         | order_id (FK)     |         | name             |
| email          |         | order_date       |         | product_id (FK)   |         | description      |
| password       |         | total_price      |         | quantity          |         | price            |
| cart_id (FK)   |         | payment_id (FK)  |         | price_at_purchase |         | stock            |
+----------------+         +------------------+         +-------------------+         +------------------+
       | 1                           | 1
       |                             |
       | n                           | n
+----------------+         +-----------------+
|      Cart      | 1 --- 1 |     Payment     |
|----------------|         |-----------------|
| id (PK)        |         | id (PK)         |
| user_id (FK)   |         | order_id (FK)   |
+----------------+         | payment_method  |
                           | payment_date    |
                           +-----------------+



SELECT * FROM information_schema.TABLE_CONSTRAINTS 
WHERE information_schema.TABLE_CONSTRAINTS.CONSTRAINT_TYPE = 'FOREIGN KEY' 
AND information_schema.TABLE_CONSTRAINTS.TABLE_SCHEMA = 'public' LIMIT 100 OFFSET 0

# FOREIGN Key list

-- address_id, customer

-- actor_id, film_actor
-- film_id, film_actor

-- category_id, film_category
-- film_id, film_category

-- language_id, film

-- city_id, address

-- country_id, city

-- inventory_film_id_fkey, inventory

-- customer_id, payment
-- rental_id, payment
-- staff_id, payment

-- customer_id, rental
-- inventory_id, rental
-- staff_id, rental

-- address_id, staff   (staff_address_id_fkey)

-- address_id, store
-- staff_id, store   (manager_staff_id)
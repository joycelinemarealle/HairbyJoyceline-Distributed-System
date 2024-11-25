INSERT INTO  hair_business.customers ( full_name,email,  phone_number)
VALUES
    ( 'Joyceline Marealle','jj@gmail.com', 59596987),
    ( 'Eva Marealle', 'em@gmail.com', 456789),
    ( 'Elton Jacob','es@gmail.com', 789090 )
ON CONFLICT DO NOTHING;
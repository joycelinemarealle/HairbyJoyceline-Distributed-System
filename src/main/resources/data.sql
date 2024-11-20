INSERT INTO  hair_business.customers (phone_number, email, full_name)
VALUES
    ( 59596987, 'jj@gmail.com', 'Joyceline Marealle'),
    ( 3456789, 'em@gmail.com', 'Eva Marealle'),
    ( 789090, 'es@gmail.com', 'Elton Jacob')
ON CONFLICT DO NOTHING;
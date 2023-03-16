INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Zabdiel', 'Diaz', 'Dragomcitos'),
('Felpe', 'Maqueda', 'Chilaquiles Verdes'),
('Fernando', 'Aguilar', 'Carne Asada');

INSERT INTO `pets`
(first_name, fav_food, type_pets, Tabla_idTabla)
VALUES
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo', 2),
('Pepperoni', 'Huesitos de manzanas', 'Doggo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

INSERT INTO `pets`
(first_name, fav_food, type_pets, Tabla_idTabla)
VALUES
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con tortillitas', 'Doggo', 2),
('Pepperoni', 'Huesitos de manzanas', 'Doggo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- INSERTAR UN USUARIO Y UNA MASCOTA

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Daniel', 'Guzman', 'Pizza');

INSERT INTO `pets`
(first_name, las_name, type_pets, Tabla_idTabla)
VALUES 
('Maya', 'Lobita', 'HUSKY', 4);

-- Bryan

INSERT INTO users
(first_name, last_name, fav_food)
VALUES
('Alejandro', 'Hernandez', 'Lasagna');

insert into `pets`
(first_name, fav_food, `type`, users_idusers)
values
('Niebla', 'Pollo', 'Pug', 4);

-- Antonio

insert into users 
(First_name,Last_name,Fav_food)
values 
('Jose Antonio','Haro Gonzalez','Chimichangas');

insert into pets
(First_name,Last_name,Fav_food,`Type`,Users_idUsers)
values
('Zorrillo','Gamboa','Carne','Doggo',4);

-- Cesar

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Cesar', 'Reyes', 'Carnita Asada');

INSERT INTO `pets`
(first_name, last_name, fav_food, `type`, users_idusers)
VALUES
('Max', 'Reyes', 'Carne', 'Poodle', 4);

-- Ingrid

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES 
('Ian', 'Galeana', 'Tacos');

INSERT INTO `pets`
(first_name, `type`)
VALUES 
('Ezequiel', 'Gato', 4);

insert into bed_type(id,name) values(1,'Crib');
insert into bed_type(id,name) values(2,'Twin Bed');
insert into bed_type(id,name) values(3,'Twin XL Bed');
insert into bed_type(id,name) values(4,'Full Bed');
insert into bed_type(id,name) values(5,'Full XL Bed');
insert into bed_type(id,name) values(6,'Queen Bed');
insert into bed_type(id,name) values(7,'King Bed');
insert into bed_type(id,name) values(8,'California King Bed');

insert into homestay_type(id,name) values (1, 'Apartment');
insert into homestay_type(id,name) values (2, 'Villa');
insert into homestay_type(id,name) values (3, 'Studio Apartment');
insert into homestay_type(id,name) values (4, 'Alcove Studio');
insert into homestay_type(id,name) values (5, 'Convertible Studio');
insert into homestay_type(id,name) values (6, 'Entire House');
insert into homestay_type(id,name) values (7, 'Service Apartment');

insert into amenity (id,name) values(1, 'kitchen');
insert into amenity (id,name) values(2, 'swimming pool');
insert into amenity (id,name) values(3, 'Washing machine');
insert into amenity (id,name) values(4, 'Pet');
insert into amenity (id,name) values(5, 'Smoking Room');

insert into role (id,name) values(1, 'ADMIN');
insert into role (id,name) values(2, 'HOST');
insert into role (id,name) values(3, 'GUEST');

INSERT INTO user(id,email,firstName,lastName,password,status) VALUES ('1', 'user', 'User', 'Guest', '$2a$10$6e46Lg5hH3SkxcY6bMGV2e2ZifLP1mMcThw0SebUQnlaaHEmu11Bu', 1);
INSERT INTO user(id,email,firstName,lastName,password,status) VALUES ('2', 'host', 'Host', '1', '$2a$10$6Rhk4xe9trcrB0J2jkXdiO2onVP5SKF4syZ7n2Dodgi2kyU6EwCby', 1);

insert into user_role(user_id,role_id) values(1,3);
insert into user_role(user_id,role_id) values(2,2);

# INSERT INTO homestay(id, area, coverImage, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, overview, price, status, title, bedType_id, type_id, owner_id,address_id) VALUES (1, 100, 'https://images.unsplash.com/photo-1557899563-1940fc95709c', '3', '1', '2', '1', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s', '30', '1', 'Leaf Homestay', 1, 1, 2,1);
# insert into address(id,city,country,state,street,zipcode) values(1,'Fairfield','United States','IA','1000 N.4th str', '52556');


insert into bed_type(id,name) values(1,'Crib');
insert into bed_type(id,name) values(2,'Twin Bed');
insert into bed_type(id,name) values(3,'Twin XL Bed');
insert into bed_type(id,name) values(4,'Full Bed');
insert into bed_type(id,name) values(5,'Full XL Bed');
insert into bed_type(id,name) values(6,'Queen Bed');
insert into bed_type(id,name) values(7,'King Bed');
insert into bed_type(id,name) values(8,'California Bed');
insert into bed_type(id,name) values(9,'Luxury Bed Type 1');
insert into bed_type(id,name) values(10,'Luxury Bed Type 1');

insert into homestay_type(id,name) values (1, 'Apartment');
insert into homestay_type(id,name) values (2, 'Villa');
insert into homestay_type(id,name) values (3, 'Studio Apartment');
insert into homestay_type(id,name) values (4, 'Alcove Studio');
insert into homestay_type(id,name) values (5, 'Convertible Studio');
insert into homestay_type(id,name) values (6, 'Entire House');
insert into homestay_type(id,name) values (7, 'Service Apartment');
insert into homestay_type(id,name) values (8, 'Hotel');
insert into homestay_type(id,name) values (9, 'Share room');
insert into homestay_type(id,name) values (10, 'Share Apartment');

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

insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (1, 'Home', 24, 3, 2, 3, 3, 339, 1, 'Persevering intangible moderator', 'Homestay1.jpg', 3, 3, 2, 3);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (2, 'Industrial', 25, 10, 3, 3, 2, 514, 2, 'Object-based neutral knowledge user', 'Homestay2.jpg', 8, 3, 2, 5);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (3, 'Music', 18, 4, 9, 3, 10, 187, 2, 'Implemented intangible local area network', 'Homestay1.jpg', 10, 5, 1, 7);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (4, 'Books', 49, 4, 10, 2, 2, 247, 2, 'Self-enabling clear-thinking parallelism', 'Homestay2.jpg', 2, 7, 1, 2);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (5, 'Home', 45, 10, 5, 4, 8, 939, 2, 'Sharable foreground matrix', 'Homestay1.jpg', 7, 1, 1, 6);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (6, 'Shoes', 56, 5, 5, 4, 6, 913, 2, 'Grass-roots clear-thinking process improvement', 'Homestay2.jpg', 4, 2, 2, 1);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (7, 'Automotive', 94, 3, 6, 1, 5, 52, 1, 'Triple-buffered radical software', 'Homestay1.jpg', 3, 5, 1, 4);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (8, 'Health', 98, 2, 10, 4, 8, 225, 1, 'Future-proofed exuding moderator', 'Homestay2.jpg', 10, 4, 2, 8);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (9, 'Home', 61, 8, 2, 3, 6, 516, 1, 'Multi-tiered foreground local area network', 'Homestay1.jpg', 1, 2, 1, 10);
insert into homestay (id, title, area, maximumGuest, numberOfBathroom, numberOfBed, numberOfRoom, price, status, overview, coverImage, bedType_id, type_id, owner_id, address_id) values (10, 'Health', 52, 6, 10, 4, 6, 842, 2, 'Total intangible internet solution', 'Homestay2.jpg', 6, 4, 2, 9);

insert into Address (id, city, street, state, zipcode, country) values (1, 'Torrance', '53454 Sycamore Court', 'California', '90510', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (2, 'Washington', '14013 Crownhardt Parkway', 'District of Columbia', '20073', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (3, 'Springfield', '0 Red Cloud Place', 'Illinois', '62756', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (4, 'Fort Lauderdale', '24552 Glacier Hill Lane', 'Florida', '33355', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (5, 'Raleigh', '91645 Schmedeman Trail', 'North Carolina', '27626', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (6, 'Newport Beach', '6 Welch Parkway', 'California', '92662', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (7, 'Shreveport', '207 Columbus Point', 'Louisiana', '71130', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (8, 'Roanoke', '70739 Monument Drive', 'Virginia', '24004', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (9, 'Gulfport', '05692 Del Sol Pass', 'Mississippi', '39505', 'United States');
insert into Address (id, city, street, state, zipcode, country) values (10, 'Salem', '468 Debra Lane', 'Oregon', '97306', 'United States');

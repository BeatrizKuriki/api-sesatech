insert into tb_location(name,dimension, url, created) values('Earth (C-137)', 'Dimension C-137','https://rickandmortyapi.com/api/location/1', NOW());
insert into tb_location(name,dimension, url, created) values('Abadango','unknown','https://rickandmortyapi.com/api/location/2', NOW());
insert into tb_location(name,dimension, url, created) values('Citadel of Ricks','unknown','https://rickandmortyapi.com/api/location/3',NOW());
insert into tb_location(name,dimension, url, created) values('Worldender lair','unknown','https://rickandmortyapi.com/api/location/4', NOW());
insert into tb_location(name,dimension, url, created) values('Anatomy Park','Dimension C-137','https://rickandmortyapi.com/api/location/5',NOW());
insert into tb_location(name,dimension, url, created) values('Interdimensional Cable','unknown','https://rickandmortyapi.com/api/location/6', NOW());
insert into tb_location(name,dimension, url, created) values('Immortality Field Resort','unknown','https://rickandmortyapi.com/api/location/7', NOW());
insert into tb_location(name,dimension, url, created) values('Post-Apocalyptic Earth', 'Post-Apocalyptic Dimension','https://rickandmortyapi.com/api/location/8', NOW());
insert into tb_location(name,dimension, url, created) values('Purge Planet','Replacement Dimension','https://rickandmortyapi.com/api/location/9', NOW());
insert into tb_location(name,dimension, url, created) values('Venzenulon 7','unknown','https://rickandmortyapi.com/api/location/10', NOW());
insert into tb_location(name,dimension, url, created) values('Bepis 9','unknown','https://rickandmortyapi.com/api/location/11', NOW());
insert into tb_location(name,dimension, url, created) values('Cronenberg Earth','Cronenberg Dimension','https://rickandmortyapi.com/api/location/12',NOW());
insert into tb_location(name,dimension, url, created) values('Nuptia 4','unknown','https://rickandmortyapi.com/api/location/13', NOW());
insert into tb_location(name,dimension, url, created) values('Giant Town','Fantasy Dimension','https://rickandmortyapi.com/api/location/14',NOW());
insert into tb_location(name,dimension, url, created) values('Bird World','unknown','https://rickandmortyapi.com/api/location/15', NOW());
insert into tb_location(name,dimension, url, created) values('St. Gloopy Noops Hospital','unknown','https://rickandmortyapi.com/api/location/16',NOW());
insert into tb_location(name,dimension, url, created) values('Earth (5-126)','Dimension 5-126','https://rickandmortyapi.com/api/location/17', NOW());
insert into tb_location(name,dimension, url, created) values('Mr. Goldenfold dream','Dimension C-137','https://rickandmortyapi.com/api/location/18', NOW());
insert into tb_location(name,dimension, url, created) values('Gromflom Prime','Replacement Dimension','https://rickandmortyapi.com/api/location/19', NOW());
insert into tb_location(name,dimension, url, created) values('Earth (Replacement Dimension)','unknown','https://rickandmortyapi.com/api/location/20', NOW());




insert into tb_character1(name, status, species, gender,origin,location, img_Url, created) values('Rick Sanchez', 'ALIVE', 'Human', 'MALE','Earth (Replacement Dimension)','https://rickandmortyapi.com/api/location/1','https://rickandmortyapi.com/api/character/avatar/1.jpeg', NOW());
insert into tb_character1(name, status, species, gender,origin,location, img_Url, created) values('Morty Smith', 'ALIVE', 'Human', 'MALE','Venzenulon 7', 'https://rickandmortyapi.com/api/location/7','https://rickandmortyapi.com/api/character/avatar/2.jpeg', NOW());

INSERT INTO tb_location_character1(location_id,character1_id) values(1, 1);
INSERT INTO tb_location_character1(location_id,character1_id) values(1, 2);
INSERT INTO tb_location_character1(location_id,character1_id) values(2, 2);
INSERT INTO tb_location_character1(location_id,character1_id) values(2, 1);
INSERT INTO tb_location_character1(location_id,character1_id) values(3, 1);
INSERT INTO tb_location_character1(location_id,character1_id) values(3, 2);








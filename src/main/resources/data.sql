DROP TABLE IF EXISTS player;

CREATE TABLE player (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  code_name VARCHAR(50) NOT NULL,
  fight_skill VARCHAR(100) DEFAULT NULL,
  strength INT  DEFAULT 20 
);

INSERT INTO player (code_name, fight_skill, strength) VALUES
  ('Harsh', 'Fire', 80),
  ('Satya', 'Water', 90),
  ('Ananad', 'Earth', 80),
   ('Brian', 'Air', 90);
   
   
   
DROP TABLE IF EXISTS team_scenario;

CREATE TABLE team_scenario (

  sa_id INT  NOT NULL,
  player_id INT NOT NULL,
  code_name VARCHAR(50) NOT NULL,
  fight_skill VARCHAR(100) DEFAULT NULL,
  strength INT  DEFAULT 20 
);

INSERT INTO team_scenario (sa_id, player_id,code_name, fight_skill, strength) VALUES
  (100,1,'Harsh', 'Fire', 80),
  (100,2,'Satya', 'Water', 90),
  (100,3,'Ananad', 'Earth', 80),
  (100,4,'Brian', 'Air', 90),
  
  (200,1,'Harsh', 'Fire', 90),
  (200,2,'Satya', 'Water', 89),
  (200,3,'Ananad', 'Earth', 87),
  (200,4,'Brian', 'Air', 34),
  
  (300,1,'Harsh', 'Fire', 23),
  (300,2,'Satya', 'Water', 23),
  (300,3,'Ananad', 'Earth', 45),
  (300,4,'Brian', 'Air', 78);   
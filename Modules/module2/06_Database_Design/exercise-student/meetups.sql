DROP TABLE IF EXISTS event_member;
DROP TABLE IF EXISTS group_member;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS meetup_group;
DROP TABLE IF EXISTS member;

CREATE TABLE member(
        member_id SERIAL,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(50),
        email VARCHAR(100),
        phone VARCHAR(15),
        DOB VARCHAR(20),
        remind_me BOOLEAN,
        
        CONSTRAINT pk_member_id PRIMARY KEY (member_id)

);


CREATE TABLE meetup_group(
       group_id SERIAL,
       name VARCHAR(50) UNIQUE,
       CONSTRAINT pk_group_id PRIMARY KEY (group_id)
        

);

CREATE TABLE event(
        event_id SERIAL,
        group_id INTEGER NOT NULL,
        name VARCHAR(50),
        description VARCHAR(200),
        date_time TIMESTAMP,
        duration INTEGER,
        
       CONSTRAINT chk_duration CHECK (duration >= 30),
       CONSTRAINT pk_event_id PRIMARY KEY (event_id),
       CONSTRAINT fk_group_id FOREIGN KEY (group_id) REFERENCES meetup_group(group_id)
        
);


CREATE TABLE group_member(
        group_id INT NOT NULL,
        member_id  INT NOT NULL,
        
        CONSTRAINT pk_group_member PRIMARY KEY(group_id, member_id),
        CONSTRAINT fk_group_id FOREIGN KEY (group_id) REFERENCES meetup_group(group_id),
        CONSTRAINT fk_member_id FOREIGN KEY (member_id) REFERENCES member(member_id)
               
);

CREATE TABLE event_member(
        event_id INT NOT NULL,
        member_id  INT NOT NULL,
        
        CONSTRAINT pk_event_member PRIMARY KEY(event_id, member_id),
        CONSTRAINT fk_event_id FOREIGN KEY (event_id) REFERENCES event(event_id),
        CONSTRAINT fk_member_id FOREIGN KEY (member_id) REFERENCES member(member_id)
               
);


INSERT INTO member( first_name, last_name ,email ,phone ,DOB ,remind_me )
VALUES('Sarah', 'Jonas', 'sarah.j@abc.com', '123-4567-890', '1990-10-18', true),
      ('Ana', 'Green', 'ana.g@abc.com', '234-5678-901', '1990-12-11', true),
      ('Nikita', 'Geller', 'nikita.g@abc.com', '345-6789-012', '1994-02-02', false),
      ('Casa', 'Shelly', 'casa.s@abc.com', '456-7890-123', '1998-10-14', true),
      ('Alana', 'Issel', 'alana.i@abc.com', '567-8901-234', '1993-09-10', false),
      ('Miya', 'Gibbons', 'miya.g@abc.com', '678-9012-345', '1999-05-26', true),
      ('Riya', 'Blair', 'riya.b@abc.com', '789-0123-456', '1997-08-06', false),
      ('Chris', 'Schroeder', 'chris.s@abc.com', '890-1234-567', '1994-11-28', true),
      ('Bob', 'Joseph', 'bob.j@abc.com', '901-2345-678', '1997-06-22', false),
      ('Patrick', 'White', 'patrick.w@abc.com', '012-3456-789', '1989-08-05', true);
      
INSERT INTO meetup_group(name)
                VALUES('Java group'),
                      ('JavaScript group'),
                      ('Database group');



INSERT INTO event(group_id, name, description, date_time, duration)
       VALUES(1,'Software chasers','coding event for emerging developers to provide them experience of evolving technologies.','2021-06-22 15:00:00', 60 ),
            (3,'App monsters','event for the candidate who love to make mobile app','2021-06-25 16:00:00', 120),
            (2,'Bytecode velocity', ' event to enhance the knowledge of bytecode.', '2021-06-30 18:00:00', 90) ,
            (1,'Java Coders','event for java students to overview the key concepts of java', '2021-07-05 15:00:00', 180);  
            
     
INSERT INTO group_member(group_id, member_id)
        VALUES(1,1),
              (1,2),
              (2,3),
              (2,4),
              (3,5),
              (3,6);
              
INSERT INTO event_member(event_id, member_id)
VALUES(1, 1),
      (2, 3),
      (3, 5),
      (4, 6);
              
              



#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User(
        id       Int NOT NULL ,
        nom      Varchar (25) ,
        prenom   Varchar (25) ,
        login    Varchar (25) ,
        password Varchar (25) ,
        droits   Int ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: droit
#------------------------------------------------------------

CREATE TABLE droit(
        id       Int NOT NULL ,
        niveau   Int ,
        nom      Varchar (25) ,
        severite Varchar (25) ,
        societe  Varchar (25) ,
        PRIMARY KEY (id )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: AttributionDroit
#------------------------------------------------------------

CREATE TABLE AttributionDroit(
        id      Int NOT NULL ,
        id_User Int NOT NULL ,
        PRIMARY KEY (id ,id_User )
)ENGINE=InnoDB;

ALTER TABLE AttributionDroit ADD CONSTRAINT FK_AttributionDroit_id FOREIGN KEY (id) REFERENCES droit(id);
ALTER TABLE AttributionDroit ADD CONSTRAINT FK_AttributionDroit_id_User FOREIGN KEY (id_User) REFERENCES User(id);


-- INSERT INTO user (id,nom,prenom,login,password,droits)VALUES(1,"fabbro","geoffrey","Ziguard","Ziguard",1)
-- INSERT INTO user (id,nom,prenom,login,password,droits)VALUES(2,"guyader","Julien","Xelty","Xelty",2)

-- INSERT INTO droit(id,niveau,nom,severite,societe) VALUES (1,1,"TEST1","TEST1","TEST1")
-- INSERT INTO droit(id,niveau,nom,severite,societe) VALUES (2,2,"TEST2","TEST2","TEST2")
-- INSERT INTO droit(id,niveau,nom,severite,societe) VALUES (3,3,"TEST3","TEST3","TEST3")
-- INSERT INTO droit(id,niveau,nom,severite,societe) VALUES (4,4,"TEST4","TEST4","TEST4")


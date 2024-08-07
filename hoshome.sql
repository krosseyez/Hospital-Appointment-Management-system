CREATE DATABASE hoshome;
USE hoshome;

CREATE TABLE Department (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL
);

ALTER TABLE Doctor MODIFY Department_id INT NOT NULL DEFAULT 1;

CREATE TABLE Doctor (
  id INT PRIMARY KEY AUTO_INCREMENT,
  fname VARCHAR(255) NOT NULL,
  lname VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  Department_id INT,
  FOREIGN KEY (Department_id) REFERENCES Department(id)
);

CREATE TABLE Nurse (
  id INT PRIMARY KEY AUTO_INCREMENT,
  fname VARCHAR(255) NOT NULL,
  lname VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  Department_id INT,
  FOREIGN KEY (Department_id) REFERENCES Department(id)
);

CREATE TABLE Patient (
  id INT PRIMARY KEY AUTO_INCREMENT,
  fname VARCHAR(255) NOT NULL,
  lname VARCHAR(255) NOT NULL,
  age INT NOT NULL,
  conditio VARCHAR(255),
  phoneNumber VARCHAR(255),
  Doctor_id INT,
  FOREIGN KEY (Doctor_id) REFERENCES Doctor(id)
);

CREATE TABLE Appointment (
  id INT PRIMARY KEY AUTO_INCREMENT,
  date DATE NOT NULL,
  Doctor_id INT,
  Patient_id INT,
  FOREIGN KEY (Doctor_id) REFERENCES Doctor(id),
  FOREIGN KEY (Patient_id) REFERENCES Patient(id)
);
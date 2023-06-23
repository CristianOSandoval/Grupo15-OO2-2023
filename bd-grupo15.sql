DROP DATABASE IF EXISTS `bd-SmartCity-grupo15` ;
CREATE DATABASE  IF NOT EXISTS `bd-SmartCity-grupo15`;
USE `bd-SmartCity-grupo15`;

--
-- Table structure for table `dispositivo`
--
CREATE TABLE `bd-SmartCity-grupo15`.`dispositivo` (
  `iddispositivo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(255) NOT NULL,
  `activo` BIT(1) NOT NULL,
  `createdate` DATETIME NOT NULL,
  `updatedate` DATETIME NOT NULL,
  PRIMARY KEY (`iddispositivo`));
  
--
-- Table structure for table `evento`
--
CREATE TABLE `bd-SmartCity-grupo15`.`evento` (
  `idevento` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(255) NOT NULL,
  `iddispositivo` INT NOT NULL,
  `fechaHora` DATETIME NOT NULL,
  `createdate` DATETIME NOT NULL,
  `updatedate` DATETIME NOT NULL,
  PRIMARY KEY (`idevento`),
  INDEX `fk_dispositivo_evento_idx` (`iddispositivo` ASC) VISIBLE,
  CONSTRAINT `fk_dispositivo_evento` FOREIGN KEY (`iddispositivo`)
	  REFERENCES `bd-SmartCity-grupo15`.`dispositivo` (`iddispositivo`)
	  ON DELETE NO ACTION
	  ON UPDATE NO ACTION);

--
-- Table structure for table `sensorhumedad`
--
CREATE TABLE `bd-SmartCity-grupo15`.`sensorhumedad` (
  `idsensor` INT NOT NULL,
  `porcentajehumedad` DOUBLE NOT NULL,
  `tiempoencencido` TIME NOT NULL,
  `lluvia` BIT(1) NOT NULL,
  PRIMARY KEY (`idsensor`),
  CONSTRAINT `fk_sensorhumedad_dispositivo`
    FOREIGN KEY (`idsensor`)
    REFERENCES `bd-SmartCity-grupo15`.`dispositivo` (`iddispositivo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

--
-- Table structure for table `sensorluz`
--
CREATE TABLE `bd-SmartCity-grupo15`.`sensorluz` (
  `idsensor` INT NOT NULL,
  `iluminado` BIT(1) NOT NULL,
  `aulaenuso` BIT(1) NOT NULL,
  `cortinasabiertas` BIT(1) NOT NULL,
  PRIMARY KEY (`idsensor`),
  CONSTRAINT `fk_sensorluz_dispositivo`
    FOREIGN KEY (`idsensor`)
    REFERENCES `bd-SmartCity-grupo15`.`dispositivo` (`iddispositivo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

--
-- Table structure for table `user`
--
CREATE TABLE `bd-SmartCity-grupo15`.`user` (
  `iduser` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  `enable` BIT(1) NOT NULL,
  `createdate` DATETIME NOT NULL,
  `updatedate` DATETIME NOT NULL,
  PRIMARY KEY (`iduser`)
);
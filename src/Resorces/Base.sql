CREATE TABLE `Persona`(
    `IDPersona` INT NOT NULL,
    `TipoDocumento` VARCHAR(50) NULL,
    `NumeroDocumento` VARCHAR(50) NULL,
    `Nombres` VARCHAR(255) NULL,
    `Apellidos` VARCHAR(255) NULL,
    `CiudadResidencia` VARCHAR(255) NULL,
    `Direccion` VARCHAR(255) NULL,
    `Telefono` VARCHAR(50) NULL,
    `FechaNacimiento` DATE NULL,
    `Sexo` CHAR(1) NULL,
    PRIMARY KEY(`IDPersona`),
    CONSTRAINT `persona_idpersona_foreign` FOREIGN KEY(`IDPersona`) REFERENCES `Alumno`(`IDAlumno`)
);

CREATE TABLE `Asignatura`(
    `IDAsignatura` INT NOT NULL,
    `Nombre` VARCHAR(255) NULL,
    `Creditos` INT NULL,
    `IDProfesor` INT NULL,
    `CupoDisponible` INT NULL,
    `IDPrograma` INT NULL,
    PRIMARY KEY(`IDAsignatura`),
    CONSTRAINT `asignatura_idprofesor_foreign` FOREIGN KEY(`IDProfesor`) REFERENCES `Profesor`(`IDProfesor`),
    CONSTRAINT `asignatura_idprograma_foreign` FOREIGN KEY(`IDPrograma`) REFERENCES `Programa`(`IDPrograma`)
);

CREATE TABLE `Profesor`(
    `IDProfesor` INT NOT NULL,
    `IDDepartamento` INT NULL,
    PRIMARY KEY(`IDProfesor`),
    CONSTRAINT `profesor_iddepartamento_foreign` FOREIGN KEY(`IDDepartamento`) REFERENCES `Departamento`(`IDDepartamento`)
);

CREATE TABLE `Matricula`(
    `IDMatricula` INT NOT NULL,
    `IDAlumno` INT NULL,
    `IDAsignatura` INT NULL,
    `Dia` VARCHAR(50) NULL,
    `HoraInicio` TIME NULL,
    `HoraFin` TIME NULL,
    `IDSalon` INT NULL,
    PRIMARY KEY(`IDMatricula`),
    CONSTRAINT `matricula_idalumno_foreign` FOREIGN KEY(`IDAlumno`) REFERENCES `Alumno`(`IDAlumno`),
    CONSTRAINT `matricula_idasignatura_foreign` FOREIGN KEY(`IDAsignatura`) REFERENCES `Asignatura`(`IDAsignatura`),
    CONSTRAINT `matricula_idsalon_foreign` FOREIGN KEY(`IDSalon`) REFERENCES `Salon`(`IDSalon`)
);

CREATE TABLE `Programa`(
    `IDPrograma` INT NOT NULL,
    `Nombre` VARCHAR(255) NULL,
    `Nivel` VARCHAR(50) NULL,
    PRIMARY KEY(`IDPrograma`)
);

CREATE TABLE `Salon`(
    `IDSalon` INT NOT NULL,
    `Capacidad` INT NULL,
    `Edificio` VARCHAR(50) NULL,
    `Piso` INT NULL,
    `NumeroIdentificacion` VARCHAR(50) NULL,
    PRIMARY KEY(`IDSalon`)
);

CREATE TABLE `Periodo`(
    `IDPeriodo` INT NOT NULL,
    `Codigo` VARCHAR(50) NULL,
    `Anio` INT NULL,
    `Semestre` INT NULL,
    PRIMARY KEY(`IDPeriodo`)
);

CREATE TABLE `Tarifa`(
    `IDTarifa` INT NOT NULL,
    `Costo` DECIMAL(10, 2) NULL,
    `IDPeriodo` INT NULL,
    `IDPrograma` INT NULL,
    PRIMARY KEY(`IDTarifa`),
    CONSTRAINT `tarifa_idperiodo_foreign` FOREIGN KEY(`IDPeriodo`) REFERENCES `Periodo`(`IDPeriodo`),
    CONSTRAINT `tarifa_idprograma_foreign` FOREIGN KEY(`IDPrograma`) REFERENCES `Programa`(`IDPrograma`)
);

CREATE TABLE `Departamento`(
    `IDDepartamento` INT NOT NULL,
    `Nombre` VARCHAR(255) NULL,
    PRIMARY KEY(`IDDepartamento`)
);

CREATE TABLE `Alumno`(
    `IDAlumno` INT NOT NULL,
    PRIMARY KEY(`IDAlumno`)
);

CREATE TABLE `Curso`(
    `IDCurso` INT NOT NULL,
    `Nombre` VARCHAR(255) NULL,
    `GuiaCatedra` TEXT NULL,
    `IDAsignatura` INT NULL,
    PRIMARY KEY(`IDCurso`),
    CONSTRAINT `curso_idasignatura_foreign` FOREIGN KEY(`IDAsignatura`) REFERENCES `Asignatura`(`IDAsignatura`)
);

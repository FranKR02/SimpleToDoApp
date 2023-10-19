# SimpleToDoApp

![Java Version](https://img.shields.io/badge/Java-%3E%3D%2011-orange)
![Spring Boot Version](https://img.shields.io/badge/Spring%20Boot-3.1.5-green)
![MySQL Version](https://img.shields.io/badge/MySQL-8.0.33-blue)
![Hibernate Version](https://img.shields.io/badge/Hibernate-5.5.3-yellow)

Este proyecto es una API REST sencilla para gestionar una lista de tareas. Desarrollada en Spring Boot, ofrece operaciones CRUD implementadas a través de los métodos HTTP. Utiliza una base de datos MySQL con JPA y Hibernate para la persistencia de datos. Proporciona respuestas con códigos de estado HTTP y retornos de datos.

## Dependencias

- `org.springframework.boot:spring-boot-starter-web`
- `org.springframework.boot:spring-boot-starter-test`
- `org.springframework.boot:spring-boot-starter-data-jpa:3.1.2`
- `mysql:mysql-connector-java:8.0.33`

## Requisitos

- Java 11 o superior
- Maven
- MySQL 8.0.33 o superior

## Configuración

1. Clona el repositorio.
2. Configura tu base de datos MySQL y actualiza las credenciales en `src/main/resources/application.properties`.
3. Ejecuta la aplicación utilizando Maven o tu IDE favorito.

## Endpoints

- `GET /tasks`: Obtiene la lista de tareas.
- `POST /savetask`: Crea una nueva tarea.
- `PUT /update/{id}`: Actualiza una tarea existente.
- `DELETE /delete/{id}`: Elimina una tarea.

---

¡Contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias, por favor abre un *issue*.

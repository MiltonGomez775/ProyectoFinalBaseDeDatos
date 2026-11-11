# 📝 Sistema de Gestión de Exámenes — API

Backend para una plataforma académica de evaluación: administra cursos, unidades, grupos, docentes y estudiantes, bancos de preguntas, exámenes y sus resultados. Proyecto final del curso de Bases de Datos (Universidad del Quindío).

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4-6DB33F?logo=springboot&logoColor=white)
![Oracle](https://img.shields.io/badge/Oracle-F80000?logo=oracle&logoColor=white)

## Funcionalidades

API REST con CRUD para cada entidad del modelo:

- Cursos, unidades y grupos
- Docentes y estudiantes, y asignación de grupo-curso-unidad-docente
- Bancos de preguntas y preguntas
- Exámenes y resultados de examen

## Tecnologías

- Java 21 · Spring Boot 3.4 (Web, Data JPA)
- Oracle Database (driver `ojdbc11`), H2 para pruebas
- **MapStruct** para mapear entidades ↔ DTOs
- Lombok · Gradle

## Arquitectura

Arquitectura en capas con interfaces de servicio y sus implementaciones:

```
app/src/main/java/co/edu/uniquindio/proyecto
├── controller/       # 10 controladores REST
├── dto/
├── mapper/           # MapStruct
├── model/            # Entidades JPA
├── repository/
└── service/
    └── Impl/
```

## Cómo ejecutarlo

1. Tenga una instancia de Oracle (por ejemplo Oracle XE en `localhost:1521`) con el esquema creado.
2. Configure el usuario y la contraseña en `app/src/main/resources/application.properties`.
3. Ejecute:

```bash
cd app
./gradlew bootRun
```

---

Desarrollado por **[Milton Gómez](https://github.com/MiltonGomez775)**

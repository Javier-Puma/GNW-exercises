# API REST para Ferretería - Spring Boot

## Descripción del Proyecto
Se requiere desarrollar una **API REST** utilizando **Spring Boot** que permita administrar las herramientas y productos disponibles en una ferretería. La API será consumida en el futuro por un **frontend independiente**, por lo que debe exponer endpoints claros y bien estructurados.

## Tecnologías Utilizadas
- **Spring Boot** (Framework principal)
- **Spring Data JPA** (Persistencia de datos)
- **Base de datos relacional** (Almacenamiento seguro y organizado)
- **REST API** (Exposición de servicios)

## Características de las Herramientas
Cada herramienta registrada en el sistema debe contener los siguientes atributos:

- **Nombre**
- **Marca**
- **Categoría**
- **Precio**
- **Cantidad disponible en stock**
- **Descripción**

## Operaciones CRUD Requeridas
El sistema debe permitir las siguientes operaciones sobre las herramientas:

| Operación | Descripción |
|-----------|-------------|
| **Crear** | Registrar una nueva herramienta |
| **Leer (Todos)** | Visualizar todas las herramientas registradas |
| **Leer (Uno)** | Consultar una herramienta específica por su ID |
| **Actualizar** | Modificar los datos de una herramienta existente |
| **Eliminar** | Eliminar una herramienta del sistema |

## Arquitectura del Proyecto
La aplicación debe seguir la arquitectura típica de **Spring Boot**:

```

├── controller/       # Capa de controladores REST
├── service/          # Capa de servicios (lógica de negocio)
├── repository/       # Capa de repositorios (Spring Data JPA)
├── model/            # Capa de entidades (modelo de datos)
└── dto/              # Objetos de transferencia de datos (opcional)

```

## Requisitos Técnicos
- La aplicación debe exponer endpoints REST para cada operación CRUD.
- Se debe usar **Spring Data JPA** para la persistencia en la base de datos.
- Las herramientas no estarán relacionadas con otras entidades o tablas (entidad independiente).
- Los datos deben almacenarse en una base de datos relacional (ej. MySQL, PostgreSQL, H2, etc.).

## Objetivo del Desarrollo
Construir un **CRUD completo** de herramientas aplicando correctamente los conceptos de Spring Boot, utilizando **Spring Data JPA** para la persistencia y exponiendo los datos mediante una **API REST** que pueda ser consumida por un frontend en etapas posteriores del proyecto.
---
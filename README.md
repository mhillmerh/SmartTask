# 🚀 SmartTask

Aplicación de consola desarrollada en Java para la gestión de tareas personales.

Proyecto correspondiente al Módulo 4 Bootcamp Fullstack Java.

---

## 📌 Descripción

SmartTask es una aplicación ejecutable desde consola que permite:

- ✅ Agregar tareas con nombre y prioridad
- 📋 Listar tareas activas y completadas
- ✔️ Marcar tareas como completadas
- 🗑 Eliminar tareas por ID

El proyecto fue desarrollado aplicando principios de Programación Orientada a Objetos (POO), buenas prácticas de diseño y pruebas unitarias con JUnit5.

---

## 🏗 Arquitectura del Proyecto

El proyecto está estructurado de forma modular y escalable:

```
src
└── main
└── java
└── com
└── smarttask
├── model
│   ├── Tarea.java
│   ├── TareaNormal.java
│   └── TareaUrgente.java
│
├── service
│   ├── Accionable.java
│   └── GestorTareas.java
│
└── app
└── SmartTaskApp.java

src
└── test
└── java
└── com
└── smarttask
└── GestorTareasTest.java
```

---

## 🧠 Conceptos Aplicados

Este proyecto implementa los siguientes fundamentos:

- Encapsulamiento
- Herencia
- Polimorfismo
- Interfaces
- Clases abstractas
- Principio de Responsabilidad Única (SRP)
- Bajo acoplamiento
- Estructuras de control
- Colecciones (ArrayList)
- Pruebas unitarias con JUnit5

---

## 🔎 Modelo de Dominio

### Clase Tarea (Abstracta)

Representa una tarea base con los atributos:

- id
- nombre
- prioridad
- completado

Define comportamiento común y un método abstracto `tipo()`.

### TareaNormal y TareaUrgente

Extienden de Tarea e implementan comportamiento polimórfico.

---

## ⚙️ Lógica del Sistema

La clase `GestorTareas`:

- Implementa la interfaz `Accionable`
- Gestiona la lista interna de tareas
- Aplica lógica de negocio
- Controla generación automática de IDs

---

## ▶️ Ejecución del Proyecto

### Requisitos

- Java 8 o superior
- Maven

### Compilar


mvn clean package


### Ejecutar


java -jar target/smarttask.jar


---

## 🧪 Pruebas Unitarias

Las pruebas están implementadas con JUnit5.

Para ejecutarlas:


mvn test


Se validan:

- Creación de tareas
- Marcado como completadas
- Eliminación
- Comportamiento del gestor

##Cobertura de Código

El proyecto alcanza un 98% de cobertura de líneas, validado con Intellij IDE (Run whit Coverage);

![img.png](img.png)

---

## 📦 Entregables

- Código fuente completo
- Ejecutable .jar funcional
- Documentación JavaDoc
- Pruebas unitarias
- Capturas de pantalla

---

## 🔮 Posibles Mejoras Futuras

- Persistencia en archivo
- Integración con base de datos
- Interfaz gráfica (JavaFX)
- API REST con Spring Boot
- Sistema de autenticación

---

## 👨‍💻 Autor

Maximiliano Hillmer  
Proyecto académico – Bootcamp Fullstack Java modulo 4.
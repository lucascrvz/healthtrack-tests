# 🩺 HealthTrack - Evaluación Módulo 4 DevOps

Este proyecto corresponde a la Evaluación del Módulo 4 del curso de DevOps. Se desarrolla una estrategia completa de pruebas (unitarias, funcionales, de regresión y rendimiento) para una plataforma de monitoreo de peso, usando Java y herramientas de automatización modernas.

## 📌 Objetivo

Corregir un error crítico en el sistema de actualización de peso de usuarios, y establecer un flujo de pruebas automatizadas integradas a un pipeline CI/CD.

## ⚠️ Descripción del error original

Cada vez que un usuario actualizaba su peso, el sistema descontaba 1 kg en lugar de registrar el valor ingresado:

```java
// Código original erróneo:
this.peso -= 1;
```

Este bug ya ha sido corregido en la versión actual del código:

```java
// Código corregido:
this.peso = nuevoPeso;
```

Para corregir el error, no solo se ha modificado el código, sino que también se han implementado pruebas unitarias y de rendimiento para asegurar que el sistema funcione correctamente y pueda manejar cargas de trabajo esperadas.

Para esto, se ha creado una aplicacion en Spring Boot que permite ejecutar los tests de manera sencilla y rápida, para asi aplicar pruebas de rendimiento con JMeter.

## 🛠️ Tecnologías y herramientas utilizadas

| Tipo de prueba     | Herramienta          |
| ------------------ | -------------------- |
| Unitarias          | JUnit                |
| Rendimiento        | Apache JMeter        |
| CI/CD              | GitHub Actions       |


## 📁 Estructura del proyecto

```text
├── jmeter
│   └── performance_test.jmx
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── healthtrack
│   │               ├── controller
│   │               │   └── UsuarioController.java
│   │               ├── HealthtrackApplication.java
│   │               └── model
│   │                   └── Usuario.java
│   └── test
│       └── java
│           └── com
│               └── healthtrack
│                   ├── AppTest.java
│                   └── UsuarioTest.java
└── target

```


## 🚀 Cómo ejecutar el proyecto

Requisitos:

 - Java 17+
 - Maven


**Ejecutar tests unitarios**

```bash
mvn test
```

**Ejecutar pruebas de rendimiento con JMeter**

Para ejecutar pruebas de rendimiento con Apache JMeter:

1. Insatala [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi).

2. Abre JMeter con:

    ```bash
    ./bin/jmeter
    ```
3. Carga el archivo de prueba de rendimiento `performance_test.jmx` desde la carpeta `jmeter`.

4. Ejecuta la aplicacion Spring Boot para que esté disponible para las pruebas:

    ```bash
    mvn spring-boot:run
    ```
5. Ejecuta la prueba de rendimiento en JMeter.

6. Revisa los resultados en los listeners configurados.

---

**Ver el pipeline**

Las pruebas unitarias se ejecutan automáticamente en GitHub Actions al hacer push o pull request a la rama main.
Las pruebas de rendimiento no están incluidas en el pipeline para evitar tiempos largos.

Puedes revisar los resultados del pipeline en la pestaña Actions del repositorio.
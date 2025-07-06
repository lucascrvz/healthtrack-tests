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

## 🛠️ Tecnologías y herramientas utilizadas

| Tipo de prueba     | Herramienta          |
| ------------------ | -------------------- |
| Unitarias          | JUnit                |
| Funcionales (mock) | Java CLI             |
| Rendimiento        | Apache JMeter        |
| CI/CD              | GitHub Actions       |
| Calidad de código  | (opcional) SonarQube |


## 📁 Estructura del proyecto

```text
healthtrack-tests/
├── src/
│   ├── main/java/com/healthtrack/Usuario.java
│   └── test/java/com/healthtrack/UsuarioTest.java
│
├── jmeter/
│   └── performance_test.jmx
│
├── .github/workflows/ci.yml
├── docs/Evaluacion_M4_DevOps_LucasCruz.pdf
├── README.md
├── .gitignore
└── pom.xml
```


## 🚀 Cómo ejecutar el proyecto

Requisitos:

 - Java 17+
 - Maven


**Ejecutar tests unitarios**

```bash
mvn test
```

**Ver el pipeline**

Puedes ver la ejecución automática de pruebas en la pestaña **Actions** del repositorio GitHub.

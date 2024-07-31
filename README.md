# Programación Reactiva con Spring WebFlux y R2DBC

Este proyecto es una API construida con Spring Boot utilizando programación reactiva con Spring WebFlux y R2DBC para la integración con una base de datos PostgreSQL en Cloud SQL. Aquí encontrarás detalles sobre las tecnologías utilizadas, instrucciones para ejecutar el proyecto y una comparación entre la programación reactiva y la tradicional orientada a objetos.

## Tecnologías y Bibliotecas

### Spring Boot
- **Versión**: 3.3.1
- **Descripción**: Framework para el desarrollo de aplicaciones Java que facilita la configuración y el despliegue de aplicaciones basadas en Spring.
- **Documentación**: [Spring Boot Documentation](https://spring.io/projects/spring-boot)

### Spring WebFlux
- **Descripción**: Módulo de Spring que proporciona soporte para la programación reactiva, permitiendo el manejo de solicitudes y respuestas de manera no bloqueante.
- **Documentación**: [Spring WebFlux Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)

### R2DBC
- **Descripción**: API para el acceso a bases de datos relacionales de manera reactiva, diseñada para usar con Spring WebFlux.
- **Documentación**: [R2DBC Documentation](https://r2dbc.io/)

### MapStruct
- **Descripción**: Biblioteca para el mapeo de objetos en Java, utilizando anotaciones para definir los mapeos entre diferentes tipos de objetos.
- **Documentación**: [MapStruct Documentation](https://mapstruct.org/)

### Swagger (Springdoc OpenAPI)
- **Descripción**: Herramienta para la generación de documentación de API en formato OpenAPI (Swagger) para aplicaciones Spring Boot.
- **Documentación**: [Springdoc OpenAPI Documentation](https://springdoc.org/)

## Configuración del Proyecto

### 1. Requisitos Previos

Asegúrate de tener instalados:
- Java 21
- Gradle

### 2. Clonar el Repositorio

## Comparación: Programación Reactiva vs. Programación Tradicional Orientada a Objetos

### Programación Reactiva

**Ventajas:**
- **Escalabilidad:** La programación reactiva permite manejar cargas pesadas y conexiones concurrentes de manera más eficiente, ya que utiliza un modelo no bloqueante. Esto es particularmente útil en aplicaciones con alto tráfico o aquellas que requieren manejar un gran número de solicitudes simultáneas.
- **Resiliencia:** Facilita la gestión de errores y la recuperación de fallos, ya que los sistemas reactivos pueden manejar fallos sin interrumpir el flujo de datos o la funcionalidad general del sistema.
- **Flujo de Datos:** Proporciona un enfoque fluido para manejar eventos y flujos de datos asíncronos. Esto permite construir aplicaciones que respondan en tiempo real a los eventos y cambien de estado de manera eficiente.

**Desventajas:**
- **Complejidad:** La programación reactiva puede ser más difícil de entender y mantener para desarrolladores que no están familiarizados con el enfoque. La complejidad de los flujos asíncronos y los operadores reactivos puede aumentar el tiempo de desarrollo y la dificultad de depuración.
- **Curva de Aprendizaje:** Requiere una comprensión sólida de los principios reactivos y de los patrones de diseño asociados, lo cual puede suponer una curva de aprendizaje significativa para los desarrolladores acostumbrados a la programación tradicional.

### Programación Tradicional Orientada a Objetos

**Ventajas:**
- **Simplicidad:** La programación orientada a objetos (OOP) es generalmente más fácil de entender y aplicar, especialmente para desarrolladores con experiencia en este paradigma. La estructura basada en objetos y clases es un concepto bien establecido y ampliamente documentado.
- **Madurez:** La OOP es un paradigma maduro con una gran cantidad de documentación, herramientas y soporte comunitario. Esto facilita la resolución de problemas, el desarrollo y la implementación de aplicaciones.

**Desventajas:**
- **Escalabilidad:** Los enfoques tradicionales basados en la programación sincrónica pueden enfrentar limitaciones en el manejo de un gran número de conexiones o solicitudes simultáneas. Esto puede afectar el rendimiento y la capacidad de respuesta bajo cargas pesadas.
- **Rendimiento:** Los modelos bloqueantes y la falta de soporte nativo para operaciones asincrónicas pueden llevar a una menor eficiencia en términos de uso de recursos y tiempos de respuesta en aplicaciones con alta demanda.




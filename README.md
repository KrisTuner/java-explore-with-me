# 🌍 Explore With Me - Платформа для поиска событий

[![Java](https://img.shields.io/badge/Java-21-orange)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.2-brightgreen)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16.1-blue)](https://www.postgresql.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9-red)](https://maven.apache.org/)
[![Docker](https://img.shields.io/badge/Docker-24.0-blue)](https://www.docker.com/)
[![REST API](https://img.shields.io/badge/REST-API-yellow)](https://restfulapi.net/)

## 📋 О проекте

**Explore With Me** — это многомодульное приложение для поиска и организации событий, разработанное на микросервисной архитектуре. Платформа позволяет пользователям создавать события, оставлять комментарии, подавать заявки на участие, а также просматривать подборки интересных мероприятий.

Проект состоит из двух основных сервисов:
- **Main Service** (основной сервис) - бизнес-логика приложения
- **Stats Service** (сервис статистики) - сбор и анализ статистики посещений

### 🎯 Цели проекта

- Создание удобной платформы для поиска и организации событий
- Реализация микросервисной архитектуры с разделением ответственности
- Сбор и анализ статистики для улучшения пользовательского опыта
- Обеспечение масштабируемости и отказоустойчивости

## 🛠 Стек технологий

### Backend
- **Java 21** - современная версия с улучшенной производительностью
- **Spring Boot 3.3.2** - фреймворк для создания микросервисов
  - Spring Web - REST API
  - Spring Data JPA - работа с базами данных
  - Spring Validation - валидация данных
  - Spring Actuator - мониторинг приложения

### Базы данных
- **PostgreSQL 16.1** - основная реляционная база данных
- **Hibernate** - ORM для работы с БД

### Инструменты разработки
- **Maven** - сборка проекта и управление зависимостями
- **Lombok** - уменьшение шаблонного кода
- **Docker & Docker Compose** - контейнеризация и оркестрация
- **REST Client** - HTTP-клиент для межсервисного взаимодействия

### Качество кода
- **Checkstyle** - проверка стиля кода
- **SpotBugs** - поиск потенциальных ошибок
- **JaCoCo** - анализ покрытия тестами

<img width="2716" height="1500" alt="image" src="https://github.com/user-attachments/assets/1e3a6878-21dc-4632-ad27-ed5808cac95f" />
<img width="1467" height="591" alt="Screenshot 2568-12-15 at 14 44 15" src="https://github.com/user-attachments/assets/109f0a0b-cd4e-4e8c-a7f3-9e5fcaebd39d" />
<img width="2344" height="1378" alt="image" src="https://github.com/user-attachments/assets/7f9e347a-d040-42da-9e4c-0313d9992aa6" />




# 🛒 E-Commerce Microservices (Spring Boot 3)

🚧 **Project Status:** In progress (~10–20%)

This repository is a learning + implementation playground for migrating a **monolithic e-commerce backend** into a **Spring Boot 3 microservices architecture** with clear service boundaries and **database-per-service** ownership.

---

## 🎯 Goal

Build a practical microservices foundation with:

- Clear service boundaries (User / Product / Order)
- Independent deployment per service
- **Database-per-service** (separated data ownership)
- REST communication now → event-driven later

---

## ✅ Current Implementation

### Services
- 👤 **user-service**
- 📦 **product-service**
- 🛒 **order-service**

### Communication
- 🔁 **REST** (service-to-service calls)

### Databases (per service)
- **user-service** → MongoDB  
- **product-service** → PostgreSQL  
- **order-service** → MySQL  

### Working Key Flow (Current)
- ✅ Basic end-to-end flow across services (**User → Product → Order**) running locally

---

## 🚀 Microservices Architecture Overview

A simple microservices architecture consisting of three independent services.

Each service:
- runs on its own port
- owns its own database
- can be deployed independently

Core principles applied:
- 🔗 Loose coupling  
- 🚀 Independent deployment  
- 🗃️ Separated data ownership  
- 📈 Scalable & maintainable architecture  

---

## 🧠 What I’m Currently Exploring / Implementing

This repo is actively expanding toward a more complete Spring Cloud ecosystem.

### Spring Cloud Foundations
- ✅ Spring Boot Actuator (health/info/metrics)
- ⏳ Spring Cloud Gateway (API Gateway)
- ⏳ Config Server (centralized configuration management)
- ⏳ Eureka Server (service registry & discovery)

### Inter-service Communication
- ✅ REST-based calls (current)
- ⏳ OpenFeign / RestTemplate (improving client patterns)

### Observability & Resilience
- ⏳ Distributed tracing with Zipkin
- ⏳ Resilience patterns with Resilience4J (retry/circuit breaker/timeouts)

### Security
- ⏳ JWT-based security (service-level)
- ⏳ OAuth2 + Keycloak (central authentication/authorization)

### Event-Driven (Later Stage)
- ⏳ Apache Kafka
- ⏳ Spring Cloud Stream

### Deployment (Later Stage)
- ✅ Containerize with Docker (in progress)
- ⏳ Deploy to Kubernetes (K8s)

---

📈 Scalable and maintainable architecture


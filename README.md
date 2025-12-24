<img width="2132" height="1134" alt="image" src="https://github.com/user-attachments/assets/86787e16-44af-4c4f-9a56-09a97965d17f" />
<img width="1467" height="591" alt="Screenshot 2568-12-15 at 14 44 15" src="https://github.com/user-attachments/assets/109f0a0b-cd4e-4e8c-a7f3-9e5fcaebd39d" />


## Project Status
**In progress (~10–20%)**

## Goal
Practice migrating a monolithic e-commerce backend to a **Spring Boot 3 microservices architecture** with clear service boundaries and independent data ownership (database-per-service).

## Current Implemented
- **Services:** `user-service`, `product-service`, `order-service`
- **Communication:** REST (service-to-service calls)
- **Databases (per service):**
  - `user-service` → **MongoDB**
  - `product-service` → **PostgreSQL**
  - `order-service` → **MySQL**

## Working Key Flow (Current)
- Basic end-to-end flow across services (User → Product → Order) running locally.

## How to Run (Local)
- Start dependencies with **Docker Compose**
- Run each Spring Boot service locally

## Roadmap (Later)
- Event-driven communication with **Kafka**
- Authentication/authorization with **Keycloak (OAuth2)**
- Observability (tracing/metrics/logging)
- Deployment to **Kubernetes**


---

🚀 Microservices Architecture Overview

This project demonstrates a simple microservices architecture consisting of three independent services:

👤 User Service 

📦 Product Service 

🛒 Order Service 

Each service runs on its own port and maintains its own dedicated database, following key microservices principles:

🔗 Loose coupling

🚀 Independent deployment

🗃️ Separated data ownership

📈 Scalable and maintainable architecture


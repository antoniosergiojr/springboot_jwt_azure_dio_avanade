## Spring Boot com JWT e Azure | [Aceleração Global Dev #6 Avanade](https://digitalinnovation.one/)

Projects with JWT and Azure to create secure cloud environments Integrating Azure Spring Cloud with Azure Security Center.

## 📌 Index
- ⚙ [Settings](#-settings)
- 💻 [Technologies](#-technologies)
- 🚀 [How to run](#-how-to-run)
---

## ⚙ Settings
  Have a microsoft azure [account](https://azure.microsoft.com/pt-br/free/), set up following the [steps](https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-active-directory).

---

## 💻 Technologies
    - Java
    - Spring Boot
	- JWT (JSON Web Token)
    - Maven
    - Azure Spring Cloud
	- Azure Security Center	
---

## 🚀 How to run

  > Cloning the repository
  ```bash
    # Cloning repository
    git clone https://github.com/antoniosergiojr/springboot_jwt_azure_dio_avanade.git
  ```

  > Running web project
  ```bash
    # Accessing web project 1
    cd spring-boot-jwt

    # Running web project 1   
    run application and then access: 
    http://localhost:80/status
	
	Open file Insomnia
	Post http://localhost:80/login
	Now get authorization value JWT and add in the header for url /all-users
	Get http://localhost:80/all-users
	
	# Accessing web project 2
    cd spring-boot-azure

    # Running web project 2   
    run application and then access: 
    http://localhost:8080/group1
	http://localhost:8080/group2
    
  ```
---

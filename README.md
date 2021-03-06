## Spring Boot com JWT e Azure | [Aceleraรงรฃo Global Dev #6 Avanade](https://digitalinnovation.one/)

Projects with JWT and Azure to create secure cloud environments integrating Azure Spring Cloud with Azure Security Center.

## ๐ Index
- โ [Settings](#-settings)
- ๐ป [Technologies](#-technologies)
- ๐ [How to run](#-how-to-run)
---

## โ Settings
  Have a microsoft azure [account](https://azure.microsoft.com/pt-br/free/), set up following the [steps](https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-active-directory).

---

## ๐ป Technologies
    - Java
    - Spring Boot
	- JWT (JSON Web Token)
    - Maven
    - Azure Spring Cloud
	- Azure Security Center	
---

## ๐ How to run

  > Cloning the repository
  ```bash
    # Cloning repository
    git clone https://github.com/antoniosergiojr/springboot_jwt_azure_dio_avanade.git
  ```

  > Running web project
  ```bash
    # Accessing web project jwt
    cd spring-boot-jwt

    # Running web project jwt   
    run application and then access: 
    http://localhost:80/status
	
	Open file Insomnia
	Post http://localhost:80/login
	Now get authorization value JWT and add in the header for url /all-users
	Get http://localhost:80/all-users
	
	# Accessing web project azure
    cd spring-boot-azure

    # Running web project azure
    run application and then access: 
    http://localhost:8080/group1
	http://localhost:8080/group2
    
  ```
---

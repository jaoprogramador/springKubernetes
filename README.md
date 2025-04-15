# INDICE
# ==========
# Intro
# Config
# API
# Migration Flyway 
# JPA
# Testing
# Dockerizing
# Actions


# INICIAR proyecto
# =================
# refresh y clean proyect
# ejecutamos el GOAL CLEAN BUILD que genera el jar
# arrancamos DCOCKER-DESCKTOP
# arrancamos el contenedor
# docker run -p 8080:8080  jao/26bookmarker-api

# Useful commands:DOCKER
# ===================
# crear la imagen Docker con Spring Boot
	mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=jao/26bookmarker-api
# construir la imagen Docker con jib
	mvnw jib:build -Dimage=jao/26bookmarker-api
# Esto es útil si tienes Docker instalado localmente y quieres crear la imagen y ejecutarla en tu entorno local.
	mvnw jib:dockerBuild -Dimage=jao/26bookmarker-api
# ejecutar la imagen Docker que has creado (ya sea con spring-boot:build-image o jib:dockerBuild):

	docker run -p 8080:8080  jao/26bookmarker-api
	
## How to run?: Nos clonamos el proyecto copiamos docker-compose.yml ,docker-compose-app.yml y run.sh en el workspace donde esté la aplicacion(NO DENTRO DE ELLA)

```shell
$ git clone https://github.com/jaoprogramador/springKubernetes.git
$ cd springKubernetes
$ ./run.sh start
$ ./run.sh stop

$ ./run.sh start_infra
$ ./run.sh stop_infra
```

* To start only dependent services

```shell
$ ./run.sh start_infra
$ ./run.sh stop_infra
```



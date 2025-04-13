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


Tengo este pom y me gustaría ejecutar estos comandos para crear en docjker una imagen de la app pero no me funciona
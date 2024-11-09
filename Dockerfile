# Fase de build
FROM gradle:8.10.2-jdk17 AS build

# Definir o diretório de trabalho
WORKDIR /home/gradle/src

# Copiar os arquivos do projeto para o diretório de trabalho
COPY --chown=gradle:gradle . .

# Executar o build do Gradle, pulando os testes
RUN gradle build --no-daemon -x test

# Fase de execução
FROM openjdk:17-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o jar gerado da fase de build
COPY --from=build /home/gradle/src/build/libs/*.jar app.jar

# Expor a porta em que a aplicação vai rodar
EXPOSE 8080

# Definir o comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
# price-scrapper-java

PROJECTO EN DESARROLLO......


Permite capturar precio de tienda retail de productos previamente seleccionados.

## Tabla de Contenidos

- [Características](#Características)
- [Requisitos](#Requisitos)
- [Instalación](#Instalación)
- [Linux](#Linux)
- [Docker](#Docker)
- [mySql](#mySql)



## Características

- Característica 1: Descripción de la característica.
- Característica 2: Descripción de la característica.
- Característica 3: Descripción de la característica.

## Requisitos

- Java 11 o superior
- Maven (opcional, si usas Maven)
- Otras dependencias necesarias

## Instalación

```bash
#Clona el repositorio
git clone https://github.com/P4t0R/price-scrapper-java

#Compila el projecto
mvn clean install

#Ejecuta el projecto 
mvn spring-boot:run

#Ejecuta el projecto desde `.jar`
java -jar target\*jar*
```

## Linux

```bash
#Instalar java
sudo apt install openjdk-17-jdk

#Seleccionar version java
sudo update-alternatives --config java
```


## Docker

```bash
#Lista contenedores
sudo docker ps

#Abrir terminal de contenedor
sudo docker exec -it [NOMBRE_CONTENEDOR] bash
```

## mySql

```bash
#Comandos basicos
mysql -u username -p;  
show databases;
create database db_name;  
select database();
use db_name;  
show tables;
describe table_name;
```

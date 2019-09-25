# Web Service Framework

La siguiente aplicacion recrear un cliente concurrente sencillo en java. El CLiente será capaz de generar peticiones a paginas html. Además del Cliente proveerá de herramientas para el analisis de tiempos y peticiones perdidas del servidor.

## Como empezar

### Prerequisites

Para poder correr el cliente localmente es necesario tener instalado los sigientes programas:

* git

Si no se posee alguno de estos programas estos son manuales de instalacion de cada uno de ellos


**Git**

`All plataforms` https://git-scm.com/book/es/v1/Empezando-Instalando-Git


### Installing

Para instalar la aplicacion es necesario clonar el proyecto con el siguiente comando

````
git clone https://github.com/GrCross/WebServiceFrameworkClient.git
````

una vez descargado el proyecto se procede se procede a compilarlo.

Para la compilación es preferible usar cualquier editor de codigo que permita dicha acción.


###Ejecucion
para poder correr el programa se puede hacer de las dos siguientes formas.

1) desde un editor de codigo que permita al accion de correr el programa y a la vez permita pasarle argumentos a la funcion main del proyecto

2) Se necesita creare el archivo jar del proyecto, y para correrlo desde consola se usa el siguiente ocmando

````
java -jar <nombre del archivo jar> <direccion http>
````

###Pruebas
De acuerdo a la prueba que se va a hacer los resultados de esta se mostrar en el archivo resultados.txt
adema si las peticiones que el recibe las mostrar en la consola, si alguna no fue respondida recibira cada uno de los errores del servidor

## Construido con
* [Maven](https://maven.apache.org/) - Manejador de dependencias


## Autores

* **Daniel Rosales** - [GrCross](https://github.com/GrCross)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details



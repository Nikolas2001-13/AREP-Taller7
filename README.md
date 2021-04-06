# TAREA DE AMAZON GATEWAY Y LAMBDA

1. Cree un servicio Web en Spark que convierta de grados farenheit en grados celcius. El servicio debe responder un JSON.
2. Despliegue el servicio en una máquina de AWS EC2 y publíquelo.
3. Cree una ruta en el API getway para acceder al servicio . Ojo ya la integración no es con función lambda.
4. Cree un aplicación JS para usar el servicio. Depliegue la aplicación en S3. Asegúrese que esté disponible sobre internet.
5. Pruebe la aplicación Web
6. Entregue el código desarrollado en Github, un reporte de las pruebas, y u video con el experimento funcionando.
7. Intente que el servicio en EC2 no esté accesible sobre internet, solo debe estar accesible por medio del API gateway.

## Explicación y Resumen del Proyecto

Se realizará una aplicación, la cual será desplegada en AWS utilizando EC2 y Docker. Se efectuara la operación matemática correspondiente para converitr los grados farenheit en grados celcius, el cuales recibirá un parámetro de tipo Double que serán los grados farenheit y retornarán un parámetro de este mismo tipo que seran los grados celcius. Se implementarán los servicios para responder al método de solicitud HTTP GET.

El llamado debe ser de este tipo: `https://amazonxxx.x.xxx.x.xxx:{port}/celsius?value=32`.

El formato de salida y respuesta será un JSON con el siguiente formato: 

{

 "operation": "Grados farenheit a grados celcius",

 "input":  32,

 "output":  0

}

## Imagenes de consola AWS corriendo

[Video programa en ejecución]()

### Consola EC2
![]()

### Conversión
![]()

## Empezando e Instalando

Entramos a la carpeta donde queremos guardar nuestro repositorio, en este caso Desktop

`$ cd Desktop`

Clonamos el repositorio en la carpeta

`$ git clone https://github.com/Nikolas2001-13/AREP-Taller7`

Nos dirigimos a la carpeta que contiene el proyecto

`$ cd AREP-Taller7`

Compilamos con maven

`$ mvn package`

Correr proyecto

`$ mvn exec:java -Dexec.mainClass="edu.eci.arep.SparkWebServer"`

Para ejecutar la aplicación

`$ docker-compose up -d `

## Prerrequisitos
Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.
Tener conocimiento sobre Maven, GIT, Spark y GITHUB. 
Tener instalado Docker es su máquina.
Conocimientos sobre AWS y EC2.

## Instancia en AWS

[Amazon EC2]()

## Correr las Pruebas

Para correr las pruebas del programa habrá que ejecutar el comando

`$ mvn test`

## Documentacion

Para generar la documentación habrá que ejecutar el siguiente comando

`$ mvn javadoc:javadoc`

## Construido Con

* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - IDE

## Autor

* **Nikolás Bernal Giraldo** - [Nikolas2001-13](https://github.com/Nikolas2001-13) - Estudiante de la Escuela Colombiana de Ingeniería Julio Gravito

## Licencia

[LICENSE.md](http://www.gnu.org/licenses/gpl.html) 

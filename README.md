# Práctica Acceso a Datos


## Introducción

Este proyecto sobre acceso a datos, se borda diferentes requisitos sobre como acceder a los documentos de distintos métodos y según el más conveniente. Depende de lo que tengamos o necesitemos se realizará una cosa u otra.

Para este proyecto se ha realizado con el control de versiones Git para aprender sobre la herramienta y tener en la nube los archivos por si acaso.

> [Link del proyecto](https://github.com/RODRIGAMER669/acceso-datos-ar1)

La temática del proyecto es sobre videojuegos ya que es un tema que me gusta aunque tampoco requiera de tanta información para poder realizar el proyecto. Tenemos 5 elementos con 5 campos:
 - Una id (int)
 - Un nombre (string)
 - Un género (string)
 - Un precio (float)
 - Si el juego fue completado (char)

## Índice de los archivos

> 1. `CrearFichero_ARR.java` : correponde al ejercicio 1 donde crear un fichero data con los datos que queremos introducir.

> 2. `ModificarFichero_ARR.java` : corresponde al ejercicio 2 donde modificamos los datos del fichero anterior mencionado, donde el usuario tiene que introducir el `código` del juego e introducir los demás valores.

> 3. `CrearFicheroXML_ARR.java` : corresponde al ejercicio 3 donde se lee el fichero data y crea un fichero XML usando el DOM y el acceso aleatorio a partir del fichero data.

> 4. `LeerFicheroXML_ARR.java` : correponde al ejercicio 4 donde se lee el fichero XML e imprime por la terminal el contenido de ese fichero. También se requiere de `GestionContenido.java` para leer los datos.

> 5. `Transformador_ARR.java` : corresponde al ejercicio 5 donde tenemos un fichero xml y queremos con una plantilla `videojuegosPlantilla.xsl` realizar una tabla en un html.
---

## Ejercicio1

Realizar un programa JAVA (CrearFichero_XXX.java) que cree un fichero (.dat) que guarde
esa información.

## Ejercicio2

Realizar un programa JAVA(ModificarFichero_XXX.java) que permita modificar los datos
guardados. El programa recibe desde la línea de comando, el código a modificar, y los campos a modificar. Si el código no existe se mostrará un mensaje indicándolo. Visualiza también los datos antiguos. 


## Ejercicio 3

A partir de los datos del fichero creado XXXX.dat crear un programa JAVA(CrearFicheroXML_XXX.java) que cree un fichero llamado XXXX.XML usando DOM y con acceso aleatorio al fichero dat.

## Ejercicio 4

Mostrar el fichero XML creado anteriormente usando SAX y DOM (LeerFicheroXML_XXX.java). 

## Ejercicio 5

Convertir el fichero anterior (XXXX.xml) a través de un formato XSLT y un documento HTML
con una tabla que contenga al menos el nombre y la combinación de otros campos.
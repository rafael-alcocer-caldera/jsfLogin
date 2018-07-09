## Sinopsis

El proyecto es una aplicacion JavaServer Faces.

Es una de las mas simples que puedes hacer.
Simula un login.
Ingresas el nombre y el password.
Despues das clic en el boton de Login.

## Motivacion

Queria tener un ejemplo muy facil.

## REQUERIMIENTOS
1)	Una IDE de desarrollo o simplemente el bloc de notas. Utilice Eclipse.
2)	Instalar o tener instalado el Java Development Kit (JDK). Utilice la version 1.6.0_45
3)	Un servidor de aplicaciones o un contenedor web. Utilice Tomcat 6.0.9

## Tests

Abre un navegador con la siguiente URL: http://localhost:8080/jsfLogin

Despues de oprimir el boton de Login veras una respuesta: Bienvenido: Junto con el nombre que escribiste en el campo de texto

## Notas
Para que todas las peticiones pasen por el Servlet de JSF (FacesServlet) es necesario incluir el prefijo /faces 
como lo especifique en el archivo de configuracion web.xml:
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>/faces/*</url-pattern>
	</servlet-mapping>

En caso de no hacerlo, simplemente los tags de JSF no seran considerados.

Por esta razon tambien agregue en el archivo de configuracion web.xml, lo siguiente:
	<welcome-file-list>
		<welcome-file>faces/index.xhtml</welcome-file>
	</welcome-file-list>

De esta forma si solo escribes la URL: http://localhost:8080/jsfLogin
En automatico se traduce a: http://localhost:8080/jsfLogin/faces/index.xhtml

De no haber puesto lo anterior, se tendria que escribir lo siguiente: http://localhost:8080/jsfLogin/faces/index.xhtml
En caso contrario, los tags de JSF no aparecerian. 


## License

Todo el trabajo esta bajo Apache 2.0 license

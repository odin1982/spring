# spring
Si los beans son declarados en XML la mejor forma de obtener el contexto es con la clase **ClassPathXmlApplicationContext**.

## spring container
El lugar donde los beans son colocados.

## dependency injection(DI)
Es la forma en que Spring maneja los componentes y crea asociaciones.

## IoC Inversion de Control o Patron Hollywood
No nos llames nosotros te llamaremos
Un contenedor que maneja los objetos por ti, es un archivo XML
Controla la creacion de objetos
El contenedor resuleve las dependencias entre los objetos que contiene

## Formas de obtener el applicationContext
* **ClassPathXmlApplicationContext**:
	Carga un contexto de un XML localizado en el classpath.

```	
ApplicationContextcontext = new ClassPathXmlApplicationContext("foo.xml");
```

* **FileSystemXmlApplicationContext**:
	Carga un context de un XML localizado en los archivos del sistema.

```
ApplicationContextcontext = newFileSystemXmlApplicationContext("c:/foo.xml");
```

* **XmlWebApplicationContext**:
	Carga el context de un XML contenido en una aplicacion web.
	

## Ciclo de vida
1. Instanciar									Spring instancia el bean
2. Llenar Propiedades							Spring inyecta las propiedades del bean
3. Establecer el nombre del bean				Si el bean implementa "BeanNameAware",Spring pasa el id del bean a "setBeanName()"
4. Establecer el bean factory					Si el bean implementa "BeanFactoryAware", Spring pasa el bean factory a "setBeanFactory()"
5. Post procesar (antes de la inicialización)	Si hay algún "BeanPostProcessors", Spring llama a sus métodos "postProcessBeforeInitialization()"
6. Inicializar beans							Si el bean implementa "InitializingBean", se llamará a su método "afterPropertiesSet()". Si el bean tiene un método "init-method" 												propio (que veremos en la siguiente sección), el método será llamado.
7. Post procesar (después de la inicialización)	Si hay algún "BeanPostProcessors", Spring llama a sus métodos "postProcessAfterInitialization()"
8. El bean está listo para usarse				En este punto el bean está listo para ser usado por la aplicación y permanecerá en el bean factory hasta que deje de ser ocupado.
9. Destruir el bean								Si el bean implementa "DisposableBean", se llama a su método "destroy()". Si el bean tiene un método "destroy-bean" propio, el 												 												método	especificado será llamado.


## Injectar beans sin constructor
Se usa static method factory, un ejemplo de una clase sin constructor es un Singleton en el que se obtiene su referencia a traves de un metodo estático

```
<bean id="theStage" class="com.springinaction.springidol.Stage" factory-method="getInstance" />
```

# Bean Scoping
Por default el scope de los beans es singleton.
1. singleton: 		Distribuye la misma instancia del bean
2. prototype: 		Produce una instancia de bean cada vez que la necesita
3. request:			Su alcance es valido solo en un HTTP request(valido solo cuando estas usando Spring MVC)
4. session:			Su alcance es valido solo en un HTTP session(valido solo cuando estas usando Spring MVC)
5. global-session: 	Su alcance es valido solo en un HTTP global session(valido solo cuando estas usando Spring MVC)

```
<bean id="ticket" class="com.springinaction.springidol.Ticket"scope="prototype"/>
``` 
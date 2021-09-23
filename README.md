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

## Bean Scoping
Por default el scope de los beans es singleton.
1. singleton: 		Distribuye la misma instancia del bean
2. prototype: 		Produce una instancia de bean cada vez que la necesita
3. request:			Su alcance es valido solo en un HTTP request(valido solo cuando estas usando Spring MVC)
4. session:			Su alcance es valido solo en un HTTP session(valido solo cuando estas usando Spring MVC)
5. global-session: 	Su alcance es valido solo en un HTTP global session(valido solo cuando estas usando Spring MVC)

```
<bean id="ticket" class="com.springinaction.springidol.Ticket"scope="prototype"/>
```

## init-method, destroy-method
Se declaran dentro del tag de bean:  
	**init-method**: 		Especifica un metodo que sera llamado despues de que se instancie el bean.  
	**destroy-method**: 	Especifica un metodo que es llamado antes de que se removido del contenedor.
	
	```
	public classAuditorium{
		public void turnOnLights(){ ... }
		public void turnOffLights(){ ... }
	}
	//Asi se declara en el context
	<bean id="auditorium" class="com.springinaction.springidol.Auditorium" init-method="turnOnLights" destroy-method="turnOffLights"/>
	```
## default-init-method, default-destroy-method  
Si necesitas que todos tus beans usen init-method y destroy-method se usan los metodos default:  
	
	```
	<?xml version="1.0"encoding="UTF-8"?>
		<beans xmlns="http://www.springframework.org/schema/beans"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xsi:schemaLocation="http://www.springframework.org/schema/beans
				http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
				default-init-method="turnOnLights"
				default-destroy-method="turnOffLights">...
	</beans>  
	```  

## Inyeccion con setters

```
<bean id="kenny2" class="com.springinaction.springidol.Instrumentalist">
	<propertyname="song"value="JingleBells"/>
	<propertyname="instrument"ref="saxophone"/>
</bean>
```
## Injecting inner beans  
Se usa cuando no quieres compartir el bean con otros beans.  

```
<bean id="kenny" class="com.springinaction.springidol.Instrumentalist">
	<property name="song"value="JingleBells"/>
	<property name="instrument">
		<bean class="org.springinaction.springidol.Saxophone"/>
	</property>
</bean>
```

##Wiring properties with Spring's "p" namespace
El namespace p ofrece una manera mas facil de unir propiedades de un bean.
Lo primero que se debe hacer es agregarlo en el application context

```
<?xml version="1.0"encoding="UTF-8"?>
<beans 
xmlns="http://www.springframework.org/schema/beans"
xmlns:p="http://www.springframework.org/schema/p"  --> Se agrega
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
```

## Wiring collection  
**<list>** 	useful when configuring Arrays or Collections, wiring a list of values, allowing duplicates  
**<set>**  	useful when configuring Arrays or Collections, wiring a set of values, not allowing duplicates  
**<map>**	wiring a collection of name-value pairs where name and value can be of any type  
**<props>**	wiring a collection of name-value pairs where the name and value are both strings  

```
<bean id="hank" class="com.springinaction.springidol.OneManBand">
	<propertyname="instruments">
		<list>
			<refbean="guitar"/>
			<refbean="cymbal"/>
			<refbean="harmonica"/>
		</list>
	</property>
</bean>
```

## Wiring map collection
```
<bean id="hank"class="com.springinaction.springidol.OneManBand">
	<propertyname="instruments">
		<map>
			<entry key="GUITAR" value-ref="guitar"/>
			<entry key="CYMBAL" value-ref="cymbal"/>
			<entry key="HARMONICA" value-ref="harmonica"/>
		</map>
	</property>
</bean>
```
An <entry> in a <map> is made up of a key and a value, either of which can be a primitive value or a reference to another bean. These attributes help specify the keys and values of an <entry>.
Attribute 													Purpose
key 														Specifies the key of the map entry as a String
key-ref 													Specifies the key of the map entry as a reference to a bean in the Spring context
value 														Specifies the value of the map entry as a String
value-ref 													Specifies the value of the map entry as a reference to a bean in the Spring context

## Wiring Properties Collection

```
<bean id="hank"class="com.springinaction.springidol.OneManBand">
	<property name="instruments">
		<props>
			<prop key="GUITAR">STRUMSTRUMSTRUM</prop>
			<prop key="CYMBAL">CRASHCRASHCRASH</prop>
			<prop key="HARMONICA">HUMHUMHUM</prop>
		</props>
	</property>
</bean>
```

## Wiring nothing(null)

```
<property name="someNonNullProperty"><null/></property>
```


## SPEL( Spring expression language)
Spring 3 uses SPEL in order to wiring bean's properties, constructor arguments using expresions that ARE EVALUATED AT RUNTIME

### Literal Values
The #{} markers are a clue to Spring that the content that they contain is a SPEL expression.

```
<property name="message" value="The value is #{5}"/>
<property name="name" value="#{'Chuck'}"/>
<property name='name' value='#{"Chuck"}'/>
<property name="enabled" value="#{false}"/>
```
### Referencing beans, properties and methods
Another basic thing that a SPEL expression can do is to reference another bean by its ID

```
<property name="instrument" value="#{saxophone}"/>
```

### Working with types
The key to working with class-scoped methods and constants in SpEL is to use the T() operator. The result of the T() operator is a Class object that represents.

The real value of the T() operator is that it gives us access to static methods and constants on a given class.


## The four kinds of autowiring
* byName:  		Attempts to match all properties of the autowired bean with beans that have the same name (or ID) as the properties. Properties for which there’s no matching bean will 			remain unwired.

* byType:		
Attempts to match all properties of the autowired bean with beans whose types are assignable to the properties. Properties for which there’s no matching bean will remain unwired.

In Spring, “Autowiring by Type” means, if data type of a bean is compatible with the data type of other bean property, auto wire it.


* constructor: 	Tries to match up a constructor of the autowired bean with beans whose types are assignable to the constructor arguments.

* autodetect:	Attempts to apply constructor autowiring first. If that fails,byType will be tried.

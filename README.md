frd-stock
=========

Proyecto Java de stock con Struts2 para Google App Engine
## Como crear el proyecto
Para crear este proyecto, se debe utilizar maven.<br/>
Una vez que fué creado el proyecto eclipse, se debe abrir eclipse e importar el proyecto.<br/>
  * File -> Import -> General -> Existing Projects into Workspace

Consideren realizar los siguientes pasos en la carpeta donde quieran almacenar el proyecto.

### Pasos a seguir:
1. $ mvn archetype:generate -DarchetypeCatalog=http://struts.apache.org/
2. Choose archetype:<br/>
1: http://struts.apache.org/ -> org.apache.struts:struts2-archetype-blank (Struts 2 Archetypes - Blank)<br/>
2: http://struts.apache.org/ -> org.apache.struts:struts2-archetype-convention (Struts 2 Archetypes - Blank Convention)<br/>
3: http://struts.apache.org/ -> org.apache.struts:struts2-archetype-dbportlet (Struts 2 Archetypes - Database Portlet)<br/>
4: http://struts.apache.org/ -> org.apache.struts:struts2-archetype-plugin (Struts 2 Archetypes - Plugin)<br/>
5: http://struts.apache.org/ -> org.apache.struts:struts2-archetype-portlet (Struts 2 Archetypes - Portlet)<br/>
6: http://struts.apache.org/ -> org.apache.struts:struts2-archetype-starter (Struts 2 Archetypes - Starter)<br/>
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : 2<br/>
Define value for property 'groupId': : com.frditlabs<br/>
Define value for property 'artifactId': : struts2GAE<br/>
Define value for property 'version': 1.0-SNAPSHOT: :<br/>
Define value for property 'package': com.frditlabs: : <br/>
Y: : Y<br/>
3. $ cd struts2GAE/
4. mvn eclipse:eclipse -Dwtpversion=2.0

Y listo, importan en Eclipse.

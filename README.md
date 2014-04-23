dublin-bus-spring-websockets
====================

another sample application demoing Spring Websocket support

This is a simple application that uses Spring 4 websockets support to show real time bus dublin stops.

The data is sourced from http://dublinbus-api.heroku.com/stops rest api. Spring Integration is
used for polling for this information and storing this in RabbitMQ.

Spring WebSockets support with STOMP protocol integrating with RabbitMQ is used for showing realtime information on UI.

Spring Boot is used for packaging the entire application

To run the application, first set up rabbitmq and add in the stomp plugin

Application can then be started up using the following command:

mvn spring-boot:run

todo

url para saber el servicio de una linea, el bus empieza y acaba en dos puntos distintos y 
esto me da la ruta con los puntos que hay en medio, mola. Cuantos servicios hay?
http://dublinbus-api.heroku.com/services/2

Get detailed stop information for a particular service

route: the name of the route the service operates on
id: the ID of the route

http://dublinbus-api.heroku.com/services/2/0202

Gets stop information for the #2 from UCD to O'Connell St

Result is exactly as for /services/{route} but the data array will contain exactly one item

things to do:

provide a way to show a map with lat lon provided google-maps https://developers.google.com/maps/documentation/javascript/tutorial#api_key

provide a custom paginate table for the incoming events, there are a lot of them.

Current live information link doesnt work, internal server error

todo
cuando hagas el evento onclick, tienes que ir directamente al div del map. done

prioritario

tienes que poner un script que te permita paginar los resultados, son muchisisimos y hay que buscarlos. Con eso, acabas!

estas probando con dataTables http://live.datatables.net/welcome/1/edit
para ello tienes que usar una version superior de jquery, esta es la antigua que usabas.
<script th:src="@{/js/jquery-1.7.2.js}" src="../../js/jquery-1.7.2.js"></script>

funciona, mas o menos, porque necesito que el servidor rabbitmq me devueva los datos de forma escalonada, pero eso es algo que se debe hacer desde rabbitmq...

    


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

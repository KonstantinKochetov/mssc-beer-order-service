# Spring Boot Microservice

To run locally: <br>

1. run jms docker: <br>
docker run -it --rm \
  -p 8161:8161 \
  -p 61616:61616 \
  vromero/activemq-artemis

2. Run zipkin docker: <br>
docker run -d -p 9411:9411 openzipkin/zipkin

3. Run all services (start with eureka, config, gateway, and then the rest)

4. Make some requests from a client (like Postman) 

5. Visualize it: http://localhost:9411/, go to dependencies page, choose a date and search <br>
![Alt Text](zipkin.gif)


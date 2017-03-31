# WebServiecSOAPTutorial
A simple Hello World Web Service with JAX-WS 

# How to install 

We have to copy the jar in the folder WebServiecSOAPTutorial/jarDependency into the {%TOMCAT}/lib folder.
The Tomcat installaton does not come out by default with the JAX-WS and we need to install it to use it.

After this simply operation we need to deploy the application on the Tomcat Server. 
!!!Bug: the server will send a long warning stack trace, for now just ignore it!!!
Now that can we see the wsdl on the URL http://localhost:8080/WSHello/hello?wsdl , use a SOAP client (like SOAP-UI) to test 
the correctness of the service.

 
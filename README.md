# General

I wrote this software based on the tutorial under https://spring.io/guides/tutorials/rest/ .
It was meant to complement my Learning Experience for An Angular - Getting Started - Course in Pluralsights.com
The aim was to provide a simple server with an Simple In-Memory Database to respond to get requests and give back a list of products
instead of the method used by the course which just reads from a local file containing the json contents

# API Requests
it provides a simple server that responds to the following requests 

```
GET http://localhost:8080/api/products

```

And

```
GET http://localhost:8080/api/products/5

```
With 5 used as an example quering the product with id 5 in the simple database


# Prerequisites

* JDK >= 17
* gradle build system (see HELP.md)


# Build 


```sh
./gradlew bootJar 

```

For windows replace gradlew with gradlew.bat


# Run

```sh
cd $PROJECTROOT/build/libs
java -jar TestServerPSDKAngularCourse.jar

#if the port 8080 is already used on your machine please add --server.port=<port> as argument to the execution command
#replacing <port> with your port of choice
#$PROJECTROOT is the directory where this Readme.md resides
```





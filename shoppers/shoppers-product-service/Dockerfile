FROM openjdk:11
ADD ./target/shoppers-product-service-0.0.1-SNAPSHOT.jar /usr/src/shoppers-product-service-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "shoppers-product-service-0.0.1-SNAPSHOT.jar"]
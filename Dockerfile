FROM java:8u111-jdk

ADD target/Project3_v2.ScreeningService.jar /ScreeningService.jar

EXPOSE 8894

CMD ["java","-jar", "ScreeningService.jar", "com.revature.ScreeningServiceApplication"]

FROM openjdk:11
RUN mkdir work
RUN groupadd -r spring && useradd -r -gspring spring
USER spring:spring
COPY build/libs/*.jar work/app.jar
ENTRYPOINT ["java","-jar","/work/app.jar"]
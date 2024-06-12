FROM tomcat:10.1.19-jdk17-temurin-jammy
WORKDIR /Softwaretesting
COPY . .
EXPOSE 8081
CMD ["catalina.sh", "run"]
 
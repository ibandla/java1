FROM java:jre-alpine
ARG VERSION=0.1.0
COPY /build/libs/stud-${VERSION}.jar /src/stud
CMD ["java","-jar","/src/stud"]


FROM java:8-jre-alpine

WORKDIR /home/apps/
ADD target/test-0.0.1-SNAPSHOT.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
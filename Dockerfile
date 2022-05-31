FROM openjdk:17.0.2-oraclelinux8
COPY 'target/game-of-three-player-*.jar' app/app.jar
COPY bootstrap.sh /
ENTRYPOINT ["/bootstrap.sh"]

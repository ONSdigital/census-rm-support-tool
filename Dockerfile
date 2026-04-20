FROM eclipse-temurin:17-jre-alpine

CMD ["java", "-jar", "/opt/census-rm-support-tool.jar"]

RUN addgroup --gid 1000 supporttool && adduser --system --uid 1000 supporttool supporttool
USER supporttool

COPY target/census-rm-support-tool*.jar /opt/census-rm-support-tool.jar

# 1. OpenJDK 기반 이미지 사용
FROM openjdk:21-jdk-slim

# 2. JAR 파일을 컨테이너에 복사
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# 3. 포트 오픈
EXPOSE 8080

# 4. JAR 실행
ENTRYPOINT ["java", "-jar", "app.jar"]

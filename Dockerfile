# 1. OpenJDK 17 기반 이미지 사용
FROM eclipse-temurin:17-jdk

# 2. 작업 디렉토리 설정
WORKDIR /app

COPY keystore.p12 /app/keystore.p12

# 3. Gradle 빌드된 JAR 파일을 복사 (파일명이 다르면 수정 필요)
COPY build/libs/*.jar app.jar

# 4. 실행 명령어 설정
CMD ["java", "-jar", "app.jar"]
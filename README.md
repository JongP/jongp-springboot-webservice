# jongp-springboot-webservice
스프링부트2와 AWS로 간단한 웹서비스르 구현하였다.


##  Stack

### 1. SpringBoot2
JPA를 이용해 게시글과 유저 데이터베이스 관리  
OAuth2를 이용해 구글, 네이버 로그인 구현.  

### 2. AWS
#### EC2, RDS, S3, CodeDeploy
AWS EC2와 RDS를 활용해 서버 배포.  

### 3. Travis-CI
AWS의 S3와 CodeDeploy를 활용해 CI/CD 환경 구축  

### 4. nginx
reverse proxy를 이용해 무중단 배포 환경 구축  

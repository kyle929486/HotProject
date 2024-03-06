# 핫도리 프로젝트

바쁜 현대 사회에서 여행은 가고 싶지만...
어렵고 막막한 여행 계획, 쉬운 방법 없을까?
#### 한눈에 보고, 빠르게 계획할 수 있는 웹페이지!!
<hr>

### 구현 기능
- 로그인, 소셜 로그인, 회원가입 : Spring Security를 활용한 로그인&회원가입과 Oath2를 활용한 소셜 로그인


- 아이디, 비밀번호 찾기 : DB에 저장된 이메일로 인증코드를 발송, 인증코드 검증에 성공하면 아이디 표시 및 비밀번호 교체
![image](https://github.com/kyle929486/HotProject/assets/151328589/b220daa2-0c0f-4ce9-9c62-c4eea60626b0)
 
- 여행엽서 페이지 : 이미지를 업로드하여 엽서 형태로 꾸민 뒤, html2canvas 라이브러리를 사용하여 PC에 저장
![image](https://github.com/kyle929486/HotProject/assets/151328589/152d95f1-9942-4579-96a7-dc6bd41b8c95)
![엽서](https://github.com/kyle929486/HotProject/blob/master/Animation.gif)

<hr>

### 개발 환경
 - intllij
 - mysql
 - Github

<hr>

### SpringBoot 3.2.x. JDK 17
- spring-web
- devtools
- lombok
- spring-security
- spring-thymeleaf
- spring-validation
- mybatis : 3.0.2
- thymeleaf-extras-springsecurity6
- spring-oauth2-client
- spring-data-jpa
- mysql-connector-j
- spring-boot-starter-webflux
- commons-email:1.5
- spring-mail  version - 3.0.5
### 배포 위치 EC2 !

<hr>

### 배포 방법
- 개발환경(컴퓨터)에서 github 업로드
- tar -xvf deploy.tar
- 프로덕션(EC2)에서 deploy.sh 파일 실행

<hr>




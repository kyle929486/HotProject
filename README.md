# 🚗 핫도리 - 국내 여행 스케줄 추천 페이지

### 개요
- 국내 여행지에 대한 정보를 한눈에 볼 수 있고, 간편하게 여행 스케줄을 만들 수 있습니다.
- 여행지에서 찍은 사진을 엽서 형태로 꾸밀 수 있습니다.

  #### [프로젝트 발표 영상 보러 가기](https://www.youtube.com/watch?v=BtLcqLXIx54&list=PLedGoSru7949HpjolTIj01PMIzOOTG6Yq&index=9)
<hr>


### 구현 기능
#### 로그인, 회원가입
- Spring Security를 활용한 로그인 및 회원가입, Oath2를 활용한 소셜 로그인
- JAVA, Spring, MyBatis, SpringSecurity, SpringOath2Client
- HTML, CSS, BootStrap, JavaScript, jQuery
<br/>

<img src="https://github.com/kyle929486/HotProject/blob/master/upload/Animation%20(2).gif" width="50%" height="50%"><img src="https://github.com/kyle929486/HotProject/blob/master/upload/Animation%20(3).gif" width="50%" height="50%">




#### 아이디, 비밀번호 찾기
- DB에 저장된 이메일로 인증코드를 발송, 인증코드 검증에 성공하면 아이디 표시 및 비밀번호 교체
- JAVA, Spring, MyBatis
- HTML, CSS, BootStrap, JavaScript, jQuery
- Apache Commons Email, 네이버 SMTP
<br/>

<img src="https://github.com/kyle929486/HotProject/blob/master/upload/Animation%20(4).gif" width="50%" height="50%"><img src="https://github.com/kyle929486/HotProject/blob/master/upload/Animation%20(1).gif" width="50%" height="50%">
<p align="center"><img src="https://github.com/kyle929486/HotProject/assets/151328589/b220daa2-0c0f-4ce9-9c62-c4eea60626b0" width="70%"></p>



 
#### 여행엽서 페이지 :
- 이미지를 업로드하여 엽서 형태로 꾸민 뒤, html2canvas 라이브러리를 사용하여 PC에 저장
- HTML, CSS, BootStrap, JavaScript, jQuery
- html2canvas
<br/>

<p align="center"><img src="https://github.com/kyle929486/HotProject/assets/151328589/89829008-bcea-46a9-a29f-09601cdae5f3" width="70%"></p>
<p align="center"><img src="https://github.com/kyle929486/HotProject/blob/master/upload/Animation.gif" width="70%"></p>

<hr>


### 개발 환경
 - intllij
 - mysql
 - Github

<hr>


### 배포 방법
- 개발환경(컴퓨터)에서 github 업로드
- tar -xvf deploy.tar
- 프로덕션(EC2)에서 deploy.sh 파일 실행

<hr>




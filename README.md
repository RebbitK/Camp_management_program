# 확신의 I조 , 15조 입니다.

---
## 👥 Team 

이름| 역할 | 블로그주소                              |Github주소
---|----|------------------------------------|---
**김형우**| 팀장 | https://khwtil.tistory.com/        | https://github.com/RebbitK
**이병수**| 팀원 | https://velog.io/@gloz0315/posts   | https://github.com/gloz0315
**진유림**| 팀원 | https://velog.io/@wealel0529/posts |https://github.com/wealEl
**최지원**| 팀원 | 1                                  |1
**남지훈**| 팀원 | 1                                  |1

## 👋프로그램 소개
**캠프 관리 프로그램 - 관리자가 되어 수강생들을 관리하자!**
- 수강생들의 정보를 생성,수정,삭제 기능을 가지고 있습니다.
- 수강생들의 점수에 따라 등급을 매기고 평균을 출력할 수 있습니다.

## ☕요구사항
- 캠프에는 필수 과목과 선택 과목이 존재합니다.
- 캠프 수강생들은 최소 3개 이상의 필수 과목과 2개 이상의 선택 과목을 선택합니다.
- 캠프 수강생들은 캠프 기간동안 선택한 과목별로 총 10회의 시험을 봅니다.
- 캠프 매니저는 수강생을 등록 및 관리할 수 있습니다.
- 캠프 매니저는 수강생들의 과목과 시험 점수를 등록 및 관리할 수 있습니다.

## ✨기능명세서
- 📢필수 요구 사항
  
  - 수강생 정보를 등록할 수 있습니다.
  - 수강생 목록을 조회할 수 있습니다.
  - 수강생의 과목별 시험 회차 및 점수를 등록할 수 있습니다.
  - 수강생의 과목별 회차 점수를 수정할 수 있습니다.
  - 수강생의 특정 과목 회차별 등급을 조회할 수 있습니다.
  
- 📢선택 요구 사항
  
  - 수강생 점수에 따라 상태를 생성할 수 있습니다.
  - 수강생 정보를 상세하게 조회할 수 있습니다.
  - 수강생 정보를 수정할 수 있습니다.
  - 상태별 수강생 목록을 조회할 수 있습니다.
  - 수강생을 삭제할 수 있습니다.
  - 수강생의 과목별 평균 등급을 조회할 수 있습니다
  - 특정 상태 수강생들의 필수 과목 평균 등급을 조회합니다.
  
## ✅ 실제 구현
**1. 메인 화면**
````
스파르타 코딩 클럽 수강생 관리자 메뉴입니다.

1. 등록하기    2. 수정하기    3. 조회하기    4. 삭제하기    5. 등급조회    0. 나가기
숫자를 입력하세요:
````
**2. 수강자 등록**
````
수강생을 등록하겠습니까?
학생 이름을 입력하세요: 김형우
등록할 수강생의 고유 번호를 입력하세요: 15
Number | CourseName           | CourseType
===== [선택 가능 과목 목록] =====
1      | Java                 | 필수 과목
2      | Spring               | 필수 과목
3      | JPA                  | 필수 과목
4      | MySQL                | 필수 과목
100    | Design Pattern       | 선택 과목
101    | Spring Security      | 선택 과목
102    | Redis                | 선택 과목
103    | MongoDB              | 선택 과목
수강할 과목 고유번호를 선택하세요.
쉼표를 붙여서 필수과목 3, 선택과목 2개 이상 고르시오( 예시) 1,2,3  ,종료는 'exit')
1,2,3,100,101
학생이 성공적으로 생성되었습니다!
````
**3. 수정하기**
````
수강생을 수정하시겠습니까?
어떤 학생의 정보를 수정하시겠습니까? (0. 나가기)
15  | 김형우

학생의 번호를 입력하세요: 15
특정 과목의 점수를 입력하시겠습니까? (0. 나가기)
== 필수 과정 리스트 ==
  1 | Java
  2 | Spring
  3 | JPA

== 선택 과정 리스트 ==
100 | Design Pattern
101 | Spring Security

과목의 번호를 입력하세요: 1
1회차 점수를 등록하시겠습니까? (1. 등록하기   2. 다른 회차 수정하기   0. 나가기)
숫자를 입력하세요: 1
점수를 입력하세요(0 ~ 100 사이): 80
점수가 등록되었습니다!
````
**4. 조회하기**
````
수강생을 조회하시겠습니까?

조회할 수강생 번호를 입력하세요 (0. 나가기): 15
15  | 김형우
수강생 목록을 조회합니다.....

수강생 목록 조회 성공!
학생 Id  : 15
학생 이름 : 김형우
학생 상태 : 매우 기분좋음
== 필수 과정 리스트 ==
  1 | Java
  2 | Spring
  3 | JPA
== 선택 과정 리스트 ==
100 | Design Pattern
101 | Spring Security
스파르타 코딩 클럽 수강생 관리자 메뉴입니다.
````
**5-1. 등급 조회 (특정 과목 평균)**
````
[ 점수 관리 시스템 ]
1. 특정 과목의 전체 평균 점수
2. 특정 과목의 회차별 평균 등급
3. 특정 상태의 필수 과목 회차별 평균 등급
4. 특정 상태의 선택 과목 회차별 평균 등급
5. 특정 학생의 특정 과목의 회차별 등급
6. 메인화면으로 돌아가기

숫자를 입력하세요: 1
1   | Java            
2   | Spring          
3   | JPA             
4   | MySQL           
100 | Design Pattern  
101 | Spring Security 
102 | Redis           
103 | MongoDB         

과목의 번호를 입력하세요: 1

Average Score : 74.9 | D Rank
````
**5-2. 등급 조회 (특정 상태 필수 과목 회차별 평균)**
````
상태를 입력해 주세요.
1. 매우 기분 좋음    2. 평범함    3. 매우 심기 불편    0. 나가기
숫자를 입력하세요: 1
매우 기분 좋은 학생들의 목록
15  | 김형우
== 필수 과목 회차별 평균 등급 ==

1   | Java
2   | Spring
3   | JPA
4   | MySQL
과목의 번호를 입력하세요: 1
== [ Java ] 회차 별 평균 등급 ==

1  times | C Rank
2  times | B Rank
3  times | C Rank
4  times | D Rank
5  times | C Rank
6  times | A Rank
7  times | F Rank
8  times | N Rank
9  times | F Rank
10 times | D Rank
````
**5-3. 등급 조회 (특정 학생 특정 과목의 회차별 등급)**
````
정보 조회를 하고 싶은 학생의 번호를 입력하세요. ( 0. 나가기 )
15  | 김형우
학생의 번호를 입력하세요: 15
 1   | Java 
 2   | Spring 
 3   | JPA 
 100 | Design Pattern 
 101 | Spring Security 

나가길 원하면 0 을 입력하세요
과목의 번호를 입력하세요: 1
1  times | C 
2  times | B 
3  times | C 
4  times | D 
5  times | C 
6  times | A 
7  times | F 
8  times | N 
9  times | F 
10 times | D 

 1   | Java 
 2   | Spring 
 3   | JPA 
 100 | Design Pattern 
 101 | Spring Security 
````
## 👩‍💻맡은 역할

**김형우**

- 과목별 평균 점수 조회
- 특정 상태 수강생 필수 과목 평균 등급
- 수강생의 특정 과목 회차별 등급


**이병수**

- 수강생 상태관리
- 수강생 정보 수정
- 수강생 상태별 목록 조회


**진유림**

- 수강생 정보 조회(+ 상태, + 과목)
- 수강생 정보 삭제

**최지원**

- 점수 등록
- 점수 수정 기능

**남지훈**

- 수강생 정보 등록
- 수강생 정보 조회 (+ 고유번호, + 이름)

## 🗃 회고록

**김형우**

- 생각보다 공유해서 사용 할 수 있는 코드가 많다는 것을 깨달았고, 이를 조율하기 위한 프로젝트 기획 회의의 중요함을 배웠습니다.
- 다른 팀원분들의 코드를 서로 리뷰하면서 피드백을 받아 도움이 되었고, 다른 팀원분들의 코드를 보면서는 많이 배웠습니다.
- 서로 생각하는 메서드의 이름이나 입력을 받아오는 방법 등이 다르기 때문에 미리 상의해야 한다는 점을 알 수 있었습니다.
- UML 다이어그램과 구조도 등을 설계해서 프로그램의 움직임을 쉽게 구상하는 것이 가능했습니다.
- 제가 자신의 코드만 집중한 나머지 공유해서 사용해야 하는 코드를 혼자 사용하는 클래스에 구현해 버린점은 고쳐야겠다고 생각했습니다.

**이병수**

- 다른 사람들과 함께 프로젝트를 만드는 것이 좋았습니다.
- 혼자서 설계를 할때는 연필로 노트에 끄적이면서 설계를 하였지만, 다른 사람들에게 내 생각을 전달할 때 말 뿐만이 아닌 그림의 중요성에 대해 알게 되었습니다.
- UML 다이어그램과 사이트에 대한 정보도 얻고 그려보면서 지식을 많이 얻었습니다.
- 다만 아쉬운 점이 있다면, 내 생각을 전달할 때, 간결하고 다른 사람에게 잘 전달이 될 수 있도록 연습을 많이 해야할 것 같습니다.

**진유림**

**최지원**

**남지훈**

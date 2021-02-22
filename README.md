# bitcamp-20201221


[10일차]
컴파일 방식 : jvm이 이해할 수 있는 중간 언어로 바꿔준다 < 유사 기계어로 보자
인터프리터 방식: 소스코드를 한 문장씩 읽고 기계어로 바꿔준다
하이브리드 방식: 두개를 섞은것 소스코드를 바이트 방식으로 변경하고 그 코드를 한 줄씩 읽는 방식

GUI : 그래픽 유저 인터페이스 > 흔히 우리가 아이콘을 클릭하여 프로그램 작동시키는
CLI : 명령 줄 인터페이스 > 작업 명령을 키보드로 입려하여 컴퓨터가 출력해주는것 ( 문자열만 가능)

파월쉘과 프롬프트 차이점: 파월쉘은 cmd의 업그레이드 버전이라고 보면 된다 더 체계적임

해시 값/디지털 지문: 파일 특성을 축약한 문자와 숫자의 조합 

[11일차]
빌드 도구가 하는일: 라이브러리의 버전을 동기화 ,중앙 저장소에 저장하여 관리함 
빌드 도구는 ant maven gradle이 있음


[13일차]
1의 보수: 입력값의 반전된 값 
2의 보수: 1의보수 +1
excess-k: k=2n-1로 
[14일차]
인코딩을 쓰지 않으면 컴퓨터가 어느 나라 언어인지 인식을 못함 그래서 -encoding을 사용
인코딩: 소스파일을 인코딩 하여 번역해주는거 
디코딩: 인코딩에 반대

래스터 방식: 점의 배열로 이미지 표현
벡터 방식:  실제로 이미지에 표현되는 점에 대한 정보를 저장하여 이미지를 표현한다
해상도를 변경해도 이미지 손상이 나지 않음.

변수란 값을 저장할 메모리 공간
원시 변수 : 데이터 타입 float double int 
레퍼런스 변수: 실제값이 아닌 주소 값을 가르키는 변수
jvm 문자 다루는 방식 유튜브 참조 

[15일차]
시스템 소프트웨어:컴퓨터의 작업을 돕기위해 여러가지 프로그램으로 구성된것
ex) 텍스트에디터 컴파일러 파워셀 디버거  
애플리케이션 소프트웨어: 컴퓨터를 문제 해결을 위한 도구로 활용하는것

프로젝트 폴더 만들기 : 
카톡 참고하기

형상관리 시스템: 프로젝트를 진행하면서 git같은 시스템을 이용하여 다수의 개발자가 이용하여
협업하는 시스템
필요한 이유: 소스 코드의 변경 사항을 보존하기 위해
버그 및 문제점 발생시 추적 가능
백업을 했다면 과거에 있는 소스도 확인 가능 
협동 작업을 위해서

가비지 컬렉터: 메모리가 부족하여 주소를 잃어버려서 사용할수 없는 메모리가 되는것

[16일차]
.git/ 폴더 용도: 백업 폴더 이 폴더를 지우면 백업이 불가능하다 지우지 않도록 조심하자
로컬저장소에 백업하는법: 백업할 폴더를 만들고 거기에 시키는대로 하자
저장소와 원격 저장소 연결법 : git remote add 이름 주소 
git add . git commit -m "백업할 이름 " git push로 저장

import java.util.Scanner;
Scanner scanner = new Scanner(System.in);으로 키보드 입력 사용 가능

class란 그 파일을 담을 틀같은 존재
인스턴스란 객체를 소프트웨어에 실체화 한것 
[17일차]
자바에서 제공하는 연산자 순서대로 
[] , .  << ()++ ()-- <<++() --() + - ~ ! (type) << * / % << + - << ( << >> >>>) << < > <= >= << == !=

암시적 형변환 : 더 큰 데이터타입이 작은 데이터 타입이랑 계산할때 큰 데이터타입이 작은데이터 타입을 바뀌는것
명시적 형변환 : 자동 형변환이 일어나지않을때 강제로 바꿔주는것 ex) int b = (int) 10.0F 
부동소수점 비교: cpu나 컴파일러에 따라 값이 다르고 2진수 변환하면 무한 반복하기 땜에 뒤에 값이 다를수 있음

논리 연산자 : &&=and ||=or !=not ^=xor 서로 다를때 1반환 & ,&& 차이는 
&&이 왔을때 앞에 계산이 false이 떳으면 뒤에 계산은 하지않는다 
&이 왔을때는 앞에 계산이 false가 떠도 뒤에 값을 계산한다. 

비트 연산자 :  2<<3 이란 3칸을 앞으로 떙겨 곱으로 만드는거
                  16>>3 이란 3칸을 뒤로 떙겨 분해하는거 앞은 0으로 채움
                   연산을 한번만 할 수 있어서 속도가 매우 빠름.
특정 값을 차단하여 원하는 색을 만들수 있음.
음수를 3칸이동하면 이상한값이 나온다.
 
<<<<<<< HEAD
[18일차]
if를 쓰고 if else 를 쓰고 마지막으로 else로 마무리 
엔트리 포인트란 자바 프로그램의 시작지점이다 >> main() 메서드
[19일차]

자바 홈과 패스를 설정하는 이유는 컴파일을 할때 일일이 경로를 지정해주기가 힘들어서 
패스를 설정하므로써 고생을 덜어준다 

build gradle에서 eclipse { 
                      project {
                    name = "myproject"
             }
         }

메서드: 코드를 관리하기 쉽고 재사용하기 좋게 기능 단위로 묶어 놓는 문법
 반복적으로 자주 사용하는 명령어를 재사용하기 위해 묶어놓은 것 

메서드 시그니처 : 메서드명, 변수선언 
메서드 몸체 : 메서드 블록
파라미터: 메서드를 정하고 안에 들어있는 변수 
아규먼트: 그 변수의 값들

메서드 문법 사용 이점 : 메서드를 사용하면 기능별로 묶여 있어 유지보수가 쉬워지고 
                              반복적으로 사용할때 시간을 절약 할 수 있음.

리팩토링: 코드 짠걸 더 나은 디자인으로 개선하는거 
            보기 좋게 만드는걸 의미한다.


[20일차] 
클래스 문법의 용도 변수를 낱개로 다루면 유지보수가 힘들어진다
                         대량의 변수를 관리를 위해서는 클래스 문법을 사용하도록 하자
[21일차]
클래스 문법 데이터 타입: 인스턴스 레퍼런스 타입
클래스 데이터 타입 이점:
인스턴스:  new 클래스명();  << 이렇게 메모리를 생성하는것 
레퍼런스:  메모리의 주소를 저장하는 변수  
클래스 메서드: static이 붙음 인스턴트 메서드 static이 붙지않음
[22일차]

[25일차]
가비지: 주소를 잃어버려 사용할 수 없는 메모리를 부르는 말
가비지 컬렉터: 힙 메모리에 존재하는 가비지를 찾아 제거하는일
실행되는 이유: 메모리가 부족할떄 cpu가 부족할떄
system.gc(): 가비지 청소

Command 패턴 << design partern >> 특정 상황에 대한 설계 기법 (유지 보수에 좋다)
 ㄴ 사용자의 요청 처리를 한 개의 메서드가 담당할 때
 기존 코드:    명령어가 추가 >  명령어를 처리할 메서드 추가 > 기존 코드를 변경 > 버그 발생 가능성 증가

(command 패턴 )
변경 코드 : 명령어를 처리하는 메서드를 객체화 > 메서드를 별도의 클래스로 분리 > 새 클래스 추가 > 기존 코드 변경x
커맨드 디자인 패턴: 
메서드를 별개의 클래스로 분리 
유지 보수가 하기 쉬워진다  


등록은 Array
지우거나 변경은 Linked

순서 : 명령어를 클래스로 나누기 >> 데이터를 공유하기 위한 ArrayList 생성 >
 추상 클래스를 만들어 슈퍼 클래스로 정의  >> 모든 클래스에 상속해주기 >> 추상클래스로 바꿔주기 
memberHandler에서 class 앞에 private protected public 셋중에서  잘 모르겠으면 default를써라 

멤버 클래스에서 줄떄 상속클래스에서 줄 수 있지만 add 와 update에 따로 주는 이유는 
member클래스를 add와 update만 받는다.  상속클래스에 두면 선택이 아닌 필수가 되기 떄문에 

project Board-a에다 게시판을 만들어보기 

## 18일차(2021-01-15,금)

- 자바 언어 기초(com.eomcs.lang)
    - ex06 : 명령어의 실행 흐름을 제어하는 방법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    -  4 단계: 배열과 흐름 제어문 활용하기
    -  5 단계: 프로그램의 시작점(entry point), `main()`
- 학습 목표 달성 확인 목록
    - [] if, if ~ else 문을 사용하여 조건에 따라 흐름을 제어할 수 있는가?
    - [] while, do ~ while, for(;;), for(:) 문을 사용하여 반복 작업을 처리할 수 있는가?
    - [] 프로그램의 엔트리 포인트가 무슨 의미인지 알고 있는가?
s
## 19일차(2021-01-18,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    -  6 단계: 메서드의 존재 이유
- 학습 목표 달성 확인 목록
    - [] 환경 변수 JAVA_HOME과 PATH를 설정하고 그 용도를 설명할 수 있는가?
    - [] gradle 설정을 통하여 이클립스 프로젝트 이름을 변경할 수 있는가?
    - [] 메서드를 정의할 수 있는가?
    - [] 정의한 메서드를 사용할 수 있는가?
    - [] 메서드 시그너처, 메서드 바디, 파라미터, 아규먼트 용어를 설명할 수 있는가?
    - [] 메서드 문법을 사용했을 때 이점은 무엇인가?
    - [] 리팩토링의 의미가 무엇인지 아는가?
        - 코드를 묶거나 쪼개서 유지보수 하기 좋은 구조로 소스 코드를 정리하는 것!

## 20일차(2021-01-19,화)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(계속)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 6 단계: 메서드의 존재 이유(계속)
    - 7 단계: 클래스로 메서드를 분류하기
- 학습 목표 달성 확인 목록
    - [] 메서드를 정의하고 사용할 수 있는가?
    - [] 파라미터와 아규먼트에 대해 설명할 수 있는가?
    - [] call by value 와 call by reference에 대해 예제를 들어 설명할 수 있는가?
    - [] 클래스 문법의 용도를 설명할 수 있는가?
    - [] 역할에 따라 메서드를 분류하여 클래스로 정의할 수 있는가?
    - [] 클래스에 등록된 메서드를 호출할 수 있는가?

## 21일차(2021-01-20,수)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(계속)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 7 단계: 클래스로 메서드를 분류하기(계속)
    - 8 단계: 클래스를 이용하여 새 데이터 타입 정의하기
    - 9 단계: 패키지로 클래스를 분류하기
- 학습 목표 달성 확인 목록
    - [] 클래스 문법을 이용하여 새 데이터 타입을 정의할 수 있는가?
    - [] 클래스로 데이터 타입을 정의하여 사용할 때 이점은 무엇인가?
    - [] 인스턴스와 레퍼런스 개념을 이해하는가?
    - [] 클래스의 인스턴스를 생성할 수 있는가?
    - [] 레퍼런스 배열을 생성하고 다룰 수 있는가?
    - [] 인스턴스를 레퍼런스 배열로 다룰 수 있는가?
    - 

    ## 22일차(2021-01-20,수)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(보류)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 7 단계: 클래스로 메서드를 분류하기(계속)
    - 8 단계: 클래스를 이용하여 새 데이터 타입 정의하기
    - 9 단계: 패키지로 클래스를 분류하기
- 학습 목표 달성 확인 목록
    - [] 클래스 문법을 이용하여 새 데이터 타입을 정의할 수 있는가?
    - [] 클래스로 데이터 타입을 정의하여 사용할 때 이점은 무엇인가?
    - [] 인스턴스와 레퍼런스 개념을 이해하는가?
    - [] 클래스의 인스턴스를 생성할 수 있는가?
    - [] 레퍼런스 배열을 생성하고 다룰 수 있는가?
    - [] 인스턴스를 레퍼런스 배열로 다룰 수 있는가?

## 23일차(2021-01-21,목)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(보류)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 10 단계: 다른 클래스와 관계 맺기 : 의존 관계
    - 11 단계: 클래스 필드와 클래스 메서드의 한계
- 학습 목표 달성 확인 목록
    - [] UML이 무엇이고 어떤 용도로 사용하는지 아는가?
    - [] 의존 객체(dependency)가 무엇인지 이해하는가?
    - [] GRASP 패턴이 무엇인지 아는가?
    - [] Information Expert 패턴에 대해 이해하는가?
    - [] domain, vo(value object), dto(data transfer object) 클래스의 의미를 이해하는가? 
    - [] 스태틱 필드의 사용 범위와 그 한계를 이해하는가?
    - [] '기술 부채'가 무엇인지 설명할 수 있는가?


## 24일차(2021-01-22,금)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(보류)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 12-a 단계: 인스턴스 필드와 인스턴스 메서드가 필요한 이유 : 인스턴스 필드 사용법
    - 12-b 단계: 인스턴스 필드와 인스턴스 메서드가 필요한 이유 : Information Expert 디자인 패턴
    - 12-c 단계: 인스턴스 필드와 인스턴스 메서드가 필요한 이유 : 인스턴스 메서드 도입
- 학습 목표 달성 확인 목록
    - [] 클래스 로딩이 무엇인지 설명할 수 있는가?
    - [] 스태틱 필드와 인스턴스 필드의 생성 시점을 이해하는가?
    - [] Method Area와 Heap, Stack 메모리 영역의 쓰임새를 이해하는가?
    - [] 가비지가 무엇인지 설명할 수 있는가?
    - [] 스태틱 필드의 쓰임새를 아는가?
    - [] 인스턴스 필드의 쓰임새를 아는가?
    - [] 인스턴스 메서드의 쓰임새를 아는가?
    - [] 인스턴스 메서드의 내장 변수인 this를 설명할 수 있는가?
    메서드 아레나: 스택틱 필드 = 클래스 필드
힙 : 인스턴스 필드(변수)
스택 : 로컬 변수

가비지 : 주소를 잃어 버려서 사용할 수 없는것 
new BoardHadnler(); 를 하면 오류 발생 : static이 없는걸 주소로 받기 때문

객체 지향 프로그램: 나중에 확장할 것을 대비해서 프로그램을 짜는거


## 25일차(2021-01-25,월)

- 자바 언어 기초(com.eomcs.lang)
    - ex07 : 메서드를 활용하여 명령을 기능 단위로 분리하는 방법(완료)
- 객체지향 문법(com.eomcs.oop)
    - ex01 : 레퍼런스와 인스턴스, 가비지, 가비지 컬렉터 등
    - ex02 : 스태틱 필드/메서드와, 인스턴스 필드/메서드 사용법
    - ex03 : 인스턴스 메서드의 this 내장 변수 용도(Exam0320 까지) 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 13 단계: 의존 객체 주입 : 
- 학습 목표 달성 확인 목록
    - [] 가비지의 의미를 알고 있는가?
    - [] 레퍼런스 카운트란 무엇인가?
    - [] 가비지 컬렉터는 무엇인지 알고 있는가?
    - [] 가비지 컬렉터가 실행되는 경우는 언제인가?
    - [] System.gc() 메서드는 무슨 일을 하는가?



    ## 26일차(2021-01-26,화)

- 객체지향 문법(com.eomcs.oop)
    - ex03 : 인스턴스 메서드의 this 내장 변수 용도(Exam0410 부터) 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 13-b 단계: 의존 객체 주입 : 생성자 활용
- 학습 목표 달성 확인 목록
    - [] 생성자 문법의 용도를 설명할 수 있는가?
    - [] 생성자를 이용하여 인스턴스 필드를 초기화시킬 수 있는가?
    - [] 스태틱 변수 초기화 문장을 사용할 수 있는가?
    - [] 스태틱 블록을 이용하여 스태틱 변수를 초기화시킬 수 있는가?
    - [] 스태틱 블록이 여러 개일 경우 컴파일러가 어떻게 다루는지 아는가?
    - [] 스태틱 변수 초기화 문장이 컴파일되면 어떻게 바뀌는지 아는가?
    - [] 클래스 로딩할 때 어떻게 초기화 과정이 어떻게 진행되는지 이해하는가?
    - [] 인스턴스 블록을 이용하여 인스턴스 변수를 초기화시킬 수 있는가?
    - [] 인스턴스 블록이 컴파일되면 어떻게 바뀌는지 아는가?
    - [] 인스턴스 변수 초기화 문장이 컴파일되면 어떻게 바뀌는지 아는가?
    - [] 인스턴스 블록의 용도를 아는가?
    필드를 초기화 시크는 문법 
1. 생성자  클래스 이름과 똑같은 걸로 만들면된다 반환값이 필요없다
2. 스태틱 블록 : class A {  
                         static int a;         클래스를 로딩한후에 자동으로 실행
                               static {  
                            a = 100; 
                              }
3. 인스턴스 블록 :  int a;   >> a= 100;            생성자에 삽입됨

4. 변수 초기화 문장 : int a = 100;          생성자 또는 스태틱 블록에 삽입

스태틱 선언은 맨위나 아래로 

인스턴스 변수는 스태틱 변수로 합체됨

인스턴스 필드 초기화 : 변수를 선언하면 된다.
스태틱 변수 초기화 : static 선언뒤 블록 안에다 값을 넣기
맨 아래꺼만 컴파일 한다cd

## 27일차(2021-01-27,수)

- 객체지향 문법(com.eomcs.oop)
    - ex04 : 다양한 클래스의 생성자 활용 
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 14 단계: CRUD(Create, Retrieve/Read, Update, Delete) 구현
- 과제 : 개인 프로젝트 중간 발표
- 학습 목표 달성 확인 목록
    - [] JVM의 file.encoding 프로퍼티의 용도를 알고 있는가?
    - [] file.encoding 프로퍼티를 설정하지 않으면 기본 character set 은 무엇인가?
    - [] 클래스 멤버 @Deprecated 애노테이션이 붙은 경우 무엇을 의미하는지 아는가? 
    - [] 생성자의 접근 범위가 private이나 protected 으로 막혔을 때 그 의미를 이해하는가?
    - [] 인스턴스 메서드와 스태틱 메서드의 용도를 이해했는가?
    - [] 상수를 사용하는 이점과 용법을 알고 있는가?
    - [] 배열을 활용하여 생성된 객체(의 주소)를 등록하고, 조회하고, 변경하고, 삭제할 수 있는가?


## 28일차(2021-01-28,목)

- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 14 단계: CRUD(Create, Retrieve/Read, Update, Delete) 구현(계속)
    - 14-x 단계: CRUD(Create, Retrieve/Read, Update, Delete) 구현 - 메뉴 다루기와 역할 분담
- 과제 : 개인 프로젝트 중간 발표(계속)
- 학습 목표 달성 확인 목록
    - [] CRUD 를 구현할 수 있는가?
    - [] 리팩토링 기법 중에서 `extract method`와 `replace temp with query`의 의미를 이해하는가?

## 30일차(2021-02-02,화)

- 객체지향 문법(com.eomcs.oop)
    - ex08 : 캡슐화 문법 사용
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 17 단계:  캡슐화와 접근 제어 : 세터(setter) / 게터(getter)
- 학습 목표 달성 확인 목록
    - [] 추상화에 대해 설명할 수 있는가?
    - [] 캡슐화가 무엇인지 설명할 수 있는가?
    - [] 캡슐화를 보조하는 접근 제어 문법을 이해하는가?
    - [] private/(default)/projected/public 의 접근 범위를 설명할 수 있는가?
    - [] getter와 setter를 정의하고 사용할 수 있는가?
    - [] 필드(field)와 프로퍼티(property)의 차이점을 아는가?
    - [] 상속의 의미와 이점을 이해하는가?
    - [] 다형성의 3대 유형을 설명할 수 있는가?
    - [] 다형적 변수를 다룰 수 있는가?
    - [] 오버로딩의 의미와 그 이점을 설명할 수있는가?
    - [] 오버라이딩이 의미와 그 이점을 설명할 수 있는가?

## 31일차(2021-02-03,수)

- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex01 : 캡슐화 문법 사용
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 18-a 단계: 다형성 활용 : 다형적 변수와 형변환
    - 18-b 단계: 다형성 활용 : 오버라이딩과 오버로딩 
- 학습 목표 달성 확인 목록
    - [] 클래스를 정의할 때 수퍼 클래스를 지정하지 않으면 어떻게 되는지 아는가?
    - [] Object 클래스의 toString() 리턴 값을 이해하는가?
    - [] Object 클래스의 equals(), hashCode() 메서드의 기능을 이해하는가?
    - [] Object 클래스의 메서드를 어떤 상황에서 오버라이딩 해야 하는지 아는가?

## 32일차(2021-02-04,목)

- 객체지향 문법(com.eomcs.oop)
    - ex05 : 상속 문법의 용도 및 사용법
- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex02 : 문자열, 날짜, 래퍼(wrapper) 클래스 사용법
- 학습 목표 달성 확인 목록
    - [] mutable 객체와 immutable 객체의 차이를 예를 들어 설명할 수 있는가?
    - [] 리터럴로 만든 String 객체와 new 로 만든 String 객체의 차이점을 설명할 수 있는가?
    - [] 래퍼(wrapper) 클래스의 용도와 사용법을 알고 있는가?
    - [] java.util.Date, java.sql.Date, java.util.Calendar 클래스를 사용할 수 있는가?
    - [] 기능을 확장하기 위해 사용하는 기법의 유형을 설명할 수 있는가?
    - [] 상속을 이용하여 기능을 확장할 수 있는가?
    - [] 수퍼 클래스와 서브 클래스의 용어를 이해하는가?
    - [] 상속 관계에 있는 클래스의 인스턴스 생성 과정을 이해하는가?
    - [] 상속 관계에 있는 클래스의 생성자 호출 과정을 이해하는가?
    - [] 수퍼 클래스의 생성자를 호출하는 `super()` 의 사용법을 아는가?
    - [] 자바에서 다중 상속을 지원하지 않는 이유를 아는가?
    - [] specialization과 generalization 상속 기법을 설명할 수 있는가?
    - [] 추상 클래스의 용도와 사용법을 아는가?
    - [] 추상 메서드의 용도와 사용법을 아는가?

    Cac c = new Sedan();
     ㄴ Car 클래스 레퍼런스 Car 타입 레퍼런스 Car 타입 변수  
   ==>  c.class에 주소를 담고 c.vehicle c.model c.capacity 컴파일  

Sedan c = new Car();
     ==>  하위 클래스가 상위 클래스를 가르켜서 컴파일 x 오류가 뜬다.

Sedan s = (Sedan)c;
s.sunloof  s.auto  이렇게 해야 Sedan의 클래스까지 사용가능 

주의 할 점: Car c = new Car(); 

오버라이딩 : 상속 받은걸 역활에 맞게 재정의

사용전 : 새로운 메서드 추가 
적용 : 메서드 재정의 
필드 오버라이딩 : 메서드 오버라이딩

this ==> test 가 속해있는 클래스에서 찾아 올라감
super ==> 수퍼 클스에서 찾아 올라간다

final : 이걸 쓰면 서브 클래스 못만듬
쓰는 이유 : 서브 클래스를 통한 기능 변경을 차단할떄  

참조변수는 서브 클래스의 객체도 봐아서 보안이 깨질수도 있음.
stack 구조 : LIFO구조 사용  가장 먼저 들어온게 가장 늦게 빠짐
= > 경로를 이전으로 되돌리떄 사용함
Queue 구조 : 
= > 예약 관리 시스템과 네트워킹에서 연결된 순서대로 사용
## 33일차(2021-02-05,금)

- 객체지향 문법(com.eomcs.oop)
    - ex06 : 다형성의 활용 및 final 사용법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 19-a 단계: 자료구조 구현과 활용 : 스택 구현과 사용
- 학습 목표 달성 확인 목록
    - [] 다형적 변수를 활용할 수 있는가?
    - [] 컴파일러에서 다형적 변수의 사용 법위를 어디까지 허용하는지 아는가?
    - [] JVM에서 다형적 변수의 사용 범위를 어디까지 허용하는지 아는가?
    - [] 레퍼런스를 타입 캐스팅하는 방법을 아는가?
    - [] final 제한자의 사용법을 아는가?
    - [] 스택과 큐의 구동 원리는 이해하는가?
    - [] 스택과 큐를 언제 적용해야 하는지 예를 들어 설명할 수 있는가?
    - [] 스택을 구현할 수 있는가?


## 34일차(2021-02-08,월)

- 객체지향 문법(com.eomcs.oop)
    - ex08 : 캡슐화에서 protected 활용(복습)
- 자바 기본 클래스 사용법(com.eomcs.basic)
    - ex01 : Exam0170 ~ Exam0175, clone()을 이용한 인스턴스 shallow copy, deep copy
- 알고리즘(com.eomcs.algorithm.data_structure)
    - queue, stack : 큐, 스택 구현 방법 및 사용법(복습)
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 19-a 단계: 자료구조 구현과 활용 : 스택 구현과 사용(계속)
    - 19-b 단계: 자료구조 구현과 활용 : 큐 구현과 사용
    - 20-a 단계: `Iterator` 디자인 패턴 : 데이터 조회 기능을 캡슐화
    - 20-b 단계: `Iterator` 디자인 패턴 : XxxIterator 에 대해 Generalization 수행 
- 학습 목표 달성 확인 목록
    - [] private/(default)/protected/public 접근 제어를 이해하는가?
    - [] 오버라이딩하는 메서드의 리턴 타입이 어디까지 허용되는지 아는가?
    - [] Object의 clone()을 이용하여 인스턴스 복제를 처리할 수 있는가?
    - [] 인스턴스 복제 기능을 활성화시키는 방법을 아는가?
    - [] clone() 메서드를 사용하기 위해 필요한 조치 사항을 아는가?
    - [] 인스턴스 복제에서 shallow copy와 deep copy의 차이점을 아는가?
    - [] 큐를 구현할 수 있는가?
    - [] Iterator 패턴의 특징을 이해하고 구현할 수 있는가?
    - [] 상속의 기법에서 일반화(generalization)와 전문화(specialization)를 구현할 수 있는가?

## 35일차(2021-02-09,화)

- 객체지향 문법(com.eomcs.oop)
    - ex07 : 추상 클래스와 인터페이스 사용법
- 실습 프로젝트 : mini-pms(프로젝트 관리 시스템)
    - 20-c 단계: `Iterator` 디자인 패턴 : Iterator 패턴에 인터페이스 문법 적용
    - 20-d 단계: `Iterator` 디자인 패턴 : GRASP의 Creator 패턴 적용
    - 20-e 단계: `Iterator` 디자인 패턴 : 스태틱 중첩 클래스(static nested class) 활용
    - 20-f 단계: `Iterator` 디자인 패턴 : 논스태틱 중첩 클래스(inner class) 활용
    - 20-g 단계: `Iterator` 디자인 패턴 : 로컬 클래스(local class) 활용
    - 20-h 단계: `Iterator` 디자인 패턴 : 익명 클래스(anonymous class) 활용
- 학습 목표 달성 확인 목록

추상 클래스 : 여러 개의 서브 클래스를 받는 슈퍼 클래스를 만들때 
                  인터페이스 구현을 간결하게 만들수 있다. 
인터페이스: 사용 규칙 정의 
deafault : 기존 코드에 영향을 안줄때 쓰는거 

스태틱 중첩 클래스와 논스태틱 중첩 클래스 차이 : 중첩 클래스는 인스턴스 사용 불가 (this 사용불가)
논스태틱은 파라미터와 인스턴스가 자동 생성

ArrayList는 입력  LinkedList는 삽입 삭제를 쓸때 유용하다

HashSet은 메서드의 리턴값이 같고 내용물이 같을 떄 쓴다.

시스템 예외(Error) : JVM에서 발생하여 개발자가 처리할 수 없는거
ㄴ적적히 안내 메세지를 띄우거나 log 파일을 남기고, 
  현재 작업 중인 데이터를 백업한 후
  애플리케이션 종료

애플리케이션 예외(Exception) : 개발자가 처리 가능
  ㄴ 오류에  대한 적절한 조치를 취한 후
      애플리케이션을 실행한다.

throw 예외객체;
          ㄴ Throwable 객체
                 ㄴ 보통 애플리케이션 예외 객체를 던진다
                            ㄴ 즉 Exception 객체

예외 처리 
ty { 
예외를 던지는 메서드 호출 or throw 명령을 사용하여 명시적으로 예외를 던질 때 
} catch ( 예외객체를 받는 파라미터} {
예외 처리 코드 }

예외 처리를 호출자에게 위임하기

void m1() throws 예외 클래스, 예외 클래스, ....{
    예외 발생 코드 <- m1()을 호출한 쪽에서 예외를 처리해야한다.
}

try fianll 을쓰면 catch없이 쓸 수있다.

예외를 던지면 받아야한다.

Exception : 개발자에게 예외를 강조한다.
RuntimeException : 예외 처리 강조를 하지 않는다.
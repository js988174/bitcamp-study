# bitcamp-20201221

## 원격 Git 서버의 저장소 복제하기

```
> git clone https://github.com/eomjinyoung/bitcamp-20201221.git
```

## 작업 파일을 로컬 저장소에 백업하기

백업 명단 작성
```
> git add .
```

로컬 저장소에 백업
```
> git commit -m "백업에 대한 간단한 내용"
```

## 로컬 저장소의 변경된 내용을 서버 저장소에 업로드 하기

```
> git push
```

## 깃 서버 저장소의 변경된 내용을 깃 로컬 저장소에 다운로드 하기

```
> git pull
```

## 1일차(2020-12-21,월) ~ 8일차(2020-12-31,목)

- 자바 프로그래밍 오리엔테이션

## 9일차(2021-01-04,월)

- 수업에서 사용할 git 저장소 준비
    - github.com 에 개인 저장소 생성
        - 회원가입
        - bitcamp-study 저장소 생성
    - 로컬에 복제
        - c:/Users/사용자홈폴더/git/bitcamp-study 
    - 강의 자료 저장소 복제
        - github.com/eomcs/eomcs-docs : DB 설치, 개발 도구 사용법 등
        - github.com/eomcs/eomcs-java : 자바 프로그래밍 기본 예제
        - github.com/eomcs/eomcs-java-web : 서블릿/JSP 프로그래밍 예제
        - github.com/eomcs/eomcs-spring-webmvc : Spring WebMVC 예제
        - github.com/eomcs/eomcs-java-project-2020 : 실습 프로젝트
        - github.com/eomcs/eomcs-java-project-2021 : 실습 프로젝트
- 프로그래밍에 대한 소개
    - 컴퓨터(CPU, RAM, HDD 등) + OS + 프로그램 개념

- 학습 목표 달성 확인 목록
    - [] 서버 컴퓨터와 서버 프로그램의 관계를 이해하는가?
        정보를 제공하는 프로그램과 그 정보를 제공하는 서버를 담당하는 컴퓨터
        서버를 구성하는 OS에 따라 종류가 나뉨
    - [] 서버 프로그램과 데스크톱 프로그램을 구분할 수 있는가?
        서버 프로그램은 계산 수행과 서버 유지에 있어서 365일 내내 돌아감
        (페이스북 온라인 게임은 서버 프로그램 구조)
    - [] 클라이언트 프로그램이 무엇인지 이해하고 있는가?
        구조는 서버와 정보를 주고 받는것 
        ex)게임 클라이언트는 우리 pc 즉 하나의 서버에다 새로운 정보를 줘서 업데이트를 
        받게함.
    - [] 클라이언트/서버 구조로 된 애플리케이션의 예를 들 수 있는가?
         게임 앱 홈페이지 웹
    - [] git 클라이언트 프로그램을 설치할 수 있는가?
    - [] macOS 패키지 관리자 프로그램인 HomeBrew 를 설치할 수 있는가?
    - [] HomeBrew 패키지 관리자를 통해 git 프로그램을 설치할 수 있는가?
    - [] github.com에서 깃 저장소를 생성할 수 있는가?
         파일 만들기
    - [] git 서버의 저장소를 로컬로 복제할 수 있는가?
         git clone 복제할 주소
    - [] 로컬에서 작업한 파일을 로컬 깃 저장소에 백업할 수 있는가?
         강사님 파일에 git pull 엔터
    - [] 로컬 깃 저장소에 백업한 내용을 깃 서버의 저장소에 업로드 할 수 있는가?
         git add .  git commit -m "."  git push
    - [] 컴퓨터에서 CPU와 RAM, HDD 의 관계 및 역할을 이해하고 있는가?
         처리 속도 CPU >> RAM >> HDD 
         HDD의 속도가 매우 느려 RAM에 저장됨 그다음 CPU가 계산 
         CPU가 계산할 정보를 렘에다 저장했다 CPU가 계산 CPU는 뇌 RAM은 저장장치
    - [] OS의 역할을 대략적으로 이해하는가?
         자원 관리와 시스템 관리를 효과적으로 하기 위해 만들어진것 
         즉 컴퓨터가 사용자를 편하게 해줄려고 만든 소프트웨어이다.
    - [] 명령어를 작성할 때 CPU에 맞춰서 작성해야 하고 또한 OS에 맞춰서 명령어를 구성해야 하는 이유를 설명할 수 있는가?
         cpu마다 명령어가 다르다.  OS마다 프로그래밍언어가 다르기 때문에 
         ex) window가 1101010을 게임 실행    리눅스가 1101010을 게임 종료 
    - [] 명령어를 작성할 때 컴파일러의 역할은 무엇인가?
         기계어로된 프로그램을 출력하기 위해 사용되는 언어 번역 프로그램
    - [] 컴파일러가 OS와 CPU에 따라 구분되는 이유를 아는가?
         빌드 과정이 다르기 때문에
    - [] 자바 컴파일러가 들어 있는 JDK를 설치할 때 OS와 CPU에 따라 구분해야 하는 이유를 아는가?
         구분하지 않으면 os가 인식하는 언어가 다르기 때문에 
    - [] 자바 컴파일러와 JVM의 역할을 설명할 수 있는가?
         자바 컴파일러는 기계어와 유사한 언어 
         jvm이란 바이트 코드를 OS에 맞게 해석 해주는 역활(OS상관없이 실행)
         바이트 코드는 기계어가 아니라 실행이 안되지만 jvm이 해결해줌
    - [] 소스(source)와 바이트코드(bytecode)를 설명할 수 있는가?
         사람은 이해할 수 있지만 컴퓨터는 이해할수 없는게 소스 
         바이트 코드는 가상 머신용 기계어로 이루어진 코드 
         가상 언어만 이해할수 있다.
    - [] 자바 컴파일러를 사용하여 소스 파일을 컴파일 할 수 있는가?
          javac
    - [] JVM을 사용하여 바이트코드를 실행할 수 있는가?
          바이트 코드는 가상 언어만 가능하기떄문에 JVM으로 실행할 수 있다.
    - [] 컴파일 방식과 인터프리터 방식의 차이점과 장단점을 이해하는가?
         컴파일은 재구성을함  인터프리터는 중간형태의 언어로 변형 시킴
          실행 속도가 빠름          실행 속도가 느림
    - [] 자바는 하이브리드 방식으로 프로그램을 개발하고 실행한다. 하이브리드 방식을 설명할 수 있는가?
          컴파일과 인터프리터의 기법을 모두 사용한 방법으로 중간코드로 만든다.
          중간 코드로 만들면 직접 실행 시킬수 없지만 높은 이식성으로 다른os에 호환이 
          된다.


## 11일차(2021-01-06,수)

- 바이트코드 프로그래밍 
    - 직접 바이트코드를 작성해보기
    - 자바 언어를 이용한 프로그래밍의 이점을 이해하기
    - sublime 에디터 설치
    - HelloWorld.class 작성하기
    - https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad
- 학습 목표 달성 확인 목록
    - [] bytecode(portable code, p-code) 가 무엇인지 이해하는가?
    - [] 바이트코드를 직접 작성하는 것보다 소스 파일을 작성해서 컴파일하는 것이 낫다는 것을 이해하는가?
    - [] 빌드 도구가 무슨 일을 하는지 알고 있는가?
    - [] 대표적인 자바 빌드 도구의 종류를 말할 수 있는가? 
    - [] 각 빌드 도구의 설정 파일을 구분할 수 있는가?
    - [] 중간 언어를 이용하는 vm 방식과 LLVM 방식의 특징을 이해하는가? 

## 12일차(2021-01-07,목)

- 자바 언어 기초(com.eomcs.lang)
    - ex01 ~ ex03 예제 
- Gradle 빌드 도구 설치
    - gradle.org 사이트에서 다운로드 후 설치 및 설정
    - .gitignore 파일 추가
- 이클립스로 프로젝트 임포트
    
- 학습 목표 달성 확인 목록
    - [] 자바 소스 파일과 class {} 블록, 컴파일러의 관계를 이해하는가?
    - [] 공개 클래스와 디폴트 클래스, 소스 파일명의 관계를 이해하는가?
    - [] 자바 패키지의 목적을 이해하는가?
    - [] 패키지에 소속된 클래스를 정의할 수 있는가?
    - [] 패키지에 소속된 클래스와 무소속 클래스를 컴파일하면 어떻게 되는지 알고 있는가?
    - [] 패키지에 소속된 클래스를 JVM으로 실행할 수 있는가?
    - [] 일반 주석과 javadoc 주석, 애노테이션의 용도를 이해하는가?
    - [] javadoc 프로그램을 사용하여 API 문서를 생성할 수 있는가?
    - [] 메모리와 비트, 2진수의 관계를 이해하는가?
    - [] 비트 크기에 따라 저장할 수 있는 수의 범위를 계산할 수 있는가?
    - [] 메모리에 정수 값을 저장할 때 음수를 어떻게 저장하는지 알고 있는가?
    - [] 2의 보수가 무엇인지 아는가? 2의 보수를 사용하여 양수를 음수로 바꿀 수 있는가?
    - [] 자바 언어에서 정수 리터럴을 4바이트와 8바이트로 구분하여 표현할 수 있는가?
    - [] Gradle 빌드 도구를 설치하고 실행할 수 있는가?
    - [] build.gradle 설정 파일을 작성하고, 플러그인 추가/라이브러리 등록 을 할 수 있는가?
    - [] Gradle을 이용하여 이클립스 설정 파일을 생성할 수 있는가?
    - [] 이클립스에서 프로젝트를 임포트 할 수 있는가? 
    - [] .gitignore 파일의 용도를 알고 있는가?
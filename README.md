# bitcamp-20201221
[9일차]
1.프로 젝트 임포트 하기까지 추가해야하는것 정리
폴더를 만든다 > git ignore 파일을 넣어준다 > github에 폴더를 만든다 
 > git clone 주소를 해준다. 
 > gradle init 을 해줘서 설정해준다 > build.gradle 파일에서 id java id eclipse 
   UTF-8 설정 , 이름 바꾸기, mainclass 이름을 설정 해준다 > cmd에서 gradle eclipse 해준다
 >이클립스에서 import 해주기 > README를 resources 와 test에 넣는다.

2.gitignore 파일에 추가 해야할것 정리
gitignore에 java linux java web visual studio code node eclipse window macos gradle 
추가하고 
.project에 있는 #지우고 .classpath 추가
맨 마지막에
*.exe  
node_modules/
temp/
Debug/
Release/
html-exam/ 

3. 개발 환경 셋팅법
자바 스크립트 다운 받는곳 : nodejs.org   node-v 구버젼 다운받기 
mingw (1,2,7)다운  cmd에서 gu install native-image 로 설치
graalvm.ce.java에서 11버젼 다운(11버젼을 많이씀)
자바 환경 변수 설정 path에 추가하고 새로 만들기에서 11버젼 bin까지 들어가주기
이클립스 develope 다운   naver d2 coding 글꼴 다운 
git hub eclipse java google style xml 다운


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
메서드
자료형 이름 (변수명, 변수명) {
    행위;
}
메서드 호출
객체 이름.메서드 이름();

파라미터: 전달되는 값을 넘겨 받을 때 쓰이는 변수
아규먼트: 함수에 전달 되는 실제의 의미 있는 값 

Call by value는 메서드 호출 시에 사용되는 인자의 메모리에 저장되어 있는 값(value)을 복사하여 보낸다.
Call by reference는 메서드 호출 시 사용되는 인자 값의 메모리에 저장되어있는 주소(Address)를 복사하여 보낸다.

클래스에서 메서드 호출 방법
내부 : 타입 변수 = 메서드(값)
외부 : 클래스 참조변수 = new 클래스(매개변수);

[21일차]
객체란 표현할수 있는 속성과 동작으로 이루어진것 
인스턴스란 객체를 생성하여 메모리에 적재하는것
레퍼런스: 인스턴스를 가르키는 값
[22일차]
DAO : DB를 사용해 데이터 조회 조작 기능
DTO 또는 VO :계층 간의 데이터 전달에 사용하는 데이터 객체 
static:
공간적 특성: 멤버는 클래스당 하나가 생성된다
시간적 특성: 클래스 로딩 시에 멤버가 생성된다

static 메서드는 오직 static 멤버만 접근 가능
this 키워드를 사용할 수 없다
[23일차]
클래스 로딩: 하위 클래스는 상위 클래스에게 로딩 위임
하위 클래스는 상위 크래스를 바라볼 수 있지만 그 반대는 안된다.

스택: 원시 타입의 데이터들이 할당되고 실제 값을 직접 저장
힙 : 단 하나의 힙 영역만 존재 레퍼런스 변수가 스택에 올라가게 된다
스태틱으로 선언 되지 않은 모든 변수는 인스턴스 필드
스태틱으로 선언 되지 않은 모든 메소드

인스턴스 메서드의 this는 자기 자신을 가르킨다
[24일차]
Reference Counting은 객체, 메모리 블록, 디스크 공간 등을 참조하는 Reference, Pointer, Handle 의 갯수를 저장하는 기술이다
[25일차]
생성자는 객체를 생성시 바로 값을 가지게 한다.
this()의 사용법은 인스턴스 멤버인 필드를 명시하고자 할떄 사용한다
, 다른 생성자를 생성할때 첫 문장으로 쓴다
static {          // <<<< static 초기화문 
    //수행문;
    }
인스턴스 초기화 블록 용도 : 인스턴스 필드 초기화 시킬때
[26일차]
@Deprecated : 사라질수 있으므로 사용을 자제해달라는 의미이다.
window 기본 character set은 ms 949 
private protected 는 접근 제한 
[27일차]
extract method : 메서드 추출 리팩토링
replace temp with query` : 마틴 파울러 리팩토링에서 보도록하자
[28일차]
배열의 크기 늘리기 미니 프로젝트 참고
linked-list : 노드와 링크로 구성 각 노드들을 연결해서 구현
배열 : 여러개의 데이터를 인덱스에 저장하는 방식
[29일차]
클래스를 분리할떄 이점: 오류를 쉽게 찾고 추가 변경이 쉽다.
[30일차]
추상화 : 필요한 정보들만 간추려서 적는거
캡슐화 : 객체의 필드와 메서드를 한곳으로 묶고, 실제 구현 내용을 외부에 감추는곳
접근자를 한곳에 묶는것을 property라고 한다
상속 : 부모 클래스로 부터 물려받는거 
장점 : 중복 코드를 줄일 수 있다.
오버로딩 : 부모에게 상속 받은 것을 재정의 하는것
오버라이딩 : 상속 관계간의 이름을 정의하는 것
[31일차]
슈퍼클래스를 지정하지 않으면 Object가 슈퍼 클래스가 된다.
toString() : 슈퍼클래스인 Object의 메서드이다.
 클래스명과 해쉬값을 문자열로 리턴함 
 equals() : 인스턴스 내용이 같을떄 확인 하는법
 hashCode() : equals와 마찬가지로 값을 비교할 때 사용
 오버라이딩 : 상속 받은 메서드를 수정하고 싶을 때
 [32일차]
immutable : 값을 담으면 변경할 수 없다 (String객체)
mutable : 원래의 문자열을 변경하고 싶을 떄 사용 (StringBuffer)
 super() : 부모 클래스의 생성자를 호출하기 위해서 사용
 wrapper : primitive 값을 포함하여 모든 값을 쉽게 주고 받기 위함이다.
 리터럴로 만든 String 객체는 문자표기를 하지 않으면 문자가 깨져서 출력된다.
 다중 상속 안하는 이유 : 어떤 슈퍼클래스의 메서드를 오버라이딩 할려는지 모르기떄문
 추상 클래스 : 어떤 기능을 수행할지 모를때 사용 abstract 사용 
            자식 클래스에게 반드시 오버라이딩 해야한다.
 추상 메서드 : 자식 클래스가 부모 클래스를 구현 안할시 반드시 구현하게 만듬
[33일차]
다형적 변수 :  그 클래스의 서브클래스 객체까지 가리킬 수 있다.
            두 개의 클래스가 같은 조상을 가르킬 떄 사용
instance of를 사용하여 레퍼런스에 들어있는 주소가 특정 클래스의 인스턴스인지 검사
final 접근제한자 클래스명 >> final 클래스 사용시 상속 불가
[42일차]
throws: 메서드 호출시 예외를 발생시키고 싶을 경우에만 해당한다.
Exception : try catch로 잡아줘야 한다 그렇지 않으면 컴파일 오류 발생
RuntimeException : 프로그램 오류로 발생하므로 try catch를 사용 안해도 괜찮다.
try-with-resources : close() 메서드를 자동으로 호출해서 자원을 해제시켜준다
finally : 예외 발생과 상관없이 무조권 실행 시킨다.
[43일차]
제네릭: 타입을 미리 지정해주는 것이 아닌 사용자가 값을 지정해주는 것
wildCard<?> : 어떤 타입이든 상관이 없다 (되도록이면 쓰지 말자)
extend 자손 타입만 가능 super 조상 타입만 가능
Runnable : 인자 x 리턴 x Supplier 인자 x 리턴 T 
Consumer : 인자 T 리턴 x   Function 인자 T 리턴 R
Predicate : 인자 T 리턴 boolean
람다 문법은 참고하기 
(매개변수, ...) -> { 실행문 ... }

인스턴스 메서드 레퍼런스 : Function<String, Boolean> f = String::isEmpty;
Boolean result = f.apply("123");
생성자 메서드 레퍼런스 : Supplier<String> s = String::new;



[44일차]
binary file : 전용 app 사용, 특정 형식으로 인코딩 ,생성 변경시 전용 앱 필요
ex) class psd pdf jpeg gif lib 
text file: character set 규칙에 따라 인코딩 , 일반 텍스트 편집기로 생성 변경 가능
ex) docx xlsx ppt c gradle md xml java

sink 타입(직접 읽고 쓰는 클래스)
: FileOutputStream, ByteArrayOutputStream,PipedOutputStream
중간에서 데이터 가공
: BufferedInputStream,DataInputStream,ObjectInputStream
FileInputStream은 바이트단위로 처리를 하고, FileReader는 문자단위로 처리를 한다
인코딩 그 컴퓨터에 맞게 호환성을 바꿀 수 있다 .
java api : 사용자가 쉽게 구현할수 있도록 자바에서 지원해주는것 
데이터 프로세싱 스트림 클래스: 입출력 중간에 데이터 가공해주는 역활

byte를 리턴하면 끝을 나타나는게 없으므로 int로 리턴 
음수의 경우 맨 좌측 비트가 1이 되어 값이 꼬인다.

버퍼 : 속도를 빠르게 해주기 위해 사용 보통:8096byte
[45일차]
상속을 이용하여 입출력 기능을 하면 다중 상속이 불가능하고 코드가 중복이 되는 문제점이 있다.

포함 관계로 기능 확장: 중간에서 데이터를 가공해준다 ex) input 과 ouput으로 나누기
데코레이터 패턴 이란? 바이트 단위 파일 입력 스트림, 보조적으로 받는 스트림을 사용
기능 구현(내 프로젝트 기준) : DataInputStream BufferedInputStream을 묶어서 데코레이터로 사용

ObjectInputStream : 객체의 직렬화 
직렬화 : 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 바이트 형태로 바꾸는기술
serialVersionUID : 역 직렬화 과정에서 값이 맞는지 확인 할때 쓰는거 필수는 아니다.

예외 처리 : 시스템 예외(Error) : JVM에서 발생하여 개발자가 처리할 수 없는거
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
[46일차]
바이너리 파일 : 텍스트 파일 이외에 모든 실행 파일
텍스트 파일 : 글자로 이루어준 파일
Text File > 일반 텍스트 편집기로 변경 (csv, html , css,js) 가 있다 .
          byte Strean class                             character Stream class                                               
  inputStream  outputStream                            writter reader  
File         File(input,output)Stram                        File(wrieer,reader) 
            Byte Array-                                        charArray , String
              piped                                              piped

FileInputStream , FileOutputStream : 바이트 단위로 출력할 수 있는 클래스
InPutStreamReader : 바이트 기반을 스트림으로 연결
BufferedReader: 버퍼를 사용해서 입출력 효율을 높인다 ( 데이터를 라인 단위로 읽는다)
BufferedInputStream: 입출력 효율을 높이기 위해 사용(한 번에 여러 바이트 입출력 가능)
DataInputStream: 데이터를 바이트 스트림으로 입출력하게 해준다
Stream api 등장 전  각 장비마다 API의 사용법이 달라서 프로그래밍이 불편했다
Streaming 기법 H/W에 상광넚이 입출력 프로그래밍이 가능 

메모리를 마음대로 준비 하면 안되는 이유: 서버를 관리 하기 때문


[47일차]

writer/reader을 쓸때 문자열 처리를 자동 수행한다.

FileWrite UTF-8로 설정해서 출력해준다
  ㄴ 앞의 2바이트는 버리고 뒤의 2바이트는  UTF-8로 변환되어 출력
인터페이스 : 기능에 대해서만 선언 한 상태 모든 기능을 추상화로 정의한 것
제네릭 문법 : 타입을 저해서 캄파일시 에러를 방지 하는것, 불필요한 타입 변화를 막는다
[48일차]
메타 데이터 : 데이터를 설명하는 데이터 (마크업=부가데이터=태그 같인용어 )
ex) XML,HTML
CSV : 콤마로 데이터 구분하는 방법
JSON : App간 데이터 교환을 할떄 JSON포멧으로 만든후에 전달
GSON : 역직렬화 해주는거 
Observer :   수동 감시 
객체가 특정 상태에 놓일 떄 어떤 작업을 수행시키고 싶을 경우 
작업의 추가 삭제 

functional interface : 추상메서드가 한 개만 있는 인터페이스 > 람다 문법 적용 가능
일반 클래스  class x .... {}
익명 클래스 new ObjectFactory {}
람다     csvStr -> {}
메서드 레퍼런스 : 클래스명::스태틱    인스턴스::인스턴스메서드    클래스명::new
[49일차]
Networking :한 컴퓨터가 Hub를 통해 다른 컴퓨터들에게 데이터를 줄 수 있음 
데이터를 보내면 모든 컴퓨터에게 다 간다,
router : 경로 알려주는 역활
switch hub : 특정한 컴퓨터에게만 데이터를 줄 수 있음
일반 hub 는 일단 정보를 연결된 컴퓨터에 모두 보내고 받을 컴퓨터만 받는다
gateway : 공유기 같은거

Mac address : ram카드에 있는물리 적인 id= 주소(전부다 id 가 다르다) 

 
 인트라넷 : 내부망 독자적인망(LAN) -> 폐쇄적임망 
WAN : LAN 끼리 묶은 것
Internet : WAN 끼리 묶은 것 

통신 : ip 주소는 16진수로 바꾼뒤 1바이트로 나눈다
ipAddress : 4byte > 최대 약 42억개의 장비에 주소를 부여할 수 있다
         ip 주소거 50억개가 넘어가면서 주소 부족 > 해결하기 위해 private Ip Address가 나옴
                                                                                        ㄴ 공유기 
문제점 : 사설 ip는 데이터를 주고 받을 수가 없다.
모든 장비가 연결되는 상황 > IOT(Internet of Things) > 소형 장비(가로등arduino , Raspberry pi 소형장비)
헤르츠가 높을수록 벽을 뚫을 수가 없다 .

포트 번호란 ? 통신을 접속하기 위한 식별자
port 고정 번호 :  0 ~ 1023 < 유명한 곳들이 사용중 
Https 443 pop3 110     
1024 ~ 49151   < 일반 서버 App이 사용하는 포트 
ㄴ 어떤 포토 번호를 쓸지 개발자가 지정한다
ip address/port : 49152 ~ 65535 동적 번호: os가 임의로 부여 

App1      요청,응답          App2 
요청 하는쪽 : client    응답 하는쪽 : server 
ex) 인터넷 뱅킹 앱   인터넷 뱅킹 서버 
       ATM s/w        
       카톡 메신저            카톡 서버
        네비게이션         네비게이션 서버

ServserSocket 과 Socket 클래스
clien                             ServerSocket
ㄴ socket생성                       ㄴ Server 생성

Socket > getOutputStream() > OutputStream > 데코레이터
            getInputStream() > InputStream > 데코레이터

ServerSocket >> accept()를 하면 Socket 생성 >> 클라이언트축 소켓과 연결됨
      ㄴ 접속 대기열                      ㄴ getOutputStream() > OutputStream > 데코레이터
                                                  getInputStream() > OutputStream > 데코레이터

대기열 : 연결을 끊어도 서버의 대기열에는 클라이언트 정보가 그대로 남아있다.
          클라이언트가 연결을 끊는다고해서 대기열에 빈자리가 생기는 것은 아니다.
해결책: accept()호출 , 대기열에서 클라이언트 정보를 꺼내야한다
[50일차]
Connection-Oriented(연결 지향) : 한번 연결 후 여러 번 데이터 송수신 예) 전화 FTP 
게임 프로토콘
Connectionless(비연결성) : Board casting 데이터 전송 < 특정 목저지를 명시하지 않는다
 예) 편지 , ping
Stateful 방식 : 한번 연결하면 연결을 끊을떄까지 계속 연결 되어 있다.
                온라인 게임을 생각해보자  
Stateless 방식 : 매번 데이터를 송수신 할 때마다 연결 수행 
                114 고객 센터를 생각해보자 
                
therad 개념 : 사용하면 동시에 처리 가능 순서를 가달리지 않아도 된다. 
[51일차]
connectionless : 서버와 연결없이 데이터를 주고 받을 수 있다.
DatagramSocket, DatagramPacket을 사용하여 처리한다.

프로토콜: 클라이언트/서버 간의 통신 규칙
          데이터를 주고 받는 규칙

 HTTP 요청 프로토콜
 --------------------------------
 GET [자원주소] HTTP/1.1 (CRLF)
 Host: [서버주소] (CRLF)
 (CRLF)
[52일차]
통신 프로토콜 : 원거리 통신 장비 사이에서 메시지를 주고 받는 양식과 규칙의 체계이다

[56일차]
Hz : 1초당 일어나는 주기적 현상
멀티태스킹 : 여러 작업이 동시에 진행되는 기법

라운드로빈 스케쥴링: 시간 할당량을 정해 cpu를 처리한다.

우선순위 스케쥴링: cpu버스트가 낮을수록 우선 순위 높다 
cpu를 사용하지 못하는 프로세서들이 무한히 기달리게 된다.

컨텍스트 스위칭 :전 스레드의 문맥 정보 (레지스터 값, 실행중인 스택 정보 등)을 백업받고 백업받아 놓았던 다음 스레드의 문맥정보를 로딩하는 과정

[57일차]
비동기 방식으로 할떄 : 은행에서 한 계좌에100만원을 꺼내고자 할때 
 4명이 100만원을 전부 다 꺼낼수 있음.
 critical section : 한번의 하나의 스레드만 접근을 허용하고자 할때 사용함
 (임계 영역)
 thread safe: 여러 스레드를 사용하면 시스템 자원의 사용, 응답시간, Context Switch 횟수를 줄일 수 있다는 장점을 얻을 수 있다. 대신 데이터의 충돌 문제가 발생할 수 있다.

 mutex : 임계영역에 오직 한개의 스레드만 접근 허용 가능
 semaphore(n) : 임계영역에 n개의 스레드 허용 가능
 pooling: 상태를 지속적으로 체크하는 전송 제어 방식

 [58일차]
 DBMS : 서버에 있는 파일 관리를 쉽게 하기 위해서 
 Assembly언어는 cpu에 따라 다르다
 SQL : DBMS에 상관없이 명령어를 작성할 수 있도록 명령 작성 문법을 통일 시킨것
동적 라이브러리 :- 초기 유닉스 시스템의 유일한 라이브러리 형태
정적 라이브러리 :
- 프로그램에 라이브러리릉 링크하면 실행시에 해당 공유 라이브러리가 필요하다는 정보를 기록
- 프로그램 실행 시에 동적 링커가 공유 라이브러리를 메모리에 올리고 모든 프로그램이 이용할 수 있다.

ODBC API : 표준 개방형 응용 프로그램으로써 여러 방면에서 접근 가능하다


[60일차]
주 키: 관리자가 데이터를 구분하는 키(id)로 결정
대안 키: 주 키를 제외한 나머지 키
인공 키: 주 키로 찾을 수 없을때 사용 하는 키
주 키로 설정하는 법: 설정하고 싶은거 옆에 primary key적기
대안키 = unique 주요키 말고 다른 정보를 키로 만들고 싶을때 사용
주키 or 대안키에 auto_increment 를 쓰면 1씩 자동증가 된다
인덱스 : 문자를 정렬시키는것(입력,변경,속도가 느려지는 단점이 있다)
fulltext index추가 시키면 인덱스 컬럼으로 지정된다.
뷰 : 조회 결과를 테이블처럼 사용하는 문법
정규화: 데이터의 중복을 줄이고 무결성을 향상 시키는 등 여러 목적을 달성 
alter table 테이블명   ===> FK 설정
    add constraint 제약조건이름(자식) foreign key (컬럼명) references 테이블명(컬럼명,부모);
트랜잭션: 더 이상 쪼개질 수 없는 업무처리 단위 
한꺼번에 완료되면 .commit 취소가 된 경우 rollback
[61일차]
select all은 모든 데이터를 가져온다 
selectdistinct는 중복 값을 한 개만 추출할때 붙인다.
order by 하고싶은거 desc; (내림차순)  ordeer by bane asc;(오름차순)
as를 사용하여 라벨명으로 사용 (생략 가능)
union: 중복 값 자동 제거
union all: 중복 값 제게 x
cross join 두 테이블의 데이터를 1:1로 모두 연결
문제점: 필요 없는 것도 연결이 되어 버리낟
natural join : 같은 이름을 가진 컬럼 값을 기준으로 레코드 연결
문제점: 컬럼 이름이 다를 때 연결이 안된다, 모든 컬럼의 값이 일치한 경우에만
연결이 된다.
위에 문제 해결 법: outer join 사용
outer inner 차이점 : outer는 배정되지 않은 데이터도 출력을 해준다.
[62일차]
API: 애플리케이션을 제작할때 사용하는 도구
JDBC API : 드라이버 제어와 관련된 클래스 제공, 드라이버 호출 규칙을 인터페이스로 정의
Oracle JDBC Driver : JDBC API 규칙에 따라 클래스를 구현, 모든 JDBC 드라이버는 사용법이 같다.
[63일차]
java.sql.Connection을 쓰면 어떤 인터페이스인지 상관없이 받아 오기만 하면 된다.

visual studio code 가 .classpath를 잘못 덮여 씌워버려서 사려져 버린다
다시 gradle eclipse 해주면 된다.

Resultset Driver가 connection에게 바로 리턴해준다. connection은 statement에게 바로 리턴
satement는 resultset에게 바로 리턴 resultset은 dbms에서 결과 가져옴

CRUD : create , read , update , delete

정리 : Connection 받아와서 DriverManager에게 연결하기 DriverManager는 Driver 객체를 찾는다.
Statement : SQL문을 DBMS의 형식에 따라 인코딩하여 서버에 전달
executeUpdate(): 데이터를 변경할때 사용
executeQuery():  서버에서 데이터 가져오기
ResultSet : 서버에서 결과 가져오기
getString(컬럼번호) : 0이 아닌 1부터 사용한다 헷갈리지 않게 변수명을 쓰도록하자
fk가 걸려있으면 자식 데이터를 먼저 지우자 

SQL 삽입 공격이란? 명령을 삽입하여 프로그램 의도와 다르게 데이터를 조작
해결 방법 : PreparedStatement 사용

Statement.RETURN_RENERATED_KEYS : 자동 생성된 pk값을 받겠다고 설정하는 문법

여러 개의 데이터 변경은 수동으로 해야한다.

setAutoCommit(false) 설정 하는 이유: 한 단위로 작업을 해야할 경우 사용

트랜잭션 : 여러 개의 데이터 변경 작업을 한 단위로 묶는것
          
예시 ) : 모든 주문 업무를 묶어놓음 한개라도 실패하면 실행이 안된다.

커넥션을 공유하는 상황이면 롤백해야한다.

[64일차]

DAO(Data Access Object)란? 데이터 처리 관련 코드를 별도의 클래스로 캡슐화 시키는것 
DTO(Data Transfer Object)란? 여러개의 값을 호출 할 떄 여러 값을 간단히 전달하기 위해 만든 클래스

VO=Domain=DTO 다 같은거
like concat('%',?,'%') : 검색할때 쓴다 DBMS 마다 다르다


# bitcamp-20201221





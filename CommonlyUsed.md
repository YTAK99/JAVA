```Java

// #프로그램 기본 구조
public class Main {
    public static void main(String[] args) {
        
    }
}

-------------------------------------------------------------------------------

// #출력
System.out.print("그냥 출력");
System.out.println("출력 후 줄바꿈");
System.out.printf("형식 문자열에 맞추어 뒤의 값을 출력");   // %d, %f, %c, %s
// %.1f하면 둘째자리에서 반올림
// %출력은 %%로

-------------------------------------------------------------------------------

// #변수
int age = 20;   // 정수
double height = 175.5;  // 실수
char grade = 'A';   // 문자
String name = "홍길동";     // 문자열
boolean isLogin = true;
boolean adult = age >= 19;

// int → Integer
// double → Double
// char → Character
// boolean → Boolean

-------------------------------------------------------------------------------

// #입력(여러 개 작성하면 그만큼 입력받음)
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();   // 정수 입력

double d = sc.nextDouble();     // 실수 입력

String name = sc.next();    // 문자열 입력

sc.nextLine();     // 버퍼에 남아있는 엔터를 청소. (nextLine 쓰기 전에만.)
                   // nextInt()는 엔터는 안 가져가기 때문에 남아있어서 빈 문자열을 넣음.

String str = sc.nextLine();     // 한 줄 전체 입력

sc.close();     // Resource Leak 예방차원에서 입력 다 끝나고 닫아주는 것이 좋다.


// try 괄호 안에 선언하면, 블록이 끝날 때 자동으로 sc가 닫힌다.
try (Scanner sc = new Scanner(System.in)) {
    // ... 코드 실행
} // <-- 여기서 sc가 자동으로 close() 됨


// StringTokenizer 사용법
// 1. 한 줄을 통째로 읽어옴
String line = sc.nextLine(); 
// 2. 읽어온 줄을 공백 단위로 분리해주는 토크나이저 생성
StringTokenizer st = new StringTokenizer(line, " ");
// 3. 차례대로 꺼내서 사용하기
String gender = st.nextToken();                 // 첫 번째 덩어리 ("여")
int age = Integer.parseInt(st.nextToken());  // 두 번째 덩어리 ("25") -> 정수 변환
System.out.printf("%s %d\n", gender, age);


char[] arr = new char[10];                  //문자 입력
for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.next().charAt(0);
}

-------------------------------------------------------------------------------

// #조건문
if(score >= 90){
    System.out.println("A");
}
else if(score >= 80){
    System.out.println("B");
}
else{
    System.out.println("C");
}


int n = 2;
switch(n){
    case 1:
        System.out.println("하나");
        break;  // switch 문 탈출 (없으면 아래가 다 실행됨)

    case 2:
        System.out.println("둘");
        break;  // switch 문 탈출

    default:
        System.out.println("기타");     // 1,2가 아닌 그 외의 숫자일때 실행
}


int result = condition ? 1 : 0;     // condition이 true면 1, false면 0을 반환

// 문자열을 비교할때는 반드시 .equals() 사용
if (gender.equals("F"))

if (go.equalsIgnoreCase("Y"))   // = if (go.equals("Y") || go.equals("y"))

-------------------------------------------------------------------------------

// #반복문 (1~10 출력)
for(int i=1;i<=10;i++){         // 2증가는 i+=2
    System.out.println(i);
}


// 2. 외부 변수를 이용해 for문 실행
int start = sc.nextInt();
int end = sc.nextInt();
for (int i = start; i <= end; i++) {
    System.out.print(i + " ");
}


int i = 1;
while(i<=10){
    System.out.println(i);
    i++;
}


for(int n : arr){       // 향상된 for문
    System.out.println(n);  // 여기서 n은 인덱스가 아닌 실제값.
}


boolean run = true;     // 무한 루프 제어를 위한 변수
while(run) {
    int num = sc.nextInt();
    if (num == 0) {
        run = false;    // while 문 조건을 false로 바꾸어 루프 종료
        break;
    }
}

-------------------------------------------------------------------------------

// #배열
int[] arr = new int[5];     // 5칸 생성         // 초기값 : 0
double[] arr = new double[5];   // 실수         // 초기값 : 0.0
char[] arr = new char[5];       // 문자         // 초기값 : '\u0000'
String[] arr = new String[5];   // 문자열       // 초기값 : null
boolean[] arr = new boolean[5]; // 논리값       // 초기값 : false

int[] arr = {10,20,30,40,50};       // 초기값

arr[0] = 10;    // 값 저장

System.out.println(arr[0]);     // 출력

int[] arr = new int[5];
for(int i=0;i<5;i++) {
    arr[i] = sc.nextInt();      // 5번 입력받기
}

int[] arr = new int[5];
for(int i=0;i<5;i++) {
    System.out.print(arr[i] + " ");     // 5개 전체 출력
}

arr.length      // 배열 길이 반환


int sum = 0;
for(int n : arr){       // 향상된 for문으로 합계
    sum += n;
}
int avg = sum / arr.length;     // 평균


int max = arr[0];       // 최댓값. (최솟값은min으로)
for(int n : arr){
    if(n > max){
        max = n;
    }
}


int count = 0;          // 짝수 개수 세기
for(int n : arr){
    if(n % 2 == 0){
        count++;
    }
}


for (int i = alphabet.length - 1; i >= 0; i--) {
            System.out.print(alphabet[i] + " ");
}       // 알파벳 배열 역순 출력


import java.util.Arrays;
int[] arr = {5,2,4,1};
Arrays.sort(arr);               // 정렬
Arrays.toString(arr);           // 배열을 [ ]로 감싸고 ,로 구분된 문자열로 바꿔줌
Arrays.stream(arr).forEach(n -> System.out.print(n + ""));  // 공백으로 구분

-------------------------------------------------------------------------------

// #ArrayList   (Integer, Double, Character, Boolean)
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
ArrayList<String> stringlist = new ArrayList<>();

list.add(값);   // 값 추가
list.get(인덱스)    // 값 꺼내기
list.set(인덱스, 값);   // 값 수정
list.remove(값);    // 값 삭제
list.size()     // 크기 반환


for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

int sum = 0;
for (int n : list) {
    System.out.println(n);
    sum += n;       // List합계
}
double avg = (double)sum / list.size();     // 평균


Integer[] arr = {1, 2, 3, 4, 5};
Collections.reverse(Arrays.asList(arr));        // 배열을 리스트로 변환 후 뒤집기
System.out.println(Arrays.toString(arr));


Integer[] arr = {3, 1, 5, 2, 4};
Arrays.sort(arr, Collections.reverseOrder());     // 내림차순 정렬
System.out.println(Arrays.toString(arr));

-------------------------------------------------------------------------------

// #문자열 응용
String subject = "자바 프로그래밍";

char charValue = subject.charAt(3);    // 문자 추출

int len = subject.length();     // 문자열 길이

String newStr = oldStr.replace("자바", "JAVA");     // 문자열 대체

substring(int beginIndex);   // beginIndex에서 끝까지 잘라내기
substring(int beginIndex, int endIndex);   // beginIndex에서 endIndex 앞까지 잘라내기

int index = subject.indexOf("프로그래밍"); // 문자열 찾기(인덱스 리턴)

boolean result = subject.contains("파이썬"); // 포함 여부


String board = "번호,제목,내용,글쓴이";     // 문자열 분리
String[] arr = board.split(","); // {"번호", "제목", "내용", "글쓴이"}


if(str.equals("Hello"))     // 문자열 비교


String str = "Hello";       // 문자열 변경
str = str.replace("H","J");


str.length()    // 문자열 길이 반환


String str = "Hello Java";
String upper = str.toUpperCase();   // 모든 영문자를 대문자로 변환
String lower = str.toLowerCase();   // 모든 영문자를 소문자로 변환

-------------------------------------------------------------------------------

// #메서드
public static void hello(){     // 만들기
    System.out.println("안녕");
}
hello();    // 호출


public static int add(int a,int b){     // 값 반환
    return a+b;
}
int result = add(10,20);        // 사용

-------------------------------------------------------------------------------

// #클래스
class Student{      // 생성
    String name;
    int age;
}
Student s = new Student();      // 객체 생성

s.name = "홍길동";      // 값 저장
s.age = 20;

System.out.println(s.name);     // 출력


Student[] st = new Student[3];      // 배열과 같이 사용
for(int i=0;i<3;i++){
    st[i] = new Student();
}

st[0].name = "김철수";
st[0].kor = 90;

st[1].name = "이영희";
st[1].kor = 100;

System.out.println(st[1].name);

-------------------------------------------------------------------------------

// # 생성자 (객체 만들 때 초기화)
class Human{
    String name;
    int age;

    // 생성자
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
String name = sc.next();
int age = sc.nextInt();
Human h = new Human(name, age);      // 사용방법1

Human h2 = new Human(sc.next(), sc.nextInt());      // 사용방법2

System.out.println(h.name + ", " + h2.age);



// 3명의 이름과 나이를 입력 받아 출력하기
import java.util.*;

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Human[] h = new Human[3];

        // 입력
        for (int i = 0; i < h.length; i++) {
            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("나이 : ");
            int age = sc.nextInt();

            h[i] = new Human(name, age);
        }

        System.out.println();

        // 출력
        for (Human person : h) {
            System.out.printf("%s %d세%n", person.name, person.age);
        }
    }
}

-------------------------------------------------------------------------------

// #static (객체 없이 사용)
public static void hello(){
    System.out.println("안녕");
}
hello();    // 호출

-------------------------------------------------------------------------------

// #예외 처리 (오류 방지)
try{
    int result = 10 / 0;
}
catch(Exception e){
    System.out.println("에러 발생");
}
catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("배열 오류");        // 여러 catch로, 예외마다 다르게 처리 가능
}
finally {
    System.out.println("에러가 나든 안나든 무조건 실행");
}


// throw -> 직접 예외 발생
if(age < 0){
    throw new IllegalArgumentException("나이는 음수일 수 없습니다.");
}

-------------------------------------------------------------------------------

// #Math
Math.max(10,20);    // 최댓값
Math.min(10,20);    // 최솟값
Math.abs(-10);      // 절댓값
Math.pow(2,3);      // 제곱
Math.sqrt(25);      // 제곱근
Math.round(3.5);    // 반올림
Math.ceil(3.1);     // 올림
Math.floor(3.9);    // 내림


double num = 3.14159;
double result = Math.ceil(num * 10) / 10.0;     // 첫째자리에서 올림
System.out.println(result);                     // 3.2

-------------------------------------------------------------------------------

// private & public
public class Car {
    // 1. private : 외부에서 "직접" 건드리면 사고 나는 위험한 영역 (숨김)
    private int speed = 0; // 외부에서 절대 직접 못 만짐! (private)
    private int fuel = 100;

    // 2. public : 외부 사람이 안전하게 누를 수 있는 "보여지는 버튼" (공개)
    // 속도를 높이고 싶으면 반드시 이 안전한 public 메서드를 거쳐야 함!
    public void 가속페달밟기() {
        if (fuel <= 0) {
            System.out.println("기름이 없어서 달릴 수 없습니다.");
            return;
        }
        this.speed += 10; // 내부에서 안전하게 private 변수를 조절
        this.fuel -= 1;
        System.out.println("현재 속도: " + this.speed);
    }
}

Car myCar = new Car();
myCar.speed = -500;       // ❌ 에러 발생! (private이라 컴파일러가 소리 지르며 막음)
myCar.가속페달밟기();     // ⭕ 정상 작동! (public이라 누구나 합법적으로 누를 수 있음)

-------------------------------------------------------------------------------

// #Random
import java.util.Random;
Random r = new Random();

int num = r.nextInt(b - a + 1) + a;     // 범위 : a~b
int num = r.nextInt(10);    // 범위 : 0~9
int num = r.nextInt(100) + 1;   // 범위 : 1~100
int num = r.nextInt(6) + 5;     // 범위 : 5~10 (10-5+1=6)
int lotto = r.nextInt(45) + 1;      // 범위 : 1~45

0.0 <= Math.random() < 1.0
8 <= (int)(Math.random() * 4 ) + 8 < 32
예) 주사위 : 1 <= (int) (Math.random()*6+1) < 7

-------------------------------------------------------------------------------

// #형변환
String s = String.valueOf(100);             // 정수 → 문자열
int n = Integer.parseInt("100");            // 문자열 → 정수
double d = Double.parseDouble("3.14");      // 문자열 → 실수

-------------------------------------------------------------------------------

// 기타
int intValue = 100;
double doubleValue = 3.14;
double result = doubleValue * intValue;
long roundedResult = Math.round(result);    // 반올림

-------------------------------------------------------------------------------

// 예시 - 클래스

import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세이군요.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원 수? ");
        int num = sc.nextInt();
        Person[] p = new Person[num];

        for (int i = 0; i < num; i++) {
            System.out.print("당신의 이름은 무엇입니까? ");
            String name = sc.next();
            System.out.print("당신의 나이는 몇 살입니까? ");
            int age = sc.nextInt();

            p[i] = new Person(name, age);
        }
        sc.close();

        for (int i = 0; i < num; i++) {
            p[i].print();
        }
    }
}
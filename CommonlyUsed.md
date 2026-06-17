```Java

// #프로그램 기본 구조
public class CommonlyUsed {
    public static void main(String[] args) {
        
    }
}

-------------------------------------------------------------------------------

// #출력
System.out.print("그냥 출력");
System.out.println("출력 후 줄바꿈");
System.out.printf("형식 문자열에 맞추어 뒤의 값을 출력");   // %d, %f, %c, %s

-------------------------------------------------------------------------------

// #변수
int age = 20;   // 정수
double height = 175.5;  // 실수
char grade = 'A';   // 문자
String name = "홍길동";     // 문자열

-------------------------------------------------------------------------------

// #입력(여러 개 작성하면 그만큼 입력받음)
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();   // 정수 입력
sc.nextLine();     // 버퍼에 남아있는 엔터를 청소

String name = sc.next();    // 문자열 입력
sc.nextLine();     // 버퍼에 남아있는 엔터를 청소

String str = sc.nextLine();     // 한 줄 전체 입력
sc.nextLine();     // 버퍼에 남아있는 엔터를 청소

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
        break;

    case 2:
        System.out.println("둘");
        break;

    default:
        System.out.println("기타");
}

-------------------------------------------------------------------------------

// #반복문 (1~10 출력)
for(int i=1;i<=10;i++){
    System.out.println(i);
}


int i = 1;
while(i<=10){
    System.out.println(i);
    i++;
}

for(int n : arr){       // 향상된 for문
    System.out.println(n);
}

-------------------------------------------------------------------------------

// #배열
int[] arr = new int[5];     // 5칸 생성

int[] arr = {10,20,30,40,50};       // 초기값

arr[0] = 10;    // 값 저장

System.out.println(arr[0]);     // 출력

for(int i=0;i<5;i++){       // 5번 입력받기
    arr[i] = sc.nextInt();
}

for(int i=0;i<5;i++){       // 5개 전체 출력
    System.out.println(arr[i]);
}

arr.length      // 배열 길이 반환


import java.util.Arrays;        // 정렬

int[] arr = {5,2,4,1};          // 정렬
Arrays.sort(arr);               // 정렬

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

for (int n : list) {
    System.out.println(n);
}

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

-------------------------------------------------------------------------------

// # 생성자 (객체 만들 때 초기화)
class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
Student s = new Student("홍길동",20);      // 사용

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

-------------------------------------------------------------------------------

// #Math
Math.max(10,20);    // 최댓값
Math.min(10,20);    // 최솟값
Math.abs(-10);      // 절댓값
Math.pow(2,3);      // 제곱

-------------------------------------------------------------------------------

// #Random
import java.util.Random;

Random r = new Random();
int num = r.nextInt(10);    // 범위 : 0~9

-------------------------------------------------------------------------------

// #형변환
String s = String.valueOf(100);             // 정수 → 문자열
int n = Integer.parseInt("100");            // 문자열 → 정수
double d = Double.parseDouble("3.14");      // 문자열 → 실수








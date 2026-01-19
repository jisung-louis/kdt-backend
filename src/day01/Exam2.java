package day01;

public class Exam2 { //class start

    // [1] 메인 함수
    // 자바에서 최초의 실행 흐름(스레드)을 갖는(미리 만들어진) 함수
    public static void main(String[] args){
        // [2] 리터럴 : 상수이면서 키보드로 입력 가능한 자료들
        // 3, 3.14, 'a', true, false
        System.out.println(3);
        System.out.println(3.14);
        System.out.println('유');
        System.out.println("유재석");
        // [3] 자료형/타입(분류) : 자료들을 *효율*적으로 사용하기 위한 분류 방법
        // 호율? : 내가 시계 선물하기 위해서 다이소에서 시계 크기 맞는 적당(효율)한 상자를 고른다.
        // 바이트? : bit(0 혹은 1) ---> 01010101(8bit/bit 8개) 1바이트 -> 1024byte
        // 정수: byte (1, -128 ~ 127),           short  (2, +-30000 정도)
        //      int  (4, +-21억 정도, *정수 기본*), long   (8, +- 21억 이상
        // 실수: float(4, 소수점 8자리 표현),        double (8, 소수점 17자리 표현, *실수 기본*)
        // 문자: char (2, ''작은따옴표 감싼),  문자열: String (문자열클래스, "" 큰따옴표 감싼)
        // 논리: boolean(1, true/false)
        // ==========================================> 8가지 + String

        System.out.println();
    }
} //class end


/*
    ------ 코드 작성 ------             ------ 코드 (처리) 실행 ------
    JS : console.log("자바");          브라우저
    JAVA : print("자바");              main
 */
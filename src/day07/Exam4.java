package day07;

public class Exam4 {
    public static void main(String[] args){
        D d = new D();
        System.out.println(d.최종변수);
        d.비멤버공유변수 = 20;

        // 클래스명.정적(static)변수
        // 객체 생성으로 메모리를 할당하지 않고, 프로그램 시작과 동시에 static을 메모리에 할당함.
        System.out.println(D.비멤버공유변수);
        d.멤버메소드2();
    }
}

class D{
    final int 최종변수 = 10;
    static int 비멤버공유변수;
    static final int 상수 = 10;
    void 멤버메소드1(){
        System.out.println("d1");
    }
    static void 비멤버메소드(){
        System.out.println("d2");
    }
    void 멤버메소드2(){
        멤버메소드1();
        비멤버메소드();
    }

}
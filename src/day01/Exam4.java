package day01;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // [2] 입력 함수
        // 1. .next();      : 입력받은 자료를 문자열(String)로 반환, 띄어쓰기 불가능
        System.out.print(" 1.next() : ");
        String str1 = scanner.next();
        System.out.println(str1);

        // 2. .nextLine()   : 입력받은 자료를 문자열(String)로 반환, 띄어쓰기 포함
        // 주의할 점 : 띄어쓰기를 포함하다보니 앞의 next()와 충돌하여 하나의 next로 인식된다.
        // 해결방법 : nextLine() 사용할 때는 앞에 next()가 존재하면 임의의 nextLine()을 하나 더 작성한다.
        System.out.print(" 2.nextLine() : ");
        String str2 = scanner.nextLine();
        System.out.println(str2);

        // 3. nextByte()    : 입력받은 자료를 바이트 로 반환 (-128 ~ 127)
        System.out.print(" 3.nextByte() : ");
        byte b1 = scanner.nextByte();
        System.out.println(b1);

        // 4. nextShort()    : 입력받은 자료를 쇼트 로 반환 (약 -30000 ~ 30000)
        System.out.print(" 4.nextShort() : ");
        short s1 = scanner.nextShort();
        System.out.println(s1);

        // 5. nextInt()    : 입력받은 자료를 인트 로 반환 (약 -21억 ~ 약 21억)
        System.out.print(" 5.nextInt() : ");
        int i1 = scanner.nextInt();
        System.out.println(i1);

        // 6. nextLong()    : 입력받은 자료를 롱 으로 반환
        System.out.print(" 6.nextLong() : ");
        long l1 = scanner.nextLong();
        System.out.println(l1);

        // 7. nextFloat()    : 입력받은 자료를 플로트 로 반환
        System.out.print(" 7.nextFloat() : ");
        float f1 = scanner.nextFloat();
        System.out.println(f1);

        // 8. nextDouble()    : 입력받은 자료를 더블 로 반환
        System.out.print(" 8.nextDouble() : ");
        double d1 = scanner.nextDouble();
        System.out.println(d1);

        // 9. nextBoolean()    : 입력받은 자료를 불리언 로 반환
        System.out.print(" 9.nextBoolean() : ");
        boolean bool1 = scanner.nextBoolean();
        System.out.println(bool1);

        // 9. next().charAt(0)    : 입력받은 자료에서 첫 번째 글자 반환, char 문자 스캔은 없다.
        System.out.print(" 10.next().chatAt(0) : ");
        char c1 = scanner.next().charAt(0);
        System.out.println(c1);
    }
}

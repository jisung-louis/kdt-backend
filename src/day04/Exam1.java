package day04;
import java.util.*;
public class Exam1 {
    public static void main(String[] args){
        // 구구단
        Scanner scan = new Scanner(System.in);

        System.out.print("최대 단 수를 입력하세요 : ");
        int multiplicand = scan.nextInt();
        System.out.print("최대 곱 수를 입력하세요 : ");
        int multiplier = scan.nextInt();

        for(int i = 1; i < multiplicand + 1; i++){
            System.out.printf("======== %d단 ========\n", i);
            for(int j = 1; j < multiplier + 1; j++){
                System.out.printf("%d * %d = %d\n", i, j, i*j);
            }
            System.out.println();
        }
    }
}

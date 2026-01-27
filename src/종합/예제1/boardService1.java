package 종합.예제1;
import java.util.*;

public class boardService1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String content1 = null;
        String content2 = null;
        String content3 = null;
        String writer1 = null;
        String writer2 = null;
        String writer3 = null;

        for(;;){
            System.out.println("============= My Community =============");
            System.out.println("1. 게시물쓰기 | 2. 게시물 출력");
            System.out.println("======================================");
            System.out.print("선택> ");
            int choice = scan.nextInt();

            if(choice == 1){
                System.out.print("내용 : ");
                scan.nextLine();
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();
                if(content1 == null && writer1 == null){
                    content1 = content;
                    writer1 = writer;
                    System.out.println("[안내] 글쓰기 성공");
                }
                else if(content2 == null && writer2 == null){
                    content2 = content;
                    writer2 = writer;
                    System.out.println("[안내] 글쓰기 성공");
                }
                else if(content3 == null && writer3 == null){
                    content3 = content;
                    writer3 = writer;
                    System.out.println("[안내] 글쓰기 성공");
                }
                else {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            }
            else if(choice == 2){
                System.out.println("============= 게시물 목록 =============");
                if(content1 != null && writer1 != null){
                    System.out.printf("작성자 : %s 내용 : %s\n",content1, writer1);
                    System.out.println("------------------------------------");
                }
                if(content2 != null && writer2 != null){
                    System.out.printf("작성자 : %s 내용 : %s\n",content2, writer2);
                    System.out.println("------------------------------------");
                }
                if(content3 != null && writer3 != null){
                    System.out.printf("작성자 : %s 내용 : %s\n",content3, writer3);
                    System.out.println("------------------------------------");
                }
            }
        }
    }
}

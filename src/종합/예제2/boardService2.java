package 종합.예제2;

import java.util.Scanner;

public class boardService2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] contents = new String[100];
        String[] writers = new String[100];

        for(;;){
            System.out.println("============= My Community =============");
            System.out.println("1. 게시물쓰기 | 2. 게시물 출력");
            System.out.println("======================================");
            System.out.print("선택> ");
            int choice = scan.nextInt();

            if(choice == 1){
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();
                for(int i = 0; i < contents.length; i++){
                    if(contents[i] == null && writers[i] == null){
                        contents[i] = content;
                        writers[i] = writer;
                        System.out.println("[안내] 글쓰기 성공");
                        break;
                    }
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            }
            else if(choice == 2){
                System.out.println("============= 게시물 목록 =============");
                for(int i = 0; i < contents.length; i++){
                    if(contents[i] != null && writers[i] != null){
                        System.out.printf("작성자 : %s 내용 : %s\n",contents[i], writers[i]);
                        System.out.println("------------------------------------");
                    }
                }
            }
        }
    }
}

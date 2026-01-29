package day08.jonghap5;
import java.io.*;
import java.util.*;

public class BoardService {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        for(;;){
            System.out.println("============== My Community ==============");
            System.out.println(" 1. 게시물쓰기 | 2. 게시물출력");
            System.out.println("==========================================");
            System.out.print("선택 > ");
            st = new StringTokenizer(br.readLine());
            int choice = Integer.parseInt(st.nextToken());
            if(choice == 1){
                System.out.print("내용 : ");
                String content = br.readLine();
                System.out.print("작성자 : ");
                String writer = br.readLine();
                boolean isSuccess = BoardController.doPost(content,writer);
                System.out.println(isSuccess ? "[안내] 글쓰기 성공" : "[경고] 글쓰기 실패");
            }
            else if(choice == 2){
                Board[] boards = BoardController.doGet();
                for(Board board : boards){
                    if(board != null){
                        System.out.printf("작성자 : %s, 내용 : %s \n", board.getWriter(), board.getContent());
                    }
                }
            }
        }
    }
}

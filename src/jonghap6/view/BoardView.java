package jonghap6.view;

import jonghap6.controller.BoardController;
import jonghap6.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // [1] 현재 클래스를 잠금
    private BoardView(){}
    // [2] 인스턴스 하나 생성
    private static final BoardView instance = new BoardView();
    // [3] 게터함수 만듦
    public static BoardView getInstance(){ return instance; }

    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    // [*] 입력 객체는 모든 메소드에서 사용할 예정이므로 지역변수 말고 메소드 함수 밖에서 선언하자
    private Scanner scan = new Scanner(System.in);

    // [0] 메인 입출력 화면
    public void indexView(){
        for(;;){
            System.out.println("============= My Community =============");
            System.out.println("1. 게시물쓰기 | 2. 게시물 출력");
            System.out.println("========================================");
            System.out.print("선택> ");
            int choice = scan.nextInt();
            if( choice == 1 ){ writeView(); }
            else if( choice == 2 ){ printView();}
        }
    }

    // [1] 등록 입출력 화면
    public void writeView(){
        scan.nextLine(); // 오류 방지용 버퍼 비우기?
        System.out.print("내용 : "); String content = scan.next();
        System.out.print("작성자 : "); String writer = scan.next();
        // [1-1] 입력받은 content, writer를 컨트롤러에게 전달하고 결과 받아오기
        boolean result = bc.doPost(content, writer);
        // [1-2] 받은 결과에 따른 화면 출력해주기
        if( result ) System.out.println("[안내] 글쓰기 성공");
        else System.out.println("[안내] 글쓰기 실패");
    }
    // [2] 모든 게시물 출력 화면
    public void printView(){
        ArrayList<BoardDto> boards = bc.doGet();
        for(BoardDto board : boards){
            int no = board.getNo();
            String content = board.getContent();
            String writer = board.getWriter();
            System.out.printf("번호 : %d, 작성자 : %s, 내용 : %s\n",no, content, writer);
        }
    }
}

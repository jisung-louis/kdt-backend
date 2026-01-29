package day08.jonghap5;

public class BoardController {
    // controller
    // 로직 담당 / static 기반 관리
    // 게시물 데이터 저장과 처리를 담당하는 클래스
    private static final Board[] boards = new Board[100];

    public static boolean doPost(String content, String writer){
        Board board = new Board(content, writer);
        for(int i = 0; i < boards.length; i++){
            if(boards[i] != null){
                boards[i] = board;
                return true;
            }
        }
        return false;
    }
    public static Board[] doGet(){
        return boards;
    }
}

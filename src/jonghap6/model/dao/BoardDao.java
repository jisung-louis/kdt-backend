package jonghap6.model.dao;

import jonghap6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }

    // [*] 데이터베이스 역할 하는 ArrayList < 추후에 삭제 예정 >
    private static final ArrayList<BoardDto> boardDB = new ArrayList<>();
    // [*] 전역 변수에 저장된 게시물번호 수 저장 < 식별키 생성 목적 : 추후에 삭제 예정 >
    private static int currentNo = 1; // 초기값

    // [1] 등록 처리 : controller가 dao에게 content와 writer 전달하여 등록 요청한다.
    public boolean doPost(String content, String writer){
        // [1-1] 매개변수에 따른 객체를 만든다. + 게시물번호 자동생성
        BoardDto boardDto = new BoardDto( ++currentNo, content, writer);
        // [1-2] .add(새로운값) :
        return boardDB.add(boardDto);
    }
    public ArrayList<BoardDto> doGet(){
        return boardDB;
    }
}

package jonghap6.controller;

import jonghap6.model.dao.BoardDao;
import jonghap6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    //[*] MVC패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    // [1] 등록 제어 : view에게 입력받은 content, writer 받아서 dao에게 요청 후 결과를 view에게 전달
    public boolean doPost(String content, String writer){
        // 여기서 해야 할 일(controller의 책임) : 다양한 유효성검사 / 자료의 타입 확인 등
        return bd.doPost(content,writer);
    }
    public ArrayList<BoardDto> doGet(){
        // 여기서 해야할 일(controller의 책임) : 정렬 등
        return bd.doGet();
    }
}

// 여러개 있을 필요 없는 클래스는 싱글톤 패턴으로 한다.


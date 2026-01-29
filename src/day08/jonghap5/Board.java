package day08.jonghap5;

public class Board {
    // data model
    // 데이터 모델 / 캡슐화 적용
    // 각 게시물 데이터를 담는 클래스
    private String content;
    private String writer;

    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
        System.out.println("test");
    }
    public Board() {
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}

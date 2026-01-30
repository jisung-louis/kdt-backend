package day08;

public class SingletonPractice {
    public static void main(String args[]) {
        Controller controller1 = Controller.getInstance();
        Controller controller2 = Controller.getInstance();
        View view1 = new View();
        View view2 = new View();
    }
}
class Controller{
    // [1] 생성자를 private로 잠금
    private Controller(){}
    // [2] 단 하나의 객체 생성하여 상수(static final)에 저장한다.
    private static final Controller instance = new Controller();
    // [3] 해당 싱글톤(객체)를 다른 클래스에서 간접 사용(공유)하도록 getter 만든다.
    public static Controller getInstance(){
        return instance;
    }
}
class View{}
package jonghap2.view;

import jonghap2.controller.WaitingController;
import jonghap2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    WaitingController wc = WaitingController.getInstance();
    Scanner scan = new Scanner(System.in);

    // [0] 메인 입출력 화면
    public void indexView(){
        for(;;){
            System.out.println("============= 맛집 대기 시스템 =============");
            System.out.println("1. 대기 등록 | 2. 대기 현황");
            System.out.println("========================================");
            System.out.print("선택> ");
            int choice = scan.nextInt();
            if( choice == 1 ){ createView(); }
            else if( choice == 2 ){ printView();}
        }
    }

    // [1] 대기 등록 화면
    public void createView(){
        System.out.print("전화번호 : ");
        String tel = scan.next();
        System.out.print("인원수 : ");
        int headcount = scan.nextInt();
        System.out.println(wc.createWaiting(tel,headcount) ? "[안내] 대기 등록 완료" : "[안내] 대기 등록 실패");
    }
    // [2] 대기 현황 조회 화면
    public void printView(){
        ArrayList<WaitingDto> waitings = wc.printWaiting();
        System.out.println("============= 대기 현황 =============");
        for(WaitingDto waiting : waitings){
            System.out.printf("번호 : %d | 연락처 : %s | 인원 : %d\n",waiting.getId(),waiting.getTel(),waiting.getHeadcount());
            System.out.println("--------------------------------");
        }
    }
}

package day06;
import java.io.*;
import java.util.StringTokenizer;

class Waiting{ // 데이터 모델
    String phone;
    int count;
    Waiting(String phone, int count){
        this.phone = phone;
        this.count = count;
    }
}
class WaitingController{ // 제어/로직 담당
    Waiting[] waitings = new Waiting[100];
    boolean addWaiting(String phone, int count){
        Waiting waiting = new Waiting(phone, count);
        for(int i = 0; i < waitings.length; i++){
            if(waitings[i] == null){
                waitings[i] = waiting;
                return true;
            }
        }
        return false;
    }

    Waiting[] getWaitingList(){
        return waitings;
    }
}

class WaitingService{ // 실행/화면 담당
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        WaitingController controller = new WaitingController();
        int choice;
        for(;;){
            System.out.println("============ 맛집 대기 시스템 ============");
            System.out.println(" 1. 대기 등록 | 2. 대기 현황");
            System.out.println("======================================");
            System.out.print("선택 > ");
            st = new StringTokenizer(br.readLine());
            choice = Integer.parseInt(st.nextToken());
            if(choice == 1){
                System.out.print("전화번호 : ");
                st = new StringTokenizer(br.readLine());
                String tel = st.nextToken();
                System.out.print("인원수 : ");
                st = new StringTokenizer(br.readLine());
                int amount = Integer.parseInt(st.nextToken());
                System.out.println(controller.addWaiting(tel,amount) ? "[안내] 대기 등록이 완료되었습니다." : "[경고] 더 이상 대기 등록을 할 수 없습니다.");
            }
            else if(choice == 2){
                Waiting[] list = controller.getWaitingList();
                for(Waiting item : list){
                    if(item != null){
                        System.out.println("1. 연락처 : " + item.phone + " - 인원 : " + item.count + "명");
                    }
                }
            }
        }
    }
}
package jonghap2.model.dao;

import jonghap2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }
    // 임시 DB
    private final ArrayList<WaitingDto> waitingDB = new ArrayList<>();
    private static int currentId = 1;
    public boolean createWaiting(String tel, int headcount){
        WaitingDto waiting = new WaitingDto(++currentId, tel, headcount);
        return waitingDB.add(waiting);
    }
    public ArrayList<WaitingDto> printWaiting(){
        return waitingDB;
    }
}

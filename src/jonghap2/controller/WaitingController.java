package jonghap2.controller;

import jonghap2.model.dao.WaitingDao;
import jonghap2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    WaitingDao wd = WaitingDao.getInstance();
    public boolean createWaiting(String tel, int headcount){
        return wd.createWaiting(tel,headcount);
    }
    public ArrayList<WaitingDto> printWaiting(){
        return wd.printWaiting();
    }
}

package jonghap2.model.dto;

public class WaitingDto {
    private int id;
    private String tel;
    private int headcount;

    public WaitingDto() { }
    public WaitingDto(int id, String tel, int headcount) {
        this.id = id;
        this.tel = tel;
        this.headcount = headcount;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }
    public int getHeadcount() { return headcount; }
    public void setHeadcount(int headcount) { this.headcount = headcount; }
    @Override
    public String toString() {
        return "WaitingDto{" +
                "id=" + id +
                ", tel='" + tel + '\'' +
                ", headcount=" + headcount +
                '}';
    }
}

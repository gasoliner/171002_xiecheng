package cn.spider.xiecheng.po;

/**
 * Created by wanzhenghang on 2017/10/5.
 */
public class CtripProduct {
    private long id;
    private String name;
    private int day;
    private int night;
    private int diamond;
    private String dp_place;
    private long price;
    private String supplier;
    private float score;
    private int travelCount;
    private int commentsCount;
    private boolean isAB = false;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public String getDp_place() {
        return dp_place;
    }

    public void setDp_place(String dp_place) {
        this.dp_place = dp_place;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getTravelCount() {
        return travelCount;
    }

    public void setTravelCount(int travelCount) {
        this.travelCount = travelCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public boolean isAB() {
        return isAB;
    }

    public void setAB(boolean AB) {
        isAB = AB;
    }

    @Override
    public String toString() {
        return "CtripProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day=" + day +
                ", night=" + night +
                ", diamond=" + diamond +
                ", dp_place='" + dp_place + '\'' +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                ", score=" + score +
                ", travelCount=" + travelCount +
                ", commentsCount=" + commentsCount +
                ", isAB=" + isAB +
                '}';
    }
}

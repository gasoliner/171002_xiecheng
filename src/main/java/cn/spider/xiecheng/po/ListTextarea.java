package cn.spider.xiecheng.po;

/**
 * Created by wanzhenghang on 2017/10/5.
 */
public class ListTextarea {

    /**
     * Id : 17067248
     * Name : 美国东海岸+纽约+费城+华盛顿+波士顿+尼亚加拉瀑布11日9晚半自助游·入住2N曼哈顿金融区酒店+天天出发【舒心】
     * PackageName :
     * Level : 1
     * Bu : GT
     * Url : //vacations.ctrip.com/grouptravel/p17067248s475.html?kwd=%e7%be%8e%e5%9b%bd
     * DepartureId : 7
     * Count : 0
     * SaleMode : S
     * SoldOut : false
     * BrandName : 供应商：<i class='ctrip_icon'></i>携程自营
     * Schedule : <em class='date'>元旦</em>
     * Festival : 元旦
     * IsCircleLine : false
     * CssName : sr_semibuffet
     * TypeName : 半自助游
     * IsFirst : false
     * Type : 2048
     */

    private long Id;
    private String Name;
    private String PackageName;
    private int Level;
    private String Bu;
    private String Url;
    private int DepartureId;
    private int Count;
    private String SaleMode;
    private boolean SoldOut;
    private String BrandName;
    private String Schedule;
    private String Festival;
    private boolean IsCircleLine;
    private String CssName;
    private String TypeName;
    private boolean IsFirst;
    private int Type;

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPackageName() {
        return PackageName;
    }

    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getBu() {
        return Bu;
    }

    public void setBu(String Bu) {
        this.Bu = Bu;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public int getDepartureId() {
        return DepartureId;
    }

    public void setDepartureId(int DepartureId) {
        this.DepartureId = DepartureId;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public String getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(String SaleMode) {
        this.SaleMode = SaleMode;
    }

    public boolean isSoldOut() {
        return SoldOut;
    }

    public void setSoldOut(boolean SoldOut) {
        this.SoldOut = SoldOut;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    public String getFestival() {
        return Festival;
    }

    public void setFestival(String Festival) {
        this.Festival = Festival;
    }

    public boolean isIsCircleLine() {
        return IsCircleLine;
    }

    public void setIsCircleLine(boolean IsCircleLine) {
        this.IsCircleLine = IsCircleLine;
    }

    public String getCssName() {
        return CssName;
    }

    public void setCssName(String CssName) {
        this.CssName = CssName;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    public boolean isIsFirst() {
        return IsFirst;
    }

    public void setIsFirst(boolean IsFirst) {
        this.IsFirst = IsFirst;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "ListTextarea{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", PackageName='" + PackageName + '\'' +
                ", Level=" + Level +
                ", Bu='" + Bu + '\'' +
                ", Url='" + Url + '\'' +
                ", DepartureId=" + DepartureId +
                ", Count=" + Count +
                ", SaleMode='" + SaleMode + '\'' +
                ", SoldOut=" + SoldOut +
                ", BrandName='" + BrandName + '\'' +
                ", Schedule='" + Schedule + '\'' +
                ", Festival='" + Festival + '\'' +
                ", IsCircleLine=" + IsCircleLine +
                ", CssName='" + CssName + '\'' +
                ", TypeName='" + TypeName + '\'' +
                ", IsFirst=" + IsFirst +
                ", Type=" + Type +
                '}';
    }
}

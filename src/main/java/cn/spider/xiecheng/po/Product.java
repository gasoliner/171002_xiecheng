package cn.spider.xiecheng.po;

import java.util.List;

/**
 * Created by wanzhenghang on 2017/10/4.
 */
public class Product {
    /**
     * ProductId : 17736141
     * TravelCount : 0
     * CommentCount : 0
     * SbuType : GT
     * ImageUrl : https://dimg04.c-ctrip.com/images/300f0h000000968do13F3_C_125_70.jpg
     * Promotion :
     * PromotionList : null
     * CashBack : 0
     * Remarks : ["如果你着迷于美国西部的狂野风情，那么体验西部大环线是最 好的选择！"]
     * ViewSchedule : false
     * ProductType : 2
     * DepartureCityName : 青岛
     * IsGroupTravel : true
     * IsCircleLine : false
     * DepartureCityId : 7
     * DestinationName : 洛杉矶
     * Tags : [{"Id":1015,"Flag":"NEWTAG","Name":"跟团自驾","Title":"","Type":3}]
     * ProviderFullName : 北京青年旅行社股份有限公司
     * SaleMode : 16
     * Category : 11
     * Pattern : 1
     * IsMultiLine : false
     * VendorName : 北京青年旅行社股份有限公司
     * HasDiscount : false
     * IsDistribution : false
     * MinPriceRemark : null
     * AcceptedRange : null
     * ApplicablePeople : null
     * AdvanceBookingDays : 0
     * VisaAddress : null
     * VisaInterview : 0
     * OnSaleType : 0
     * Score : 0
     * Price : <dfn>&yen;</dfn><strong>24600</strong>起
     * ScheduleDesc : 11/18、12/17
     * TradePrice : null
     * Festival : null
     */

    private long ProductId;
    private int TravelCount;
    private int CommentCount;
    private String SbuType;
    private String ImageUrl;
    private String Promotion;
    private Object PromotionList;
    private int CashBack;
    private boolean ViewSchedule;
    private int ProductType;
    private String DepartureCityName;
    private boolean IsGroupTravel;
    private boolean IsCircleLine;
    private int DepartureCityId;
    private String DestinationName;
    private String ProviderFullName;
    private int SaleMode;
    private int Category;
    private int Pattern;
    private boolean IsMultiLine;
    private String VendorName;
    private boolean HasDiscount;
    private boolean IsDistribution;
    private Object MinPriceRemark;
    private Object AcceptedRange;
    private Object ApplicablePeople;
    private int AdvanceBookingDays;
    private Object VisaAddress;
    private int VisaInterview;
    private int OnSaleType;
    private int Score;
    private String Price;
    private String ScheduleDesc;
    private Object TradePrice;
    private Object Festival;
    private List<String> Remarks;
    private List<TagsBean> Tags;

    public long getProductId() {
        return ProductId;
    }

    public void setProductId(long ProductId) {
        this.ProductId = ProductId;
    }

    public int getTravelCount() {
        return TravelCount;
    }

    public void setTravelCount(int TravelCount) {
        this.TravelCount = TravelCount;
    }

    public int getCommentCount() {
        return CommentCount;
    }

    public void setCommentCount(int CommentCount) {
        this.CommentCount = CommentCount;
    }

    public String getSbuType() {
        return SbuType;
    }

    public void setSbuType(String SbuType) {
        this.SbuType = SbuType;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public String getPromotion() {
        return Promotion;
    }

    public void setPromotion(String Promotion) {
        this.Promotion = Promotion;
    }

    public Object getPromotionList() {
        return PromotionList;
    }

    public void setPromotionList(Object PromotionList) {
        this.PromotionList = PromotionList;
    }

    public int getCashBack() {
        return CashBack;
    }

    public void setCashBack(int CashBack) {
        this.CashBack = CashBack;
    }

    public boolean isViewSchedule() {
        return ViewSchedule;
    }

    public void setViewSchedule(boolean ViewSchedule) {
        this.ViewSchedule = ViewSchedule;
    }

    public int getProductType() {
        return ProductType;
    }

    public void setProductType(int ProductType) {
        this.ProductType = ProductType;
    }

    public String getDepartureCityName() {
        return DepartureCityName;
    }

    public void setDepartureCityName(String DepartureCityName) {
        this.DepartureCityName = DepartureCityName;
    }

    public boolean isIsGroupTravel() {
        return IsGroupTravel;
    }

    public void setIsGroupTravel(boolean IsGroupTravel) {
        this.IsGroupTravel = IsGroupTravel;
    }

    public boolean isIsCircleLine() {
        return IsCircleLine;
    }

    public void setIsCircleLine(boolean IsCircleLine) {
        this.IsCircleLine = IsCircleLine;
    }

    public int getDepartureCityId() {
        return DepartureCityId;
    }

    public void setDepartureCityId(int DepartureCityId) {
        this.DepartureCityId = DepartureCityId;
    }

    public String getDestinationName() {
        return DestinationName;
    }

    public void setDestinationName(String DestinationName) {
        this.DestinationName = DestinationName;
    }

    public String getProviderFullName() {
        return ProviderFullName;
    }

    public void setProviderFullName(String ProviderFullName) {
        this.ProviderFullName = ProviderFullName;
    }

    public int getSaleMode() {
        return SaleMode;
    }

    public void setSaleMode(int SaleMode) {
        this.SaleMode = SaleMode;
    }

    public int getCategory() {
        return Category;
    }

    public void setCategory(int Category) {
        this.Category = Category;
    }

    public int getPattern() {
        return Pattern;
    }

    public void setPattern(int Pattern) {
        this.Pattern = Pattern;
    }

    public boolean isIsMultiLine() {
        return IsMultiLine;
    }

    public void setIsMultiLine(boolean IsMultiLine) {
        this.IsMultiLine = IsMultiLine;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public boolean isHasDiscount() {
        return HasDiscount;
    }

    public void setHasDiscount(boolean HasDiscount) {
        this.HasDiscount = HasDiscount;
    }

    public boolean isIsDistribution() {
        return IsDistribution;
    }

    public void setIsDistribution(boolean IsDistribution) {
        this.IsDistribution = IsDistribution;
    }

    public Object getMinPriceRemark() {
        return MinPriceRemark;
    }

    public void setMinPriceRemark(Object MinPriceRemark) {
        this.MinPriceRemark = MinPriceRemark;
    }

    public Object getAcceptedRange() {
        return AcceptedRange;
    }

    public void setAcceptedRange(Object AcceptedRange) {
        this.AcceptedRange = AcceptedRange;
    }

    public Object getApplicablePeople() {
        return ApplicablePeople;
    }

    public void setApplicablePeople(Object ApplicablePeople) {
        this.ApplicablePeople = ApplicablePeople;
    }

    public int getAdvanceBookingDays() {
        return AdvanceBookingDays;
    }

    public void setAdvanceBookingDays(int AdvanceBookingDays) {
        this.AdvanceBookingDays = AdvanceBookingDays;
    }

    public Object getVisaAddress() {
        return VisaAddress;
    }

    public void setVisaAddress(Object VisaAddress) {
        this.VisaAddress = VisaAddress;
    }

    public int getVisaInterview() {
        return VisaInterview;
    }

    public void setVisaInterview(int VisaInterview) {
        this.VisaInterview = VisaInterview;
    }

    public int getOnSaleType() {
        return OnSaleType;
    }

    public void setOnSaleType(int OnSaleType) {
        this.OnSaleType = OnSaleType;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getScheduleDesc() {
        return ScheduleDesc;
    }

    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    public Object getTradePrice() {
        return TradePrice;
    }

    public void setTradePrice(Object TradePrice) {
        this.TradePrice = TradePrice;
    }

    public Object getFestival() {
        return Festival;
    }

    public void setFestival(Object Festival) {
        this.Festival = Festival;
    }

    public List<String> getRemarks() {
        return Remarks;
    }

    public void setRemarks(List<String> Remarks) {
        this.Remarks = Remarks;
    }

    public List<TagsBean> getTags() {
        return Tags;
    }

    public void setTags(List<TagsBean> Tags) {
        this.Tags = Tags;
    }

    public static class TagsBean {
        /**
         * Id : 1015
         * Flag : NEWTAG
         * Name : 跟团自驾
         * Title :
         * Type : 3
         */

        private int Id;
        private String Flag;
        private String Name;
        private String Title;
        private int Type;

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getFlag() {
            return Flag;
        }

        public void setFlag(String Flag) {
            this.Flag = Flag;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public int getType() {
            return Type;
        }

        public void setType(int Type) {
            this.Type = Type;
        }
    }
}

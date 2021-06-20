package cn.zilion.pojo;

public class CommodityType {
    Integer commodityTypeId;
    Integer commodityCategoryId;
    Integer commoditySubcategoryId;
    String brand;
    String commodityType;

    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public Integer getCommodityCategoryId() {
        return commodityCategoryId;
    }

    public void setCommodityCategoryId(Integer commodityCategoryId) {
        this.commodityCategoryId = commodityCategoryId;
    }

    public Integer getCommoditySubcategoryId() {
        return commoditySubcategoryId;
    }

    public void setCommoditySubcategoryId(Integer commoditySubcategoryId) {
        this.commoditySubcategoryId = commoditySubcategoryId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }
}

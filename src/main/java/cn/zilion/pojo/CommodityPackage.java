package cn.zilion.pojo;

import java.util.Map;

public class CommodityPackage {
    Commodity commodity;
    CommodityType commodityType;
    Map<String, String> commodityPropertyMap;

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public CommodityType getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(CommodityType commodityType) {
        this.commodityType = commodityType;
    }

    public Map<String, String> getCommodityPropertyMap() {
        return commodityPropertyMap;
    }

    public void setCommodityPropertyMap(Map<String, String> commodityPropertyMap) {
        this.commodityPropertyMap = commodityPropertyMap;
    }
}

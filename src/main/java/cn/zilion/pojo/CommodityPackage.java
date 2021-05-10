package cn.zilion.pojo;

import java.util.List;
import java.util.Map;

public class CommodityPackage {
    Commodity commodity;
    CommodityType commodityType;
    List<MediaItem> mediaItemList;
    List<CommodityPropertyMap> commodityPropertyMapList;

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

    public List<MediaItem> getMediaItemList() {
        return mediaItemList;
    }

    public void setMediaItemList(List<MediaItem> mediaItemList) {
        this.mediaItemList = mediaItemList;
    }

    public List<CommodityPropertyMap> getCommodityPropertyMap() {
        return commodityPropertyMapList;
    }

    public void setCommodityPropertyMap(List<CommodityPropertyMap> commodityPropertyMapList) {
        this.commodityPropertyMapList = commodityPropertyMapList;
    }
}

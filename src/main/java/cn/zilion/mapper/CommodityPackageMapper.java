package cn.zilion.mapper;

import cn.zilion.pojo.CommodityPackage;
import cn.zilion.pojo.CommodityPropertyName;
import cn.zilion.pojo.CommodityQuery;
import cn.zilion.pojo.CommodityType;

import java.util.List;

public interface CommodityPackageMapper {
    List<CommodityPackage> findCommodityPackageByWords(CommodityQuery commodityQuery);

    List<CommodityPropertyName> findCommodityPropertyName(CommodityType commodityType);
}

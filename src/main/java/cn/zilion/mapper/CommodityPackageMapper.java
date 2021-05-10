package cn.zilion.mapper;

import cn.zilion.pojo.CommodityPackage;
import cn.zilion.pojo.CommodityQuery;

import java.util.List;

public interface CommodityPackageMapper {
    List<CommodityPackage> findCommodityPackageByWords(CommodityQuery commodityQuery);
}

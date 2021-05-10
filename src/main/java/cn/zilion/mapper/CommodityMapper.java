package cn.zilion.mapper;

import cn.zilion.pojo.CommodityPackage;

import java.util.List;

public interface CommodityMapper {
    List<CommodityPackage> findCommodityPackageByCategory();

    List<CommodityPackage> findCommodityPackageByWords();
}

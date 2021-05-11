package cn.zilion.service;

import cn.zilion.pojo.CommodityPackage;
import cn.zilion.pojo.CommodityQuery;

import java.util.List;

public interface CommodityPackageService {
    Integer insertCommodity(CommodityPackage commodityPackage);

    Integer updateCommodity(CommodityPackage commodityPackage);

    List<CommodityPackage> searchCommodity(CommodityQuery commodityQuery);
}

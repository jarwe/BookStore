package cn.zilion.mapper;

import cn.zilion.pojo.Commodity;
import cn.zilion.pojo.CommodityPackage;

import java.util.List;

public interface CommodityMapper {
    Integer insertCommodity(Commodity commodity);

    Integer updateCommodity(Commodity commodity);
}

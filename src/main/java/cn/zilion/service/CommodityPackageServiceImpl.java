package cn.zilion.service;

import cn.zilion.mapper.*;
import cn.zilion.pojo.CommodityPackage;
import cn.zilion.pojo.CommodityQuery;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommodityPackageServiceImpl implements CommodityPackageService {
    @Autowired
    SqlSession sqlSession;

    @Transactional
    public Integer insertCommodity(CommodityPackage commodityPackage) {
        CommodityMapper commodityMapper = sqlSession.getMapper(CommodityMapper.class);
        CommodityTypeMapper commodityTypeMapper = sqlSession.getMapper(CommodityTypeMapper.class);
        CommodityPropertyNameMapper commodityPropertyNameMapper = sqlSession.getMapper(CommodityPropertyNameMapper.class);
        CommodityPropertyValueMapper commodityPropertyValueMapper = sqlSession.getMapper(CommodityPropertyValueMapper.class);
        return null;
    }

    public Integer updateCommodity(CommodityPackage commodityPackage) {
        return null;
    }

    public List<CommodityPackage> searchCommodity(CommodityQuery commodityQuery) {
        CommodityPackageMapper commodityPackageMapper = sqlSession.getMapper(CommodityPackageMapper.class);
        return null;
    }
}

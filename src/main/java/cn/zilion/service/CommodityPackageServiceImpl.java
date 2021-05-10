package cn.zilion.service;

import cn.zilion.mapper.CommodityMapper;
import cn.zilion.mapper.CommodityPropertyNameMapper;
import cn.zilion.mapper.CommodityPropertyValueMapper;
import cn.zilion.mapper.CommodityTypeMapper;
import cn.zilion.pojo.CommodityPackage;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommodityPackageServiceImpl implements CommodityPackageService {
    @Autowired
    SqlSession sqlSession;

    @Transactional
    public void insertCommodity(CommodityPackage commodityPackage) {
        CommodityMapper commodityMapper = sqlSession.getMapper(CommodityMapper.class);
        CommodityTypeMapper commodityTypeMapper = sqlSession.getMapper(CommodityTypeMapper.class);
        CommodityPropertyNameMapper commodityPropertyNameMapper = sqlSession.getMapper(CommodityPropertyNameMapper.class);
        CommodityPropertyValueMapper commodityPropertyValueMapper = sqlSession.getMapper(CommodityPropertyValueMapper.class);
    }
}

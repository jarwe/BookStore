package cn.zilion.controller;

import cn.zilion.pojo.CommodityPackage;
import cn.zilion.pojo.CommodityPropertyName;
import cn.zilion.pojo.CommodityType;
import cn.zilion.service.CommodityPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/items")
public class CommodityPackageController {
    @Autowired
    CommodityPackageService commodityPackageService;

    @RequestMapping(path="/category/#{category}")
    public List<CommodityPackage> searchCommodityByCategory(@RequestBody String category) {
        return null;
    }

    @RequestMapping(path="/keywords/#{keywords")
    public List<CommodityPackage> searchCommodityByKeyWords(@RequestBody String keywords) {
        return null;
    }

    @RequestMapping(path="/properties", method = RequestMethod.GET)
    @ResponseBody
    public List<CommodityPropertyName> findPropertyNameByCategory(CommodityType commodityType) {
        return commodityPackageService.searchCommodityPropertyNameByType(commodityType);
    }
}

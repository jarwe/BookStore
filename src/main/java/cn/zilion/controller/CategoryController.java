package cn.zilion.controller;

import cn.zilion.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(path="/fetchCategory")
    public List<String> fetchCategory() {
        return null;
    }

    @RequestMapping(path="/fetchSubcategory")
    public List<String> fetchSubcategory(String category) {
        return null;
    }

    @RequestMapping(path="/addCategory")
    public int addCategory(String category) {
        if(category == null) {
            return 0;
        } else {
            return 1;
        }
    }
}

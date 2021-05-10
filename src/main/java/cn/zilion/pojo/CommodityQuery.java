package cn.zilion.pojo;

import java.util.List;

public class CommodityQuery {
    List<String> keywordList;
    int currentPage;
    String groupCondition;
    boolean assendOrder;

    public List<String> getKeywordList() {
        return keywordList;
    }

    public void setKeywordList(List<String> keywordList) {
        this.keywordList = keywordList;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getGroupCondition() {
        return groupCondition;
    }

    public void setGroupCondition(String groupCondition) {
        this.groupCondition = groupCondition;
    }

    public boolean isAssendOrder() {
        return assendOrder;
    }

    public void setAssendOrder(boolean assendOrder) {
        this.assendOrder = assendOrder;
    }
}

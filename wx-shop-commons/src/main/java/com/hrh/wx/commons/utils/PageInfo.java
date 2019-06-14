package com.hrh.wx.commons.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: lqgxwd
 * @Package: org.lanqiao.utils
 * @ClassName: PageInfo
 * @Author: break
 * @Description: 分页二次封装
 * @Date: 2019/5/17 0017 下午 14:39
 * @Version: 1.0
 */
public class PageInfo<T> {
    private int draw;
    //总记录数
    private long recordsTotal;
    private long recordsFiltered;
    // 结果集
    private List<T> data;
    private String error;

    //当前页的数量
    private int size;
    // 总页数
    private int pages;
    // 第一页
    private int firstPage;
    // 上一页
    private int prePage;
    //下一页
    private int nextPage;
    //最后一页
    private int lastPage;

    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;
    //所有导航页号
    private int[] navigatepageNums;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public boolean isFirstPage(boolean isFirstPage) {
        return this.isFirstPage;
    }

    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    public boolean isLastPage(boolean isLastPage) {
        return this.isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public int[] getNavigatepageNums() {
        return navigatepageNums;
    }

    public void setNavigatepageNums(int[] navigatepageNums) {
        this.navigatepageNums = navigatepageNums;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "draw=" + draw +
                ", recordsTotal=" + recordsTotal +
                ", recordsFiltered=" + recordsFiltered +
                ", data=" + data +
                ", error='" + error + '\'' +
                ", size=" + size +
                ", pages=" + pages +
                ", firstPage=" + firstPage +
                ", prePage=" + prePage +
                ", nextPage=" + nextPage +
                ", lastPage=" + lastPage +
                ", isFirstPage=" + isFirstPage +
                ", isLastPage=" + isLastPage +
                ", hasPreviousPage=" + hasPreviousPage +
                ", hasNextPage=" + hasNextPage +
                ", navigatepageNums=" + Arrays.toString(navigatepageNums) +
                '}';
    }
}

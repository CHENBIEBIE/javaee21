package com.kaishengit.uitl;


import java.util.List;

public class Page<T> {
    //总记录数
    private Integer totalSize;
    //总页数
    private Integer totalPages;

    //当前页数
    private Integer pageNo;
    //每页显示多少条数据
    private Integer pageSize;
    //当前页的数量
    private List<T> items;
    //当前页起始行数
    private Integer star;

    public Integer getTotalSize() {
        return totalSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public List<T> getItems() {
        return items;
    }

    public Integer getStar() {
        return star;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    /**
     *
     * @param pageNo 当前页码
     * @param pageSize 每页显示数量
     * @param totalSize 总记录数
     */
    public Page(Integer pageNo, Integer pageSize, Integer totalSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalSize = totalSize;

        totalPages = totalSize / pageSize;

        if (totalSize %pageSize != 0){
            totalPages++;
        }

        if (pageNo >totalPages){

            this.pageNo=totalPages;
        }

        if (pageNo<=0){
            this.pageNo=1;
        }

        star = (this.pageNo - 1) *pageSize;

    }


}

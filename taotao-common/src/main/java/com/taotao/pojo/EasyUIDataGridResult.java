package com.taotao.pojo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/10
 * Time:15:18
 * Desc:
 */
public class EasyUIDataGridResult {
    //查询结果的总记录输
    private long total;
    //集合，包含显示的所有数据其
    // 中集合中每个元素的key应该和
    // dategrid的field对应。
    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}

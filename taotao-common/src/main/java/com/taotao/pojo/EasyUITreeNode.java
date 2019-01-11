package com.taotao.pojo;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/10
 * Time:22:55
 * Desc:
 */
public class EasyUITreeNode {
    //当前节点的id
    private long id;
    //显示的文本
    private String text;
    //如果当前节点为父节点，state为closed,如果是页节点为open
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

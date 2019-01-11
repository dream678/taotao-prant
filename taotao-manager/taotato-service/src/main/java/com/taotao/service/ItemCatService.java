package com.taotao.service;

import com.taotao.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/11
 * Time:8:55
 * Desc:
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentId);
}

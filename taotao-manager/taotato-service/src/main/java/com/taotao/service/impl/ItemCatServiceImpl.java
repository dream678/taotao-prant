package com.taotao.service.impl;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.EasyUITreeNode;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemCatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/11
 * Time:8:56
 * Desc:
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Resource
    private TbItemCatMapper itemCatMapper;
    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        //根据parentId查询分类列表
        TbItemCatExample example=new TbItemCatExample();
        //设置查询条件
        TbItemCatExample.Criteria  criteria=example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbItemCat> list=itemCatMapper.selectByExample(example);
       //装换成EasyUITreeNode列表
        List<EasyUITreeNode> resultlist=new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            //创建一个节点
            EasyUITreeNode node=new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            //添加到列表中
            resultlist.add(node);

        }

        return resultlist;
    }
}

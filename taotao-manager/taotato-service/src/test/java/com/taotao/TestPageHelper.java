package com.taotao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/10
 * Time:15:07
 * Desc:
 */
public class TestPageHelper {

@Test
    public void teswtpageHelper()throws Exception{
    //或得代理对象
    ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
    TbItemMapper tbItemMapper=context.getBean(TbItemMapper.class);
    //设置分页
    PageHelper.startPage(1,30);
    //执行查询
    TbItemExample example=new TbItemExample();
    List<TbItem> list=tbItemMapper.selectByExample(example);
    //取分页后结果
    PageInfo<TbItem> pageInfo=new PageInfo<>(list);
    long total=pageInfo.getTotal();
    System.out.println("total"+total);
    int pages=pageInfo.getPages();
    System.out.println("pages"+pages);
    int pageSize=pageInfo.getPageSize();
    System.out.println("pageSize"+pageSize);
}
}

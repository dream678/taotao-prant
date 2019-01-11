package com.taotao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.csource.fastdfs.*;
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
    public void teswtpageHelper() throws Exception {
        //或得代理对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper tbItemMapper = context.getBean(TbItemMapper.class);
        //设置分页
        PageHelper.startPage(1, 30);
        //执行查询
        TbItemExample example = new TbItemExample();
        List<TbItem> list = tbItemMapper.selectByExample(example);
        //取分页后结果
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("total " + total);
        int pages = pageInfo.getPages();
        System.out.println("pages " + pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize " + pageSize);
    }

    @Test
    public void testUpload() throws Exception {// 1、把FastDFS提供的jar包添加到工程中
        // 2、初始化全局配置。加载一个配置文件。
        ClientGlobal.init("F:\\电商项目\\taotao-prant\\taotao-manager\\taotao-manager-web\\src\\main\\resouces\\properties\\client");
        // 3、创建一个TrackerClient对象。
        TrackerClient trackerClient = new TrackerClient();
        // 4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        // 6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        // 7、直接调用StorageClient对象方法上传文件即可。
        String[] strings = storageClient.upload_file("C:\\Users\\admin\\Desktop\\link.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

package com.taotao.controller;

import com.taotao.pojo.PictureResult;
import com.taotao.service.PictureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/11
 * Time:10:29
 * Desc:
 */
@Controller
public class PictureController {
    @Resource
    private PictureService pictureService;

    @RequestMapping("pic/upload")
    @ResponseBody
    public PictureResult uploadFile(MultipartFile uploadFile) {
        PictureResult result = pictureService.uploadPic(uploadFile);
        System.out.println(result.getUrl());
        return result;
    }
}

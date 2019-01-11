package com.taotao.service;

import com.taotao.pojo.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created with IntelliJ IDEA.
 * User:admin
 * Date:2019/1/11
 * Time:10:26
 * Desc:
 */
public interface PictureService {
    PictureResult uploadPic(MultipartFile pcfile);
}

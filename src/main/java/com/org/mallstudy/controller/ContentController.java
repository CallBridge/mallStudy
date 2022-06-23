package com.org.mallstudy.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 内容管理Controller
 * Created By keqiao
 * on 2022/6/23
 */
@Controller
@Api(tags = "ContentController",value = "content controller value")
@RequestMapping("/content")
public class ContentController {

    public IPage<> getCotnents()
}

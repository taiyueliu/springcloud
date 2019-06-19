package com.liutaiyue.controller;

import com.liutaiyue.common.utils.ClientApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 刘太月
 * @Despriction
 * @Created in 2019/6/19 12:24
 * @version: 1.0
 * <p>copyright: Copyright (c) 2018</p>
 */
@RestController
public class DeptController implements ClientApi{
    @Override
    @GetMapping("/dept/getDept/{id}")
    public String getDept(@PathVariable("id") Long id){
        System.out.println("当前端口：8001");
        return "我的id"+id;
    }
}

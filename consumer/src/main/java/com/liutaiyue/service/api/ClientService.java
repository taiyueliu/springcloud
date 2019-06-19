package com.liutaiyue.service.api;

import com.liutaiyue.common.utils.ClientApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 刘太月
 * @Despriction
 * @Created in 2019/6/19 14:11
 * @version: 1.0
 * <p>copyright: Copyright (c) 2018</p>
 */
@Service
@FeignClient(name = "provider")
public interface ClientService extends ClientApi{
    @RequestMapping("/dept/getDept/{id}")
    String getDept(@RequestParam("id") Long id);
}

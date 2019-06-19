package com.liutaiyue.controller;

import com.liutaiyue.service.Demoservice;
import com.liutaiyue.service.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Author 刘太月
 * @Despriction
 * @Created in 2019/6/19 14:26
 * @version: 1.0
 * <p>copyright: Copyright (c) 2018</p>
 */
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index/{id}")
    public String index(@PathVariable Long id) {
        String jack = clientService.getDept(id);
        return jack;
    }

    @GetMapping("/rest/{id}")
    public String rest(@PathVariable Long id) {
        String value=restTemplate.getForObject(" http://provider/"+"dept/getDept/"+id, String.class);
        return value;
    }
}
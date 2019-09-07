package vip.abatt.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.abatt.springcloud.entities.Dept;
import vip.abatt.springcloud.service.DeptClientService;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService service;

    @PostMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }

}

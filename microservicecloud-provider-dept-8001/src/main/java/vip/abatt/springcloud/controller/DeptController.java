package vip.abatt.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.abatt.springcloud.entities.Dept;
import vip.abatt.springcloud.service.DeptService;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService service;


    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }

}

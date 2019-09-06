package vip.abatt.springcloud.service;

import vip.abatt.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}

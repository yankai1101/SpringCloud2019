package vip.abatt.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import vip.abatt.springcloud.entities.Dept;

import java.util.List;

@Mapper
public interface DeptDAO {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}

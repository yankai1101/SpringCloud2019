package vip.abatt.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")//进行序列化和反序列化操作的时候如果没有这个字段可能会出问题
@NoArgsConstructor//无参构造
@Data//getter setter
@Accessors(chain = true)//链式调用
public class Dept implements Serializable {
    /*主键*/
    private Long deptno;
    /*部门名称*/
    private String dname;
    /*来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库*/
    private String db_source;
}

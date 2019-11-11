package springDemo.dao;

import java.util.List;

import springDemo.model.Permission;
import springDemo.model.Role;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    List<Permission> selectAll();
    
    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}
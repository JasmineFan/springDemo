package springDemo.dao;

import java.util.List;

import springDemo.model.Role;
import springDemo.model.User;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);
    
    List<Role> selectAll();
    
    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}
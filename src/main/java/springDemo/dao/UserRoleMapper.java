package springDemo.dao;

import java.util.List;

import springDemo.model.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    List<UserRole> selectAll();
    
    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}
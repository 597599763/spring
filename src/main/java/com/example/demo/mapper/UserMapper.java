package com.example.demo.mapper;

import com.example.demo.domain.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @author zhangyang
 * @date 2018/1/8
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select id,name,age FROM tb_tic_user")
    List<UserDo> selectAll();
}

package com.example.demo.mapper;

import com.example.demo.domain.Test;
import org.springframework.cache.annotation.Cacheable;

public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);
    @Cacheable
    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}
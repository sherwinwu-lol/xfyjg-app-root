package com.xfjyg.sapiservice.mapper.gen;

import com.xfjyg.sapiservice.entity.gen.TestResource;
import com.xfjyg.sapiservice.entity.gen.TestResourceExample;
import java.util.List;

public interface TestResourceMapper {
    long countByExample(TestResourceExample example);

    int deleteByPrimaryKey(Long xhResourceId);

    int insert(TestResource record);

    int insertSelective(TestResource record);

    List<TestResource> selectByExample(TestResourceExample example);

    TestResource selectByPrimaryKey(Long xhResourceId);

    int updateByPrimaryKeySelective(TestResource record);

    int updateByPrimaryKey(TestResource record);
}
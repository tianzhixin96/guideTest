package com.pinyougou.mapper;

import com.pinyougou.pojo.TbClazz;
import com.pinyougou.pojo.TbClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbClazzMapper {
    long countByExample(TbClazzExample example);

    int deleteByExample(TbClazzExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbClazz record);

    int insertSelective(TbClazz record);

    List<TbClazz> selectByExample(TbClazzExample example);

    TbClazz selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbClazz record, @Param("example") TbClazzExample example);

    int updateByExample(@Param("record") TbClazz record, @Param("example") TbClazzExample example);

    int updateByPrimaryKeySelective(TbClazz record);

    int updateByPrimaryKey(TbClazz record);
}
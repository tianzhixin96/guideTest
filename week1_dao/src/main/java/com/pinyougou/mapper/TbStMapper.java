package com.pinyougou.mapper;

import com.pinyougou.pojo.TbSt;
import com.pinyougou.pojo.TbStExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStMapper {
    long countByExample(TbStExample example);

    int deleteByExample(TbStExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSt record);

    int insertSelective(TbSt record);

    List<TbSt> selectByExample(TbStExample example);

    TbSt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSt record, @Param("example") TbStExample example);

    int updateByExample(@Param("record") TbSt record, @Param("example") TbStExample example);

    int updateByPrimaryKeySelective(TbSt record);

    int updateByPrimaryKey(TbSt record);
}
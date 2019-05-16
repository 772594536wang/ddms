package com.knowater.ddms.dao;

import com.knowater.ddms.entity.Buildings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BuildingsMapper {
    /**
     * 查询所有未删除状态的数据
     * @return
     */
    List<Buildings> select(Buildings buildings);

    /**
     * 通过id获取对象信息
     *
     * @param id
     * @return
     */
    Buildings selectById(@Param("id") Integer id);

    /**
     * 更新对象信息
     *
     * @param id
     */
    void updateByPrimaryKeySelective(Buildings buildings);

    /**
     * 插入对象
     *
     * @param projectMain
     */
    void insert(Buildings buildings);
}

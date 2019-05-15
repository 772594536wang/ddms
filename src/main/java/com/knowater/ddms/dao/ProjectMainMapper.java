package com.knowater.ddms.dao;

import com.knowater.ddms.entity.ProjectMain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMainMapper {
    /**
     * 查询所有数据
     * @return
     */
    List<ProjectMain> select();
}

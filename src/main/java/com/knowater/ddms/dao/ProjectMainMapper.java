package com.knowater.ddms.dao;

import com.knowater.ddms.entity.ProjectMain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMainMapper {
    /**
     * 查询所有未删除状态的数据
     * @return
     */
    List<ProjectMain> select(ProjectMain project);
}

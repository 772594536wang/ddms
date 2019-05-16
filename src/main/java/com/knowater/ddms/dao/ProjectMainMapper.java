package com.knowater.ddms.dao;

import com.knowater.ddms.entity.ProjectMain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProjectMainMapper {
    /**
     * 查询所有未删除状态的数据
     * @return
     */
    List<ProjectMain> select(ProjectMain project);

    /**
     * 通过id获取对象信息
     *
     * @param id
     * @return
     */
    ProjectMain selectById(@Param("id") Integer id);

    /**
     * 更新对象信息
     *
     * @param id
     */
    void updateByPrimaryKeySelective(ProjectMain project);

    /**
     * 插入对象
     *
     * @param projectMain
     */
    void insert(ProjectMain projectMain);
}

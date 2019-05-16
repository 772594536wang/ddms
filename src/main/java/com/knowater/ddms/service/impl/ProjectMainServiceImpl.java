package com.knowater.ddms.service.impl;

import com.knowater.ddms.dao.ProjectMainMapper;
import com.knowater.ddms.entity.ProjectMain;
import com.knowater.ddms.service.ProjectMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMainServiceImpl implements ProjectMainService {
    @Autowired
    private ProjectMainMapper mainMapper;

    @Override
    public List<ProjectMain> listProject(ProjectMain project) {
        return mainMapper.select(project);
    }

    @Override
    public ProjectMain getProjectById(Integer id) {
        return mainMapper.selectById(id);
    }

    @Override
    public void delete(Integer id) {
        ProjectMain projectMain = new ProjectMain();
        projectMain.setId(id);
        projectMain.setStatus(0);
        mainMapper.updateByPrimaryKeySelective(projectMain);
    }

    @Override
    public void update(ProjectMain projectMain) {
        mainMapper.updateByPrimaryKeySelective(projectMain);
    }
}

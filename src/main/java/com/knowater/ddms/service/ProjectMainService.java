package com.knowater.ddms.service;

import com.knowater.ddms.entity.ProjectMain;

import java.util.List;

public interface ProjectMainService {

    List<ProjectMain> listProject(ProjectMain project);

    ProjectMain getProjectById(Integer id);

    void delete(Integer id);

    void update(ProjectMain projectMain);

    void add(ProjectMain projectMain);
}

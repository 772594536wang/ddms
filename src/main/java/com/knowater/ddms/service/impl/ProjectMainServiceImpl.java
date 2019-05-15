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
    public List<ProjectMain> select() {
        return mainMapper.select();
    }
}

package com.knowater.ddms.service.impl;

import com.knowater.ddms.dao.BuildingsMapper;
import com.knowater.ddms.entity.Buildings;
import com.knowater.ddms.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingsMapper buildingsMapper;

    @Override
    public List<Buildings> listBuild(Buildings buildings) {
        return buildingsMapper.select(buildings);
    }

    @Override
    public Buildings getBuildById(Integer id) {
        return buildingsMapper.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {
        Buildings build = new Buildings();
        build.setId(id);
        build.setStatus(0);
        buildingsMapper.updateByPrimaryKeySelective(build);
    }

    @Override
    public void update(Buildings build) {
        buildingsMapper.updateByPrimaryKeySelective(build);
    }

    @Override
    public void addBuilding(Buildings build) {
        buildingsMapper.insert(build);
    }
}

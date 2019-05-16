package com.knowater.ddms.service;


import com.knowater.ddms.entity.Buildings;

import java.util.List;

public interface BuildingService {

    List<Buildings> listBuild(Buildings buildings);

    Buildings getBuildById(Integer id);

    void deleteById(Integer id);

    void update(Buildings build);

    void addBuilding(Buildings build);
}

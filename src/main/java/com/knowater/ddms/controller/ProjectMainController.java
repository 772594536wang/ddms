package com.knowater.ddms.controller;

import com.knowater.ddms.entity.ProjectMain;
import com.knowater.ddms.service.ProjectMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/test")
@RestController
public class ProjectMainController {

    @Autowired
    private ProjectMainService mainService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String get(){
        List<ProjectMain> select = mainService.select();
        System.out.println("xxxx");
        return null;
    }
}

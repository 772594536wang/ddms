package com.knowater.ddms.controller.manager;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.knowater.ddms.entity.ProjectMain;
import com.knowater.ddms.result.ResponseEntry;
import com.knowater.ddms.result.ResultBuilder;
import com.knowater.ddms.service.ProjectMainService;
import com.knowater.ddms.utils.FastJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/project")
@RestController
public class ProjectMainController {

    @Autowired
    private ProjectMainService projectMainService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntry get(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                             @RequestParam(value = "serialNumber", required=false) String serialNumber,
                             @RequestParam(value = "projectName", required=false) String projectName,
                             @RequestParam(value = "orgName", required=false) String orgName,
                             @RequestParam(value = "contact", required=false) String contact,
                             @RequestParam(value = "projectType", required=false) String projectType,
                             @RequestParam(value = "manager", required=false) String manager) {

        PageHelper.startPage(pageNum, pageSize);

        ProjectMain recData = new ProjectMain();
        recData.setSerialNumber(serialNumber);
        recData.setProjectName(projectName);
        recData.setOrgName(orgName);
        recData.setContact(contact);
        if(!StringUtils.isEmpty(projectType)){
            recData.setProjectType(Integer.valueOf(projectType));
        }
        recData.setManager(manager);

        List<ProjectMain> projectMains = projectMainService.listProject(recData);
        PageInfo<ProjectMain> projectPageInfo = new PageInfo<>(projectMains);
        Map<String, Object> map = new HashMap<>();
        map.put("list", projectPageInfo.getList());
        map.put("total", projectPageInfo.getTotal());
        return ResultBuilder.buildSuccessResult(map);
    }
}

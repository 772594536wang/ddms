package com.knowater.ddms.controller.sysmanager;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.knowater.ddms.contants.MsgContants;
import com.knowater.ddms.entity.Buildings;
import com.knowater.ddms.result.ResponseEntry;
import com.knowater.ddms.result.ResultBuilder;
import com.knowater.ddms.service.BuildingService;
import com.knowater.ddms.utils.FastJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 构筑物管理
 *
 * @author wangpf
 */
@RequestMapping(value = "/buildManager")
@RestController
public class BuildManager {

    @Autowired
    private BuildingService buildingService;

    @RequestMapping(value = "/listBuild", method = RequestMethod.GET)
    public ResponseEntry listBuild(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "serialNumber", required = false) String serialNumber,
                                   @RequestParam(value = "buildName", required = false) String buildName){
        PageHelper.startPage(pageNum, pageSize);

        Buildings buildings = new Buildings();
        buildings.setSerialNumber(serialNumber);
        buildings.setBuildName(buildName);
        List<Buildings> buildingsList = buildingService.listBuild(buildings);

        PageInfo<Buildings> buildPageInfo = new PageInfo<>(buildingsList);
        Map<String, Object> map = new HashMap<>();
        map.put("list", buildPageInfo.getList());
        map.put("total", buildPageInfo.getTotal());
        return ResultBuilder.buildSuccessResult(map);
    }

    @RequestMapping(value = "/getBuild", method = RequestMethod.GET)
    public ResponseEntry getBuild(@RequestParam("id") Integer id){
        if(id == 0){
            return ResultBuilder.buildErrorResult(MsgContants.PARAM_ERROR);
        }
        Buildings build = buildingService.getBuildById(id);
        return ResultBuilder.buildSuccessResult(build);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResponseEntry delete(@PathVariable(value = "id") Integer id){
        if(id == 0){
            return ResultBuilder.buildErrorResult(MsgContants.PARAM_ERROR);
        }

        buildingService.deleteById(id);
        return ResultBuilder.buildSuccessResult("删除成功！");
    }

    @RequestMapping(value = "/updateBuild", method = RequestMethod.GET)
    public ResponseEntry updateBuild(@RequestBody JSONObject data){
        Buildings build = FastJsonUtils.convertJSONToObject(data.toString(),Buildings.class);
        buildingService.update(build);
        return ResultBuilder.buildSuccessResult("更新成功！");
    }

    @RequestMapping(value = "/addBuild", method = RequestMethod.GET)
    public ResponseEntry addBuild(@RequestBody JSONObject data){
        Buildings build = FastJsonUtils.convertJSONToObject(data.toString(),Buildings.class);
        buildingService.addBuilding(build);
        return ResultBuilder.buildSuccessResult("添加成功！");
    }

}

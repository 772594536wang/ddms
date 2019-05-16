package com.knowater.ddms.controller.sysmanager;

import com.alibaba.fastjson.JSONObject;
import com.knowater.ddms.result.ResponseEntry;
import org.springframework.web.bind.annotation.*;

/**
 * 构筑物管理
 *
 * @author wangpf
 */
@RequestMapping(value = "/buildManager")
@RestController
public class BuildManager {

    @RequestMapping(value = "/getBuild", method = RequestMethod.GET)
    public ResponseEntry getBuild(@RequestParam("id") Integer id){
        return null;
    }

    @RequestMapping(value = "/listBuild", method = RequestMethod.GET)
    public ResponseEntry listBuild(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "serialNumber", required = false) String serialNumber,
                                   @RequestParam(value = "buildName", required = false) String buildName){
        return null;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ResponseEntry delete(@PathVariable(value = "id") Integer id){
        return null;
    }

    @RequestMapping(value = "/updateBuild", method = RequestMethod.GET)
    public ResponseEntry updateBuild(@RequestBody JSONObject data){
        return null;
    }

    @RequestMapping(value = "/addBuild", method = RequestMethod.GET)
    public ResponseEntry addBuild(@RequestBody JSONObject data){
        return null;
    }

}

package com.knowater.ddms.controller.sysmanager;

import com.github.pagehelper.PageHelper;
import com.knowater.ddms.contants.MsgContants;
import com.knowater.ddms.result.ResponseEntry;
import com.knowater.ddms.result.ResultBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 指标字典管理controller
 *
 * @author wang
 */
@RestController
@RequestMapping(value = "/zbDictManager")
public class ZbDictController {

    @RequestMapping(value = "/listDict", method = RequestMethod.GET)
    public ResponseEntry listBuild(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "serialNumber", required = false) String serialNumber,
                                   @RequestParam(value = "buildName", required = false) String buildName) {
        PageHelper.startPage(pageNum, pageSize);

        return null;
    }

    @RequestMapping(value = "/getDict",method = RequestMethod.GET)
    public ResponseEntry getDict(@RequestParam(value = "id") Integer id){
        if(id == 0){
            return ResultBuilder.buildErrorResult(MsgContants.PARAM_ERROR);
        }

        return null;

    }

    @RequestMapping(value = "/updateDict",method = RequestMethod.PUT)
    public ResponseEntry updateDict(){

        return null;

    }

    @RequestMapping(value = "/deleteDict/{id}",method = RequestMethod.DELETE)
    public ResponseEntry deleteDict(){

        return null;

    }

    @RequestMapping(value = "/addDict",method = RequestMethod.DELETE)
    public ResponseEntry addDict(){
        return null;
    }
}

package z.hong.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import z.hong.util.InfoSearchJsonRspUtil;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SearchCollegeController
 * @Description 提供对外调用接口 查询大学
 * @Author czy
 * @Date 2020/10/5
 * @Version V1.0
 **/

@RestController
@RequestMapping("/api")
public class SearchCollegeController {

    private static Logger logger= LoggerFactory.getLogger(SearchCollegeController.class);

    @PostMapping(value = "/qryCollege")
    public JSONObject qryCollege(@RequestBody JSONObject jsonObject){
        logger.info("-----------大学查询接口-----------");
        logger.info(String.valueOf(jsonObject));
        return InfoSearchJsonRspUtil.createErrorRsp("查询失败");
    }
}

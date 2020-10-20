package z.hong.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import z.hong.service.CollegeInfoSearch;
import z.hong.util.InfoSearchJsonRspUtil;

import java.util.HashMap;
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

    @Autowired
    @Qualifier("CollegeInfoSearchImpl")
    private CollegeInfoSearch collegeInfoSearch;

    private static Logger logger= LoggerFactory.getLogger(SearchCollegeController.class);

    @PostMapping(value = "/qryCollege")
    public JSONObject qryCollege(@RequestBody JSONObject jsonObject){
        logger.info("-----------大学查询接口-----------");
        logger.info(String.valueOf(jsonObject));
        String value=jsonObject.getString("value");
        Integer val=0;
        try {
            val=Integer.parseInt(value);
        }catch (Exception e){
            e.printStackTrace();
            return InfoSearchJsonRspUtil.createErrorRsp("数值非法，不是数字");
        }
        List<Map<String, Object>> colleges = null;
        int flag=10;//文科分数标志
        Map<String, Object> map = JSONArray.parseObject(String.valueOf(jsonObject));
        //获取查询方式
        String qyr_type = jsonObject.getString("qyr_type");
        String province = jsonObject.getString("province");
        if (qyr_type.equals("分数")) {
            if(!province.equals("全部")){
                colleges = collegeInfoSearch.selectCollegeGrade(map);
            }else{
                colleges = collegeInfoSearch.selectAllCollegeGrade(map);
            }
            if(jsonObject.getString("subject").equals("理科")){
                flag=11;//理科分数标志
            }
        }else{
            if(!province.equals("全部")){
                colleges = collegeInfoSearch.selectCollegeRank(map);
            }else{
                colleges = collegeInfoSearch.selectAllCollegeRank(map);
            }

            flag=20;//文科排位标志
            if(jsonObject.getString("subject").equals("理科")){
                flag=21;//理科排位标志
            }
        }
        logger.info(String.valueOf(colleges));
        return InfoSearchJsonRspUtil.createSuccessRsp(colleges,flag);
    }
}

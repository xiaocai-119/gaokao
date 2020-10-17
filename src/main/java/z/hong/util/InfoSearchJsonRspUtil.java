package z.hong.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import z.hong.controller.SearchCollegeController;

public class InfoSearchJsonRspUtil implements Serializable {

    private static Logger logger= LoggerFactory.getLogger(SearchCollegeController.class);

    public static JSONObject createSuccessRsp(List<Map<String,Object>> datas,int flag){

        JSONObject json=new JSONObject();
        JSONObject rsp_json=new JSONObject();
        JSONObject body_json=new JSONObject();
        body_json.put("RESP_CODE","0000");
        body_json.put("RESP_DESC","执行成功");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("orange");
        colors.add("pink");
        colors.add("green");
        colors.add("red");
        colors.add("black");
        Random random = new Random();

        JSONArray array=new JSONArray();

        for(int i=0;i<datas.size();i++){
            JSONObject dataObject=new JSONObject();
            dataObject.put("collegeName",datas.get(i).get("college_name")+"");
            if(flag==10){
                dataObject.put("da",datas.get(i).get("art_min_grade")+"");
            }else if(flag==11) {
                dataObject.put("da",datas.get(i).get("science_min_grade")+"");
            }
            else if(flag==20){
                dataObject.put("da",datas.get(i).get("art_min_rank")+"");
            }else if(flag==21){
                dataObject.put("da",datas.get(i).get("science_min_rank")+"");
            }
            dataObject.put("desc",datas.get(i).get("desc"));
            dataObject.put("url",datas.get(i).get("url"));
            dataObject.put("imgSrc",datas.get(i).get("img"));
            dataObject.put("color", colors.get(random.nextInt(4)));
            array.add(dataObject);
        }
        logger.info(String.valueOf(array));
        body_json.put("DATAS",array);
        rsp_json.put("QRY_ACCT_INFO_RSP",body_json);
        json.put("UNI_BSS_BODY",rsp_json);

        return json;
    }
    public static JSONObject createErrorRsp(String errorMsg){

        JSONObject json=new JSONObject();
        JSONObject rsp_json=new JSONObject();
        JSONObject body_json=new JSONObject();
        body_json.put("RESP_CODE","8888");
        body_json.put("RESP_DESC",errorMsg);
        body_json.put("COLOR","pink");
        rsp_json.put("QRY_ACCT_INFO_RSP",body_json);
        json.put("UNI_BSS_BODY",rsp_json);

        return json;
    }
}
package z.hong.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class InfoSearchJsonRspUtil implements Serializable {


    public static JSONObject createSuccessRsp(List<Map<String,Object>> datas){

        JSONObject json=new JSONObject();
        JSONObject rsp_json=new JSONObject();
        JSONObject body_json=new JSONObject();
        body_json.put("RESP_CODE","0000");
        body_json.put("RESP_DESC","执行成功");

        JSONArray array=new JSONArray();
        for(int i=0;i<datas.size();i++){
            JSONObject dataObject=new JSONObject();
            dataObject.put("ACCT_ID",datas.get(i).get("acct_id"));
            dataObject.put("ACCT_NAME",datas.get(i).get("pay_name"));
            array.add(dataObject);
        }
        body_json.put("ACCT_INFO",array);
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
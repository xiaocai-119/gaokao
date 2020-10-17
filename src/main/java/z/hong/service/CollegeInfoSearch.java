package z.hong.service;

import org.springframework.stereotype.Service;
import z.hong.po.College;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CollegeInfoSearch {

    //根据位次查询学校
    List<Map<String,Object>> selectCollegeRank(Map<String,Object> map);
    //根据成绩查询学校
    List<Map<String,Object>> selectCollegeGrade(Map<String,Object> map);
}

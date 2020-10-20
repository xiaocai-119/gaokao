package z.hong.dao;

import z.hong.po.College;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//College 接口
public interface CollegeMapper {

        //根据位次查询学校
        List<College> selectCollegeRank(Map<String,Object> map);
        //根据成绩查询学校
        List<College> selectCollegeGrade(Map<String,Object> map);
        //根据排位查询全部学校
        List<College> selectAllCollegeRank(Map<String,Object> map);
        //根据成绩查询全部学校
        List<College> selectAllCollegeGrade(Map<String,Object> map);
}

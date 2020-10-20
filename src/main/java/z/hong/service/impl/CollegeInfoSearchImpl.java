package z.hong.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import z.hong.dao.CollegeMapper;
import z.hong.po.College;
import z.hong.service.CollegeInfoSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeInfoSearchImpl implements CollegeInfoSearch {

    private CollegeMapper collegeMapper;

    public void setCollegeMapper(CollegeMapper collegeMapper) {
        this.collegeMapper = collegeMapper;
    }

    @Override
    public List<Map<String,Object>> selectCollegeRank(Map<String,Object> map) {
        //调用dao层，获取数据库信息
        List<College> collegeList = collegeMapper.selectCollegeRank(map);
        List<Map<String,Object>> rel = new ArrayList<Map<String,Object>>();
        //将college对象转换成map对象
        for (College college : collegeList){
            Map<String,Object> rell = new HashMap<String, Object>();
            rell.put("college_id",college.getCollege_id());
            rell.put("college_name",college.getCollege_name());
            rell.put("college_location",college.getCollege_location());
            rell.put("art_min_grade",college.getArt_min_grade());
            rell.put("art_min_rank",college.getArt_min_rank());
            rell.put("science_min_grade",college.getScience_min_grade());
            rell.put("science_min_rank",college.getScience_min_rank());
            rell.put("desc",college.getDesc());
            rell.put("url",college.getUrl());
            rell.put("img",college.getImg());
            rel.add(rell);
        }
        return rel;
    }

    @Override
    public List<Map<String, Object>> selectCollegeGrade(Map<String,Object> map) {
        //调用dao层，获取数据库信息
        List<College> collegeList = collegeMapper.selectCollegeGrade(map);
        List<Map<String,Object>> rel = new ArrayList<Map<String,Object>>();
        //将college对象转换成map对象
        for (College college : collegeList){
            Map<String,Object> rell = new HashMap<String, Object>();
            rell.put("college_id",college.getCollege_id());
            rell.put("college_name",college.getCollege_name());
            rell.put("college_location",college.getCollege_location());
            rell.put("art_min_grade",college.getArt_min_grade());
            rell.put("art_min_rank",college.getArt_min_rank());
            rell.put("science_min_grade",college.getScience_min_grade());
            rell.put("science_min_rank",college.getScience_min_rank());
            rell.put("desc",college.getDesc());
            rell.put("url",college.getUrl());
            rell.put("img",college.getImg());
            rel.add(rell);
        }
        return rel;
    }
    @Override
    public List<Map<String,Object>> selectAllCollegeRank(Map<String,Object> map) {
        //调用dao层，获取数据库信息
        List<College> collegeList = collegeMapper.selectAllCollegeRank(map);
        List<Map<String,Object>> rel = new ArrayList<Map<String,Object>>();
        //将college对象转换成map对象
        for (College college : collegeList){
            Map<String,Object> rell = new HashMap<String, Object>();
            rell.put("college_id",college.getCollege_id());
            rell.put("college_name",college.getCollege_name());
            rell.put("college_location",college.getCollege_location());
            rell.put("art_min_grade",college.getArt_min_grade());
            rell.put("art_min_rank",college.getArt_min_rank());
            rell.put("science_min_grade",college.getScience_min_grade());
            rell.put("science_min_rank",college.getScience_min_rank());
            rell.put("desc",college.getDesc());
            rell.put("url",college.getUrl());
            rell.put("img",college.getImg());
            rel.add(rell);
        }
        return rel;
    }

    @Override
    public List<Map<String, Object>> selectAllCollegeGrade(Map<String,Object> map) {
        //调用dao层，获取数据库信息
        List<College> collegeList = collegeMapper.selectAllCollegeGrade(map);
        List<Map<String,Object>> rel = new ArrayList<Map<String,Object>>();
        //将college对象转换成map对象
        for (College college : collegeList){
            Map<String,Object> rell = new HashMap<String, Object>();
            rell.put("college_id",college.getCollege_id());
            rell.put("college_name",college.getCollege_name());
            rell.put("college_location",college.getCollege_location());
            rell.put("art_min_grade",college.getArt_min_grade());
            rell.put("art_min_rank",college.getArt_min_rank());
            rell.put("science_min_grade",college.getScience_min_grade());
            rell.put("science_min_rank",college.getScience_min_rank());
            rell.put("desc",college.getDesc());
            rell.put("url",college.getUrl());
            rell.put("img",college.getImg());
            rel.add(rell);
        }
        return rel;
    }
}

package z.hong.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import z.hong.po.College;
import z.hong.service.CollegeInfoSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeInfoSearchImpl implements CollegeInfoSearch {
    private SqlSessionFactory factory;
    //覆盖掉默认构造函数,这样就有了工厂，可以进一步创建对象
    public CollegeInfoSearchImpl(SqlSessionFactory factory){
        this.factory = factory;
    }
    @Override
    public List<Map<String,Object>> selectCollegeRank() {
        //1.使用工厂创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //2.使用sqlSession执行查询所有方法(此处需要的参数:(String statement)从配置文件中获取) namespace + id
        List<College>  collegeList = sqlSession.selectList("z.hong.service.CollegeInfoSearch.selectCollegeRank");
        List<Map<String,Object>> rel = new ArrayList<Map<String,Object>>();
        Map<String,Object> rell = new HashMap<String, Object>();
        for (College college : collegeList){
            rell.put("college_id",college.getCollege_id());
            rell.put("college_name",college.getCollege_name());
            rell.put("college_location",college.getCollege_location());
            rell.put("art_min_grade",college.getArt_min_grade());
            rell.put("art_min_rank",college.getArt_min_rank());
            rell.put("science_min_grade",college.getScience_min_grade());
            rell.put("science_min_rank",college.getScience_min_rank());

            rel.add(rell);
            System.out.println(rel);
        }
        //使用完后关闭掉
        sqlSession.close();
        return rel;
    }
}

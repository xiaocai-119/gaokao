package z.hong.test;

import jdk.nashorn.internal.parser.JSONParser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import z.hong.po.College;
import z.hong.util.MybatisUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {
    @Test
    public void findCollegeByRankTest() throws Exception {
        //1.读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream =
                Resources.getResourceAsStream(resource);
        //2.根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        //3.通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行定义的sql，返回映射结果
        List<College> colleges =
                sqlSession.selectList("z.hong.service.CollegeInfoSearch.selectCollegeRank",160000);

//        for (College college:colleges){
//            System.out.println(college.getCollege_id());
//        }
        //5.打印输出结果
        List<Map<String,Object>> rel = new ArrayList<Map<String,Object>>();

        for (College college : colleges){
            Map<String,Object> rell = new HashMap<String, Object>();
            rell.put("college_id",college.getCollege_id());
            System.out.println(rell.get("college_id"));
            rell.put("college_name",college.getCollege_name());
            rell.put("college_location",college.getCollege_location());
            rell.put("art_min_grade",college.getArt_min_grade());
            rell.put("art_min_rank",college.getArt_min_rank());
            rell.put("science_min_grade",college.getScience_min_grade());
            rell.put("science_min_rank",college.getScience_min_rank());
            rel.add(rell);

        }

        for (int i=0;i<rel.size();i++){
            System.out.println(rel.get(i).get("college_id"));
        }
        //6.关闭Sqlsession
        sqlSession.close();
        //List<Map<String,Object>>
    }
}
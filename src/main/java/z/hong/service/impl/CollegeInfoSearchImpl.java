package z.hong.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import z.hong.service.CollegeInfoSearch;

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
        List<Map<String,Object>> collegeList = sqlSession.selectList("z.hong.dao.CollegeDao.selectCollegeRank");
        //使用完后关闭掉
        sqlSession.close();
        return collegeList;
    }
}

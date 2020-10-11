package z.hong.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtils {
    private static SqlSessionFactory factory = null;
    //初始化SqlSessionFactory对象
    static {
        try{
            Reader reader =
                    Resources.getResourceAsReader("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取静态对象
    public static SqlSession getSession(){
        return factory.openSession();
    }
}

package z.hong.dao;

import java.util.List;
import java.util.Map;

//College 接口
public interface CollegeDao {

        public List<Map<String,Object>> selectCollegeRank(Integer rank);

        public List<Map<String,Object>> selectCollegeGrade(Integer grade);

}

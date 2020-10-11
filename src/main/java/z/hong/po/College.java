package z.hong.po;
//持久化类
public class College {
    private Integer college_id;
    private String college_name;
    private String college_location;
    private Integer art_min_grade;
    private Integer art_min_rank;
    private Integer science_min_grade;
    private Integer science_min_rank;

    public Integer getCollege_id() {
        return college_id;
    }

    public void setCollege_id(Integer college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getCollege_location() {
        return college_location;
    }

    public void setCollege_location(String college_location) {
        this.college_location = college_location;
    }

    public Integer getArt_min_grade() {
        return art_min_grade;
    }

    public void setArt_min_grade(Integer art_min_grade) {
        this.art_min_grade = art_min_grade;
    }

    public Integer getArt_min_rank() {
        return art_min_rank;
    }

    public void setArt_min_rank(Integer art_min_rank) {
        this.art_min_rank = art_min_rank;
    }

    public Integer getScience_min_grade() {
        return science_min_grade;
    }

    public void setScience_min_grade(Integer science_min_grade) {
        this.science_min_grade = science_min_grade;
    }

    public Integer getScience_min_rank() {
        return science_min_rank;
    }

    public void setScience_min_rank(Integer science_min_rank) {
        this.science_min_rank = science_min_rank;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", college_name='" + college_name + '\'' +
                ", college_location='" + college_location + '\'' +
                ", art_min_grade=" + art_min_grade +
                ", art_min_rank=" + art_min_rank +
                ", science_min_grade=" + science_min_grade +
                ", science_min_rank=" + science_min_rank +
                '}';
    }
}

package school;

import java.util.Arrays;

public class Students extends member{
    private String stuName;
    private int stuNumbering;
    private String stuGender;
    private int stuAge;
    private String major;
    private Course[] courses;

    public Students(String stuName,int stuNumbering,String stuGender,int stuAge,String major){
        super();
        this.stuName = stuName;
        this.stuNumbering = stuNumbering;
        this.stuGender = stuGender;
        this.stuAge = stuAge;
        this.major = major;
        courses = new Course[3];
    }

    @Override
    void setName(String name) {
        this.stuName = name;
    }

    @Override
    String getName() {
        return stuName;
    }

    @Override
    void setNumbering(int numbering) {
        stuNumbering = numbering;
    }

    @Override
    int getNumbering() {
        if(stuNumbering < 0){
            return 2020322001;
        }else {
            return stuNumbering;
        }
    }

    @Override
    void setGender(String gender) {
        this.stuGender = gender;
    }

    @Override
    String getGender() {
        if (stuGender.equals("man") && stuGender.equals("women")) {
            return stuGender;
        }else {
            return "man";
        }
    }/*if not set gender is man&&women, then set it was man*/

    @Override
    void setAge(int age) {
        this.stuAge = age;
    }

    @Override
    int getAge() {
        if(stuAge >18&&stuAge<=30){
            return stuAge;
        }else {
            return 18;
        }
    }/*you must >18&&<30*/

    @Override
    void getSchool() {
        return;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public boolean addCourse(Course course){
        boolean flag=false;
        if(!isSelectedCourse(course)&&isNullCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==null){
                    courses[i]=course;
                    course.addStudent(this);
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    public boolean removeCourse(Course course){
        boolean flag=false;
        if(isSelectedCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==course){
                    courses[i]=null;
                    course.removeStudent(this);
                    flag=true;
                    break;
                }
            }

        }
        return flag;
    }
    public void displayCourse(){
        System.out.println("学生"+this.stuName+"所选课程有：");
        for(Course c:courses){
            if(c!=null){
                System.out.print(c.getName()+" ");
            }
        }
        System.out.println("---------------"+ "\n");
    }
    public boolean isSelectedCourse(Course course){
        boolean flag=false;
        for(Course c:courses){
            if(c==course){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public boolean isNullCourse(Course course){
        boolean flag=false;
        for(Course c:courses){
            if(c==null){
                flag=true;
                break;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "Students{" +
                "stuName='" + stuName + '\'' +
                ", stuNumbering=" + getNumbering() +
                ", stuGender='" + getGender() + '\'' +
                ", stuAge=" + getAge() +
                ", major='" + major + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", school=" + school +
                "\n" +
                '}';
    }
}

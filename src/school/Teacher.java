package school;

public class Teacher extends member{
    private String teaName;
    private String teaGender;
    private int teaAge;
    private int teaNumbering;
    private Course[] course;
    public Teacher(String teaName,String teaGender,int teaAge,int teaNumbering){
        super();
        this.teaName = teaName;
        this.teaGender = teaGender;
        this.teaAge = teaAge;
        this.teaNumbering = teaNumbering;
        course = new Course[3];
    }
    @Override
    void setName(String name) {
        this.teaName = name;
    }

    @Override
    String getName() {
        return teaName;
    }

    @Override
    void setNumbering(int numbering) {
        this.teaNumbering = teaNumbering;
    }

    @Override
    int getNumbering() {
        return teaNumbering;
    }

    @Override
    void setGender(String gender) {
        this.teaGender = gender;
    }

    @Override
    String getGender() {
        return teaGender;
    }

    @Override
    void setAge(int age) {
        this.teaAge = age;
    }

    @Override
    int getAge() {
        return teaAge;
    }

    @Override
    void getSchool() {
        return;
    }


}


package school;

abstract class member{
    final String school = "北京石油化工学院";
    abstract void setName(String name);
    abstract String getName();
    abstract void setNumbering(int numbering);
    abstract int getNumbering();
    abstract void setGender(String gender);
    abstract String getGender();
    abstract void setAge(int age);
    abstract int getAge();
    abstract void getSchool();
}

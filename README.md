# Java-Experiment-2
***This is our school second experiment***
###### 计G202 2020322091 张昊宇
## 1.实验目的
1. 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
 >1. 掌握面向对象的类设计方法(属性，方法);
 >2. 掌握类的继承用法，通过构造方法实例化对象；
 >3. 学会使用super(),用于实例化子类；
 >4. 掌握使用Object根类的toString()方法,应用在相关对象的信息输出中。
---
2. challenge：
- [x] 模拟学生选课与退课
- [x] 一门课有多名学生
- [x] 一名学生可以选多门课
---

## 2.实验要求
+ 逻辑与业务要求：
 >说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。
--从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。-- 本实验结果现已变成：每个学生可选多门课程，但是每名教师仅教授一门课程，每门课程的授课教师也仅有一位。

+ 对象：
>member: 编号、姓名、性别、年龄、学校
>教师：编号、姓名、性别、年龄、教授课程
>学生：编号、姓名、性别、年龄、所选课程
>课程：课程编号、课程名称、课程老师、课程学生

+实验要求

- [x] 1. 编写上述实体类以及测试主类（注意类之间继承关系的适用）
- [x] 2.  在测试主类中，实例化多个类实体
- [x] 3.  模拟学生选课操作
- [x] 4.  打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）
- [x] 5.  模拟学生退课操作，再打印课程信息。
- [x] 6. 编写实验报告。
---

## 3.实验设计（包含关键方法）
1. 设计父类抽象方法，设定全部人员都归属于一个学校
```java
    final String school = "北京石油化工学院";
    abstract void setName(String name);
    abstract String getName();
```
2. 设计学生加入课程和退出课程方法
```java
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
```
3. 课程是否满员
```java
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
```
4. 设计显示学生的课程
```java
    public void displayCourse(){
        System.out.println("学生"+this.stuName+"所选课程有：");
        for(Course c:courses){
            if(c!=null){
                System.out.print(c.getName()+" ");
            }
        }
    }
```
5. toString():

```java
    public String toString() {
        return "Students{" +
                "stuName='" + stuName + '\'' +
                ", stuNumbering=" + getNumbering() +
                ", stuGender='" + getGender() + '\'' +
                ", stuAge=" + getAge() +
                ", major='" + major + '\'' +
                ", school=" + school +
                "\n" +
                '}';
    }
```
6. 判断设置的值是否正确
```java
    String getGender() {
        if (stuGender.equals("man") && stuGender.equals("women")) {
            return stuGender;
        }else {
            return "man";
        }
```
---

## 4.流程图
![]()
[]()

## 5.运行结果
```
学生未移除课程:
课程：高等数学
仲永 宗政江舒
------------------
课程：离散数学
仲永 宗政江舒 
------------------
课程：近代历史
邱朗
------------------
学生移除课程后:
学生仲永所选课程有：离散数学 
学生邱朗所选课程有：近代历史 
学生宗政江舒所选课程有：高等数学 离散数学 
调用toString():
Students{stuName='仲永', stuNumbering=2020322031, stuGender='man', stuAge=18, major='软件技术', school=北京石油化工学院
}
Students{stuName='邱朗', stuNumbering=2020322001, stuGender='man', stuAge=20, major='软件技术', school=北京石油化工学院
}
Students{stuName='宗政江舒', stuNumbering=202032295, stuGender='man', stuAge=22, major='软件技术', school=北京石油化工学院
}

```
---

## 6.感想与体会
1. 学习了抽象类的调用
2. 使用了final变量
3. 使用了toString()方法
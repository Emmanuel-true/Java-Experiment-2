package school;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.awt.*;
import java.io.*;


public class Test {
    public static void main(String args[]){
        Students stu0 = new Students("仲永",2020322031,"unknow",49,"软件技术");
        Students stu1 = new Students("邱朗",-1,"man",20,"软件技术");
        Students stu2 = new Students("宗政江舒",202032295,"women",22,"软件技术");
        Teacher tea0 = new Teacher("柴飞","man",35,201064425);
        Teacher tea1 = new Teacher("申屠剑晓","women",36,201068857);
        Teacher tea2 = new Teacher("尚平霞","man",55,201022164);
        Course cour0 = new Course(549,"高等数学",tea0);
        Course cour1 = new Course(21,"离散数学",tea1);
        Course cour2 = new Course(102,"近代历史",tea2);

        stu0.addCourse(cour0);
        stu0.addCourse(cour1);
        stu1.addCourse(cour2);
        stu0.addCourse(cour0);
        stu2.addCourse(cour0);
        stu2.addCourse(cour1);

        cour0.displayStudent();
        cour1.displayStudent();
        cour2.displayStudent();

        stu0.removeCourse(cour0);
        stu1.removeCourse(cour0);
        stu2.removeCourse(cour2);

        stu0.displayCourse();
        stu1.displayCourse();
        stu2.displayCourse();

        System.out.println(stu0);
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
package module3.homework.task3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {


        Course course1,course2,course3,course4,course5;
        Student student1,student2,student3,student4;
        GregorianCalendar startDate = new GregorianCalendar();
        Date dateOfStart;

        startDate.set(GregorianCalendar.YEAR,2016);
        startDate.set(GregorianCalendar.MONTH,7);
        startDate.set(GregorianCalendar.DAY_OF_MONTH,13);

        dateOfStart = startDate.getTime();

        course1 = new Course(dateOfStart,"course1");

        startDate.set(2016,8,19);
        dateOfStart = startDate.getTime();

        course2 = new Course(dateOfStart,"course2");

        startDate.set(2016,11,14);
        dateOfStart = startDate.getTime();

        course3 = new Course(dateOfStart,"course3");

        startDate.set(2016,10,27);
        dateOfStart = startDate.getTime();

        course4 = new Course(dateOfStart,"course4");

        startDate.set(2016,11,10);
        dateOfStart= startDate.getTime();

        course5 = new Course(dateOfStart,"course5");



        student1 = new Student("Ivan");
        student2 = new Student("Sidorenko","Ivan");
        student3 = new Student("Sidorenko","Ivan",5);
        student4 = new Student("Sidorenko",new Course[]{course1,course2});


        student1 = new SpecialStudent("Ivan","Sidorenko");
        student2 = new SpecialStudent("Ivan");
        student3 = new SpecialStudent("Ivan",135465497);


        student1 = new CollegeStudent("Ivan");
        student2 = new CollegeStudent("Sidorenko","Ivan");
        student3 = new CollegeStudent("Sidorenko","Ivan","KPI",1346546,435);

    }
}

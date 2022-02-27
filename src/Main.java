import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        // creating course
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("Course to learn Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Kotlin Course");
        course2.setDescription("Course to learn Kotlin for mobile");
        course2.setWorkload(4);

        // creating mentorship
        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java mentorship");
        mentorship.setDescription("OO Java");
        mentorship.setDate(LocalDate.now());

        // creating Bootcamp

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java developer");
        bootcampJava.setDescription("Bootcamp Web developer Java");
        bootcampJava.getContents().add(course1);
        bootcampJava.getContents().add(course2);
        bootcampJava.getContents().add(mentorship);


        Dev devJohn = new Dev();
        devJohn.setName("John Smith");
        devJohn.registerBootcamp(bootcampJava);
        System.out.println("Subscribed Content John:" + devJohn.getSubscribedContents());
        devJohn.toProgress();
        devJohn.toProgress();
        System.out.println("-");
        System.out.println("Subscribed Content John:" + devJohn.getSubscribedContents());
        System.out.println("Completed Content John:" + devJohn.getCompletedContents());
        System.out.println("XP:" + devJohn.calculateTotalXp());

    }


}

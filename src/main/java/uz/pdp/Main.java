package uz.pdp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*Bean context.xml orqali

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.hashCode());
        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1.hashCode());

        I usul tugadi*/

        /* Bean annotation orqali

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("uz.pdp");
        context.refresh();
        Person person = context.getBean(Person.class);
        System.out.println(person);

        II usul tugadi */
    }
}

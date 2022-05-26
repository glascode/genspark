package org.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //student dependent on phone
        //student dependent on address




        //XML Dependency injection
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student obj =(Student) context.getBean("student");


        System.out.println(obj.getName());


        //Annotation Dependency injection

        ApplicationContext context1 = new AnnotationConfigApplicationContext(Address.class);
        Address obj1 = (Address) context1.getBean("address");
        System.out.println(obj1.getCity());



        //Java Configuration Dependency injection

        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Phone obj3 = (Phone) context2.getBean(Phone.class);
        System.out.println(obj3.getMob());
    }
}

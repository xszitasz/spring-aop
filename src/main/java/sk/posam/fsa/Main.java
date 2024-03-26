package sk.posam.fsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sk.posam.fsa.bean.Child;
import sk.posam.fsa.bean.Parent;
import sk.posam.fsa.configuration.MyConfiguration;

public class Main {
    public static void main(String[] args) {
        // Bootstrapping our @Configuration
        // Parameter is the class where we will get our @Configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        // Get @Bean with class name of child
        // Child child = context.getBean(Child.class);

        // Get @Bean with class name of child
        Parent parent = context.getBean(Parent.class);

        // Print out child
        // System.out.println("Child name: " + child.getName());

        // Print out parents children name
        for(Child child : parent.getChildren()) {
            System.out.println("Parent has child: " + child.getName());
        }
    }
}
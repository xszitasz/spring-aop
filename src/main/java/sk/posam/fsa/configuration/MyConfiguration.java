package sk.posam.fsa.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import sk.posam.fsa.bean.Child;
import sk.posam.fsa.bean.Parent;

@Configuration
// We have to enable it
// By default it is not a normal operation
// Read documentation
@EnableAspectJAutoProxy
// We have to use this annotation to get our aspect by scanning it
@ComponentScan("sk.posam.fsa")
public class MyConfiguration {
    // Bean is specifically named
    @Bean("specific-bean")
    public Child child() {
        return new Child("My first child");
    }

    //Qualifier will get only specific bean
    @Bean
    public Parent parent(@Qualifier("specific-bean") Child child) {
        Parent parent = new Parent();
        parent.add(child);
        return parent;
    }
}

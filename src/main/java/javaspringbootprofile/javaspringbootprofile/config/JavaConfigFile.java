package javaspringbootprofile.javaspringbootprofile.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;


@Profile("profile-2") // if we add ! before profile-2 spring will run anything in this class with any profile is not profile-2 
@Configuration
public class JavaConfigFile {
    @Bean
    public String testFn(){
        System.out.println(" == profile-2 is running ===  ");
        return " == profile-2 is running ===";
    }
    @PostConstruct
    public void  fn(){ // this function will be loaded only if the profile-2 is running
        System.out.println("====> profile-2 loaded");
    }
}

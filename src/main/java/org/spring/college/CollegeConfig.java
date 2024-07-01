package org.spring.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.college")
public class CollegeConfig {

    @Bean
    public College collegeBean(){ //collegeBean - bean id
      College c=new College();
    return c;
   }

}

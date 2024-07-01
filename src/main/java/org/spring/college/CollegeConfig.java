package org.spring.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.spring.college")
public class CollegeConfig {

    @Bean
    public Principal principalBean(){
        return new Principal();
    }



    @Bean(name = {"colBean","colBeanAnother"})
    public College collegeBean(){ //collegeBean - bean id
      College c=new College();
      c.setPrincipal(principalBean());
    return c;
   }

}

package org.spring.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("collegeClass")
public class College {

    @Autowired
    private  Teacher teacher;

    @Autowired
    private Principal principal;

    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("testing this class method");

    }
    public College() {
    }


    /*public College(Principal principal) {
        this.principal = principal;
    }*/

  /*  public Principal getPrincipal() {
        return principal;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
        System.out.println("using setPrincipal method");
    }*/
}

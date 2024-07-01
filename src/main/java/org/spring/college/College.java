package org.spring.college;

import org.springframework.stereotype.Component;

//@Component("collegeClass")
public class College {

    private Principal principal;

    public void test(){
        principal.principalInfo();
        System.out.println("testing this class method");

    }
    public College() {
    }


    /*public College(Principal principal) {
        this.principal = principal;
    }*/

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
        System.out.println("using setPrincipal method");
    }
}

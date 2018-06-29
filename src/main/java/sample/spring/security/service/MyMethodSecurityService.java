package sample.spring.security.service;

import org.springframework.security.access.prepost.PreAuthorize;

public class MyMethodSecurityService {

    @PreAuthorize("hasAuthority('ADMIN')")
    public String execute() {
        return "Hello Method Security!!";
    }

	public char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
}

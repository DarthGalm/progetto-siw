package controller;

import model.Admin;
import model.LoginFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class AdminController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String email;
	private String password;
	private Admin admin;
	
	@EJB
	private LoginFacade loginFacade;
	
	public String login() {
		this.admin = loginFacade.adminLogin(email, password);
		if(admin==null) return "loginError";
		return "loggedAdminHome";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public LoginFacade getLoginFacade() {
		return loginFacade;
	}

	public void setLoginFacade(LoginFacade loginFacade) {
		this.loginFacade = loginFacade;
	}
	
	

}

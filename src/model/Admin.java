package model;

import javax.persistence.*;

@Entity
@NamedQuery(name = "retrieveAdminByEmail", query = "SELECT a FROM Admin a WHERE a.email = :email")
public class Admin {
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String name;
	
	public Admin(){}
	
	public Admin(String email, String password, String name){
		this.email=email;
		this.password=password;
		this.name=name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean checkPassword(String password) {
		return this.getPassword().equals(password);
	}

	@Override
	public int hashCode() {
		return this.email.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Admin a = (Admin) obj;
		return this.getEmail().equals(a.getEmail());
	}
}

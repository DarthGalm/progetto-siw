package controller;

import java.util.List;

import model.*;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AdminController {
	
//	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String email;
	private String password;
	private String name;
	private Admin admin;
	private String vat;
	private String code;
	private Product product;
	private Provider provider;
	private List<Provider> providers;
	
	@EJB
	private LoginFacade loginFacade;
	
	@EJB
	private ProductFacade productFacade;
	
	@EJB
	private ProviderFacade providerFacade;
	
	public String login() {
		this.admin = loginFacade.adminLogin(email, password);
		if(admin==null) return "loginError";
		return "loggedAdminHome";
	}
	
	public String providerJoinProduct() {
		this.provider=providerFacade.retrieveProviderByVat(vat);
		if(provider==null) return "notFoundAdmin";		
		this.product=productFacade.retrieveProductByCode(code);
		if(product==null) return "notFoundAdmin";
		productFacade.productJoinProvider(provider, product);
		return "completedOperation";
	}
	
	public String findProvidersForProduct() {
		this.product=productFacade.retrieveProductByCode(code);
		if(product==null) return "notFoundAdmin";
		this.providers=providerFacade.findProvidersForProduct(product.getId());
		return "providersForProduct";
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
		this.name=name;
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

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}


	public ProductFacade getProductFacade() {
		return productFacade;
	}

	public void setProductFacade(ProductFacade productFacade) {
		this.productFacade = productFacade;
	}

	public ProviderFacade getProviderFacade() {
		return providerFacade;
	}

	public void setProviderFacade(ProviderFacade providerFacade) {
		this.providerFacade = providerFacade;
	}
	
	

}

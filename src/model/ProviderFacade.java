package model;

import model.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import java.util.Date;
import java.util.List;

@Stateless
public class ProviderFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
    private EntityManager em;
	
	public Address createAddress(String street, String city, String state, String zipcode, String country) {
		Address address = new Address(street, city, state, zipcode, country);
		return address;
	}

	public Provider createProvider(String firstName, String lastName, String email, String phoneNumber, String vat, Address address) {
		TypedQuery<Provider> query = em.createNamedQuery("retrieveProviderByEmail", Provider.class);
		try{
			Provider provider = query.setParameter("email", email).getSingleResult();
			return null;
		
		} catch(NoResultException e) {
		Provider provider = new Provider (firstName, lastName, email, phoneNumber, vat, address);
		em.persist(provider);
		return provider; 
		}
	}

	public Provider getProvider(Long id) {
	    Provider provider = em.find(Provider.class, id);
		return provider;
	}
	
	public Provider retrieveProviderByVat(String vat) {
		TypedQuery<Provider> query = em.createNamedQuery("retrieveProviderByVat", Provider.class);
		try{
			Provider provider = query.setParameter("vat", vat).getSingleResult();
			return provider;
		} catch(NoResultException e) {
		return null; 
		}
	}
	
	public List<Provider> findProvidersForProduct(Long id) {
		TypedQuery<Provider> query = em.createNamedQuery("findProvidersForProduct", Provider.class);
		List<Provider> providers = query.setParameter("id", id).getResultList();
		return providers;
	}
}

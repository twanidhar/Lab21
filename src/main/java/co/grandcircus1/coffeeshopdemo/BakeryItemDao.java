package co.grandcircus1.coffeeshopdemo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
@Transactional

public class BakeryItemDao {

	
	@PersistenceContext 
	private EntityManager em;
	
	public List<BakeryItem> findAll() {
		 
		return em.createQuery("FROM BakeryItem", BakeryItem.class).getResultList();//From the java class:BakeryItem 
	}
	public BakeryItem findById(Long id) {//finds the item by the id
		return em.find(BakeryItem.class, id);
	}
	
//	public List<BakeryItem> findByCategory(String category) {
//		// HQL queries can have named parameters, such as :regex here.
//		// HQL queries use Java class and property names, not SQL table & column names.
//		return em.createQuery("FROM BakeryItem WHERE category = :category", BakeryItem.class)
//				.setParameter("category", category)
//				.getResultList();
//	}
	
//	public List<BakeryItem> findByKeyword(String keyword) {
//		return em.createQuery("FROM Bakery WHERE LOWER(name) LIKE :regex", BakeryItem.class)
//				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
//				.getResultList();
//	}
//	
	public void create(BakeryItem bakeryItem) {
		em.persist(bakeryItem);
	}
	
	public void edit(BakeryItem bakeryItem) {
		em.merge(bakeryItem);
	}
	
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		BakeryItem bakeryItem = em.getReference(BakeryItem.class, id);
		em.remove(bakeryItem);
	}
	
//	public Set<String> findAllCategories() {
//		// This query returns a list of Strings, so I give it String.class
//		List<String> categoryList = em.createQuery("SELECT DISTINCT category FROM Food", String.class)
//				.getResultList();
//		// Convert the List to a Set.
//		return new TreeSet<>(categoryList);
//	}
}



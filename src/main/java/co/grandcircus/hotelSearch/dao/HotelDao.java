package co.grandcircus.hotelSearch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.hotelSearch.entity.Hotel;


@Repository
@Transactional
public class HotelDao {
	
	/*
	 * Data Access Object is basically an object or an interface that provides access to an underlying database
	 */
	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	*/
	@PersistenceContext
	EntityManager em;
	
	public List<Hotel> findAll()
	{
		//String sql = "SELECT * FROM items";
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}
	
	public List<Hotel> findByCity(String city)
	{
		//String sql = "SELECT * FROM items WHERE user_id = ?";
		return em.createQuery("FROM Hotel WHERE city = :c", Hotel.class).setParameter("c", city).getResultList();
	}
	
	public void create(Hotel hotel)
	{
		em.persist(hotel); 
	}
	public void update(Hotel hotel)
	{
		em.merge(hotel);
	}
	public void delete(Long id)
	{
		// Deleting with Hibernate entity manager requires fetching a reference first.
		Hotel hotel = em.getReference(Hotel.class, id);
		em.remove(hotel);
	}
	

}

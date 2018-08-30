package co.grandcircus.hotelSearch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel_listing")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="hotel_id")	
	private Long id;
	
	@Column(name="hotel_name")	
	private String cool_name; 
	
	@Column(name="city")	
	private String city​;
	
	@Column(name="price_per_night")	
	private Integer pricePerNight;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName​() {
		return cool_name;
	}

	public void setName​(String name​) {
		this.cool_name = name​;
	}

	public String getCity​() {
		return city​;
	}

	public void setCity​(String city​) {
		this.city​ = city​;
	}

	public Integer getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
     
	
}

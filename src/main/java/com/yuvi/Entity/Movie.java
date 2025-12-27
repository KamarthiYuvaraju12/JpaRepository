package com.yuvi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="JPA_MOVIE_TABLE")
public class Movie {
	@Column(name="MID")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mid;
	
	@Column(name="MNAME",length=20)//Name Attribute is optional	
	private String mname;
	
	@Column(name="MRATING")
	private float mrating;
	
	@Column(name="MYEAR")//@Column is optional
	private Integer myear;
	

}

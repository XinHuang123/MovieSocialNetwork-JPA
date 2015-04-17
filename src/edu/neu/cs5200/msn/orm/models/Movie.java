package edu.neu.cs5200.msn.orm.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;

@Entity
public class Movie {
	@Id
	/*
	@Id
	@SequenceGenerator( name = "mySeq", sequenceName = "MY_SEQ", allocationSize = 1, initialValue = 1 )
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="mySeq")
	private Integer id;
	
	This will tell the database that the field is auto generated. And you will get the ID value in the entity after the create function. 
	*/
	private Integer id;
	private String title;
	private String plot;
	private String poster;
	private String movieId;
	
	//navigate to actor
	@OneToMany(mappedBy="movie")// movie in the actor classs -----?
	private List<Actor> actors; //----save all the information of actor?

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	public Movie(Integer id, String title, String plot, String poster,
			String movieId) {
		super();
		this.id = id;
		this.title = title;
		this.plot = plot;
		this.poster = poster;
		this.movieId = movieId;
	}
	public Movie() {
		super();
	}
}
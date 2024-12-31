package com.nx.entity;

import org.hibernate.validator.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "Title cannot be blank")
    @Size(min = 2, max = 255, message = "Title must be between 2 and 255 characters")
	private String title;

    @NotEmpty(message = "Author cannot be blank")
    @Size(min = 2, max = 100, message = "Author name must be between 2 and 100 characters")
    private String author;
    
    @Size(max = 500, message = "Description cannot be more than 500 characters")
    private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Book(Long id, String title, String author, String description) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}

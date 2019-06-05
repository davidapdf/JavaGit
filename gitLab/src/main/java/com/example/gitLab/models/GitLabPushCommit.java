package com.example.gitLab.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class GitLabPushCommit implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod_commit;
	
	@ManyToOne
	private GitLabPushEvents evento;
	
	private String id;
	private String message;
	private String timestamp;
	private String url;
	@OneToMany
	private List<GitLabPushAuthor> authors;
	@OneToMany
	private List<GitLabPushAdded> addeds;
	@OneToMany
	private List<GitLabPushModified> modifieds;
	@OneToMany
	private List<GitLabPushRemoved> removeds;
	public long getCod_commit() {
		return cod_commit;
	}
	public void setCod_commit(long cod_commit) {
		this.cod_commit = cod_commit;
	}
	public GitLabPushEvents getEvento() {
		return evento;
	}
	public void setEvento(GitLabPushEvents evento) {
		this.evento = evento;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<GitLabPushAuthor> getAuthors() {
		return authors;
	}
	public void setAuthors(List<GitLabPushAuthor> authors) {
		this.authors = authors;
	}
	public List<GitLabPushAdded> getAddeds() {
		return addeds;
	}
	public void setAddeds(List<GitLabPushAdded> addeds) {
		this.addeds = addeds;
	}
	public List<GitLabPushModified> getModifieds() {
		return modifieds;
	}
	public void setModifieds(List<GitLabPushModified> modifieds) {
		this.modifieds = modifieds;
	}
	public List<GitLabPushRemoved> getRemoveds() {
		return removeds;
	}
	public void setRemoveds(List<GitLabPushRemoved> removeds) {
		this.removeds = removeds;
	}
	
	
	

}

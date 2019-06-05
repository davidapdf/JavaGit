package com.example.gitLab.models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class GitLabPushRepository implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod_repository;
	
	@ManyToOne
	private GitLabPushEvents evento;
	
	private String name;
	private String url;
	private String description;
	private String homepeage;
	private String git_http_url;
	private	String git_ssh_url;
	private int visibility_level;
	public long getCod_repository() {
		return cod_repository;
	}
	public void setCod_repository(long cod_repository) {
		this.cod_repository = cod_repository;
	}
	public GitLabPushEvents getEvento() {
		return evento;
	}
	public void setEvento(GitLabPushEvents evento) {
		this.evento = evento;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHomepeage() {
		return homepeage;
	}
	public void setHomepeage(String homepeage) {
		this.homepeage = homepeage;
	}
	public String getGit_http_url() {
		return git_http_url;
	}
	public void setGit_http_url(String git_http_url) {
		this.git_http_url = git_http_url;
	}
	public String getGit_ssh_url() {
		return git_ssh_url;
	}
	public void setGit_ssh_url(String git_ssh_url) {
		this.git_ssh_url = git_ssh_url;
	}
	public int getVisibility_level() {
		return visibility_level;
	}
	public void setVisibility_level(int visibility_level) {
		this.visibility_level = visibility_level;
	}
	

}

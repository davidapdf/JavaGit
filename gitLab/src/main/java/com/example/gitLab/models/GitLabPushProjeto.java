package com.example.gitLab.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PUSH_PROJECT")
public class GitLabPushProjeto implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod_project;
	
	@ManyToOne
	private GitLabPushEvents evento;
	
	private int id;
	private String name;
	private String description;
	private String web_url;
	private String avatar_url;
	private String git_ssh_url;
	private String git_http_url;
	private String namespace;
	private String visibility_level;
	private String path_with_namespace;
	private	String default_branch;
	private String homepage;
	private String url;
	private String ssh_url;
	private String http_url;
	
	
	public long getCod_project() {
		return cod_project;
	}
	public void setCod_project(long cod_project) {
		this.cod_project = cod_project;
	}
	public GitLabPushEvents getEvento() {
		return evento;
	}
	public void setEvento(GitLabPushEvents evento) {
		this.evento = evento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public String getGit_ssh_url() {
		return git_ssh_url;
	}
	public void setGit_ssh_url(String git_ssh_url) {
		this.git_ssh_url = git_ssh_url;
	}
	public String getGit_http_url() {
		return git_http_url;
	}
	public void setGit_http_url(String git_http_url) {
		this.git_http_url = git_http_url;
	}
	public String getNamespace() {
		return namespace;
	}
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}
	public String getVisibility_level() {
		return visibility_level;
	}
	public void setVisibility_level(String visibility_level) {
		this.visibility_level = visibility_level;
	}
	public String getPath_with_namespace() {
		return path_with_namespace;
	}
	public void setPath_with_namespace(String path_with_namespace) {
		this.path_with_namespace = path_with_namespace;
	}
	public String getDefault_branch() {
		return default_branch;
	}
	public void setDefault_branch(String default_branch) {
		this.default_branch = default_branch;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSsh_url() {
		return ssh_url;
	}
	public void setSsh_url(String ssh_url) {
		this.ssh_url = ssh_url;
	}
	public String getHttp_url() {
		return http_url;
	}
	public void setHttp_url(String http_url) {
		this.http_url = http_url;
	}
	
	
	

}

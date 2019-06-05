package com.example.gitLab.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PUSH_EVENT")
public class GitLabPushEvents implements Serializable{
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cod_evento;

	private String object_kind; 
	private String before;
	private String depois_de;
	private String ref;
	private String checkout_sha;
	private String user_id;
	private String user_name;
	private String user_username;
	private String user_email;
	private String user_avatar;
	private String project_id;
	@OneToMany
	private List<GitLabPushProjeto> projects;
	@OneToMany
	private List<GitLabPushRepository> repositorys;
	@OneToMany
	private List<GitLabPushCommit> commits;
	private long total_commits_count;
	

	public long getCod_evento() {
		return cod_evento;
	}
	public void setCod_evento(long cod_evento) {
		this.cod_evento = cod_evento;
	}
	public String getObject_kind() {
		return object_kind;
	}
	public void setObject_kind(String object_kind) {
		this.object_kind = object_kind;
	}
	public String getBefore() {
		return before;
	}
	public void setBefore(String before) {
		this.before = before;
	}
	public String getDepois_de() {
		return depois_de;
	}
	public void setDepois_de(String depois_de) {
		this.depois_de = depois_de;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getCheckout_sha() {
		return checkout_sha;
	}
	public void setCheckout_sha(String checkout_sha) {
		this.checkout_sha = checkout_sha;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_avatar() {
		return user_avatar;
	}
	public void setUser_avatar(String user_avatar) {
		this.user_avatar = user_avatar;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	public List<GitLabPushProjeto> getProjects() {
		return projects;
	}
	public void setProjects(List<GitLabPushProjeto> projects) {
		this.projects = projects;
	}
	public List<GitLabPushRepository> getRepositorys() {
		return repositorys;
	}
	public void setRepositorys(List<GitLabPushRepository> repositorys) {
		this.repositorys = repositorys;
	}
	public List<GitLabPushCommit> getCommits() {
		return commits;
	}
	public void setCommits(List<GitLabPushCommit> commits) {
		this.commits = commits;
	}
	public long getTotal_commits_count() {
		return total_commits_count;
	}
	public void setTotal_commits_count(long total_commits_count) {
		this.total_commits_count = total_commits_count;
	}

	
	

}

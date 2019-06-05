package com.example.gitLab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gitLab.models.GitLabPushEvents;

public interface PushEventesRepository extends JpaRepository<GitLabPushEvents, Long> {
	GitLabPushEvents findById(long id);
}

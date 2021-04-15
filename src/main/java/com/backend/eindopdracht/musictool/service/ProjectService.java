package com.backend.eindopdracht.musictool.service;

import com.backend.eindopdracht.musictool.model.Project;

import java.util.Collection;

public interface ProjectService {

    public abstract Collection<Project> getProjects();

    public abstract String createProject(Project project);

    public abstract void deleteProject(String name);
}

package com.backend.eindopdracht.musictool.service;

import com.backend.eindopdracht.musictool.repository.ProjectRepository;
import com.backend.eindopdracht.musictool.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Collection<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public String createProject(Project project) {
        Project newProject = projectRepository.save(project);
        return newProject.getName();
    }

    @Override
    public void deleteProject(String name) {
        projectRepository.deleteById(name);
    }

    @Override
    public Optional<Project> getProject(String name) {
        return projectRepository.findById(name);
    }
}

package com.backend.eindopdracht.musictool.repository;

import com.backend.eindopdracht.musictool.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comment, Long> {
}

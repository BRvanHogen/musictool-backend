package com.backend.eindopdracht.musictool.service.comment;

import com.backend.eindopdracht.musictool.model.Comment;

import java.util.Collection;
import java.util.Optional;

public interface CommentService {

    public abstract Collection<Comment> getComments();
    public abstract Optional<Comment> getComment(Long id);
}

package com.backend.eindopdracht.musictool.service.comment;

import com.backend.eindopdracht.musictool.model.Comment;

import java.util.Collection;

public interface CommentService {

    public abstract Collection<Comment> getComments();
}

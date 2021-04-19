package com.backend.eindopdracht.musictool.service.comment;

import com.backend.eindopdracht.musictool.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CommentServiceImpl implements CommentService {

   @Autowired
   private CommentRepository commentRepository;

    @Override
    public Collection<Comment> getComments() {
        return commentRepository.findAll();
    }
}

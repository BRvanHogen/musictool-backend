package com.backend.eindopdracht.musictool.controller;


import com.backend.eindopdracht.musictool.model.Comment;
import com.backend.eindopdracht.musictool.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.backend.eindopdracht.musictool.repository.CommentRepository;


@RestController
@RequestMapping(value = "/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentRepository commentRepository;

    @GetMapping(value = "")
    public ResponseEntity<Object> getComments() {
        return ResponseEntity.ok().body(commentService.getComments());
    }

    @PostMapping(value = "")
    public ResponseEntity<Comment> create(@RequestBody Comment comment) {
        //moet er niet nog koppeling komen naar commentService met createComment(comment)?
        Comment commentSaved = commentRepository.save(comment);
        return ResponseEntity.status(HttpStatus.CREATED).body(commentSaved);
    }
}


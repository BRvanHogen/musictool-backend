package com.backend.eindopdracht.musictool.controller;


import com.backend.eindopdracht.musictool.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping(value = "")
    public ResponseEntity<Object> getComments() {
        return ResponseEntity.ok().body(commentService.getComments());
    }
}


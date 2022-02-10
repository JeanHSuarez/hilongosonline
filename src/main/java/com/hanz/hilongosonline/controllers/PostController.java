package com.hanz.hilongosonline.controllers;

import com.hanz.hilongosonline.models.Post;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "posts", produces = {APPLICATION_JSON_VALUE})
@Tag(name = "Post API", description = "CRUD operations for Posts")
public class PostController {

    @PostMapping("/")
    public void create (RequestBody requestBody) {
    }

    @GetMapping("/{postId}")
    public Post get (@PathVariable String postId) {
        String id = postId;
        Post post = new Post();
        return post;
    }

    @GetMapping("/")
    public List<Post> list() {
        List<Post> list = new ArrayList<>();
        return list;
    }

    @PutMapping("/{postId}")
    public void update (@PathVariable String postId) {
        String id = postId;
    }

    @DeleteMapping("/{postId}")
    public void delete(@PathVariable String postId) {
        String id = postId;
    }

}

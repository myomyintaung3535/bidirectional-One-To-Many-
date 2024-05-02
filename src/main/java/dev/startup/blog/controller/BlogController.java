package dev.startup.blog.controller;

import dev.startup.blog.entity.Blog;
import dev.startup.blog.entity.Owner;
import dev.startup.blog.service.BlogService;
import dev.startup.blog.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/blogs")
public class BlogController {

    private final BlogService blogService;
    private final OwnerService ownerService;

    public BlogController(BlogService blogService, OwnerService ownerService) {
        this.blogService = blogService;
        this.ownerService = ownerService;
    }

    @PostMapping("/{ownerId}/saveBlogs")
    public ResponseEntity<Blog> saveBlog(@PathVariable long ownerId, @RequestBody Blog blog){
        Owner owner =ownerService.findOwnerById(ownerId);
        blog.setOwner(owner);
        return new ResponseEntity<>(blogService.saveBlog(blog), HttpStatus.CREATED);
    }
}

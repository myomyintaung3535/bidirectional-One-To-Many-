package dev.startup.blog.controller;


import dev.startup.blog.entity.Owner;
import dev.startup.blog.service.BlogService;
import dev.startup.blog.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/owner")
public class OwnerController {

    private final  OwnerService ownerService;
    private final BlogService blogService;
    @Autowired
    public OwnerController(OwnerService ownerService, BlogService blogService) {
        this.ownerService = ownerService;
        this.blogService = blogService;
    }

    @PostMapping("/saveOwner")
    public ResponseEntity<Owner> saveOwner(@RequestBody Owner owner){
       return new ResponseEntity<>(ownerService.saveOwner(owner), HttpStatus.CREATED);
    }
}

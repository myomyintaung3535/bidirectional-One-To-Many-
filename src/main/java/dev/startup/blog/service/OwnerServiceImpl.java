package dev.startup.blog.service;

import dev.startup.blog.entity.Blog;
import dev.startup.blog.entity.Owner;
import dev.startup.blog.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService{

    private final OwnerRepository repo;

    public OwnerServiceImpl(OwnerRepository repo) {
        this.repo = repo;
    }

    @Override
    public Owner saveOwner(Owner owner) {
        Owner savedOwner = new Owner();
        savedOwner.setId(owner.getId());
        savedOwner.setName(owner.getName());
        savedOwner.setEmail(owner.getEmail());
        List<Blog> blogList = new ArrayList<>();
        for (Blog b : owner.getBlogList()){
            Blog blog = new Blog();
            blog.setId(b.getId());
            blog.setContent(b.getContent());
            blog.setTitle(b.getTitle());
            blog.setOwner(savedOwner);
            blogList.add(blog);
        }
        savedOwner.setBlogList(blogList);
        return repo.save(savedOwner);
    }

    @Override
    public Owner updateOwnerById(Owner owner, Long id) {
        return null;
    }

    @Override
    public Owner findOwnerById(Long id) {
        return null;
    }

    @Override
    public List<Owner> findAllOwner() {
        return null;
    }

    @Override
    public void deleteOwnerById(Long id) {

    }
}

package dev.startup.blog.service;

import dev.startup.blog.entity.Blog;
import dev.startup.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

    private final BlogRepository repo;

    @Autowired
    public BlogServiceImpl(BlogRepository repo) {
        this.repo = repo;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        Blog savedBlog = new Blog();
        savedBlog.setId(blog.getId());
        savedBlog.setTitle(blog.getTitle());
        savedBlog.setCategory(blog.getCategory());
        savedBlog.setContent(blog.getContent());
        savedBlog.setOwner(blog.getOwner());
        return repo.save(savedBlog);
    }

    @Override
    public Blog updateBlogById(Blog blog, Long id) {
        return null;
    }

    @Override
    public Blog findBlogById(Long id) {
        return null;
    }

    @Override
    public List<Blog> findAllBlog() {
        return null;
    }

    @Override
    public void deleteBlogById(Long id) {

    }
}

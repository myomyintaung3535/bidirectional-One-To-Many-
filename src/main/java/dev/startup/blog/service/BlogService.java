package dev.startup.blog.service;

import dev.startup.blog.entity.Blog;

import java.util.List;

public interface BlogService {

    Blog saveBlog(Blog blog);

    Blog updateBlogById(Blog blog, Long id);

    Blog findBlogById(Long id);

    List<Blog> findAllBlog();

    void deleteBlogById(Long id);


}

package dev.startup.blog.service;

import dev.startup.blog.entity.Blog;
import dev.startup.blog.entity.Owner;

import java.util.List;

public interface OwnerService {
    Owner saveOwner(Owner owner);

    Owner updateOwnerById(Owner owner, Long id);

    Owner findOwnerById(Long id);

    List<Owner> findAllOwner();

    void deleteOwnerById(Long id);
}

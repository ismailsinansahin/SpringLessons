package com.smlsnnshn.bootstrap;

import com.smlsnnshn.entity.Post;
import com.smlsnnshn.entity.Tag;
import com.smlsnnshn.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        Post post1 = new Post("ORM","ManyToMany");
        Post post2 = new Post("MVC","Controller");

        Tag tag1 = new Tag("Springboot");
        Tag tag2 = new Tag("JPA");

        post1.getTags().add(tag1);
        post1.getTags().add(tag2);

        tag1.getPosts().add(post1);
        tag2.getPosts().add(post1);

        tag1.getPosts().add(post2);
        post2.getTags().add(tag1);

        postRepository.save(post1);
        postRepository.save(post2);

    }

}

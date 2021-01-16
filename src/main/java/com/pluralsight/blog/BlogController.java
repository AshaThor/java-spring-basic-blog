package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {

    private PostRepository postRepository;

    @RequestMapping("/")
    public String listPosts(ModelMap mMap){
        List<Post> allPosts = postRepository.getAllPosts();
        mMap.put("posts", allPosts);
        return "home";
    }

    public void BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}

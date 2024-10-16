package exercise.controller.users;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@RequestMapping("/api")
public class PostsController {
    List<Post> posts = Data.getPosts();

    @GetMapping("/users/{id}/posts")
    public ResponseEntity<List<Post>> index(@PathVariable String id) {
        var result = posts.stream().filter(p -> id.equals(String.valueOf(p.getUserId()))).toList();

        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Post> create(@PathVariable String id, @RequestBody Post data) {
        var post = new Post();
        post.setUserId(Integer.parseInt(id));
        post.setBody(data.getBody());
        post.setTitle(data.getTitle());
        post.setSlug(data.getSlug());
        posts.add(post);

        return ResponseEntity.status(201).body(post);
    }
}
// END

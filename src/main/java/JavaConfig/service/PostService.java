package JavaConfig.service;

import JavaConfig.model.Post;
import org.springframework.stereotype.Service;
import JavaConfig.exception.NotFoundException;
import JavaConfig.repository.PostRepository;

import java.util.List;

public class PostService {
  private final PostRepository repository;

  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public List<Post> all() {
    return repository.all();
  }

  public Post getById(long id) {
    return repository.getById(id).orElseThrow(NotFoundException::new);
  }

  public Post save(Post post) {
    return repository.save(post);
  }

  public void removeById(long id) {
    repository.removeById(id);
  }
}


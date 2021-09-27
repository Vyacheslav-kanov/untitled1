package JavaConfig.servlet;


import JavaConfig.controller.PostController;
import JavaConfig.repository.PostRepository;
import JavaConfig.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public PostController postController(){
        return new PostController(postService());
    }

    @Bean
    public PostService postService(){
        return new PostService(repository());
    }

    @Bean
    public PostRepository repository(){
        return new PostRepository();
    }
}

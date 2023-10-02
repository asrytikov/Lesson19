package org.example.config;

import org.example.proxies.CommentNotificationProxy;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.example.repositories.DbCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.proxies", "org.example.repositories", "org.example.services"})
public class ProjectConfiguration {

    /*@Bean
    public CommentRepository commentRepository(){
        return new DbCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy(){
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy){
        return new CommentService(commentRepository, commentNotificationProxy);
    }
*/

}

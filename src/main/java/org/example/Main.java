package org.example;

import org.example.config.ProjectConfiguration;
import org.example.models.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.DbCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        /*var commentRepository = new DbCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);*/

        var comment = new Comment();
        comment.setAuthor("Alex");
        comment.setText("Hello all!");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);


    }
}
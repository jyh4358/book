package com.book.web.dto;

import com.book.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

//    @Builder
//    public PostsResponseDto(Long id, String title, String content, String author) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.author = author;
//    }

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}

package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Post toEntity(){
        return Post.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}

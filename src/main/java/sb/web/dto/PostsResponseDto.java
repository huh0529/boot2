package sb.web.dto;

import lombok.Getter;
import sb.domain.posts.Posts;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) { //Posts 형태의 entity 를 받아서 PostsResponseDto 의 값에 각각 넣어준다
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
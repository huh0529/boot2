package sb.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sb.domain.BaseTimeEntity;

import javax.persistence.*;

@Getter //클래스 내 모든 필드의 Getter 메소드 자동생성
@NoArgsConstructor  //
@Entity //테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id //해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙. 기본값 - AUTO, 자동증가하는 정수형 값 but 스프링부트 2.0 에선 옵션 추가해야 auto_increment됨
    private Long id;

    @Column(length = 500, nullable = false) //생략해도 OK 기본값 외에 추가로 변경 필요한 옵션 있을 때 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

package sb.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //get 메소드 생성
@RequiredArgsConstructor    //모든 final 필드 생성자를 생성해줌
public class HelloResponseDto {

    private final String name;
    private final int amount;

}


package kr.megaptera.assignment.dtos.comments;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentReadDto {
    private String id;
    private String author;
    private String content;
}

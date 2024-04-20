package org.example.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StoryDTO {
    private final Long id;
    private final String story;
}

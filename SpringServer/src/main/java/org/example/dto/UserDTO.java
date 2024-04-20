package org.example.dto;

import lombok.Builder;
import lombok.Data;
import org.example.entity.Story;

import java.util.List;

@Builder
@Data
public class UserDTO {

    private final Long id;
    private final String login;
    private final String password;
    private final String AwatarURL;
    private final List<Long> storyIds;


}

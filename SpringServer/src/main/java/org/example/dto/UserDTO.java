package org.example.dto;

import lombok.Data;
import org.example.entity.Story;

@Data
public class UserDTO {

    private Long id;
    private String login;
    private String password;
    private String AwatarURL;
    private Long storyId;
    private Story story;
}

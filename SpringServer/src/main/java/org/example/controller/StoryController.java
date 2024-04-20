package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.dto.StoryDTO;
import org.example.dto.UserDTO;
import org.example.entity.Story;
import org.example.entity.User;
import org.example.service.StoriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stories")
@AllArgsConstructor
public class StoryController {

    private final StoriesService storiesService;

    @PostMapping
    public ResponseEntity<Story> create(@RequestBody StoryDTO dto) {
        return mappingResponseStory(storiesService.create(dto));
    }

    private ResponseEntity<Story> mappingResponseStory(Story story) {
        return new ResponseEntity<>(story, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Story>> readAll() {
        return new ResponseEntity<>(storiesService.readAll(), HttpStatus.OK);
    }
}

package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.entity.Story;
import org.example.service.StoriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stories")
@AllArgsConstructor
public class StoryController {

    private final StoriesService storiesService;

    @GetMapping
    public ResponseEntity<List<Story>> readAll() {
        return new ResponseEntity<>(storiesService.readAll(), HttpStatus.OK);
    }
}

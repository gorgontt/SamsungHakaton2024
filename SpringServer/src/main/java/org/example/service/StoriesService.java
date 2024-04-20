package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entity.Story;
import org.example.repository.StoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StoriesService {

    private final StoryRepository storyRepository;

    public List<Story> readAll() {
        return storyRepository.findAll();
    }

    public Story readById(Long id) {
        return storyRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Story not found - " + id));
    }
}

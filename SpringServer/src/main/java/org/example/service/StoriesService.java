package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.StoryDTO;
import org.example.dto.UserDTO;
import org.example.entity.Story;
import org.example.entity.User;
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

    public Story create(StoryDTO dto) {
        return storyRepository.save(Story.builder()
                .id(dto.getId())
                .story(dto.getStory())
                .build());
    }
}

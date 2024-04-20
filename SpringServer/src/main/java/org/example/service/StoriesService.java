package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.StoryDTO;
import org.example.dto.UserDTO;
import org.example.entity.Story;
import org.example.entity.User;
import org.example.repository.StoryRepository;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StoriesService {

    private final StoryRepository storyRepository;
    private final UserService userService;

    public List<Story> readAll() {
        return storyRepository.findAll();
    }

    public Story readById(Long id) {
        return storyRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Story not found - " + id));
    }
    public Story create(StoryDTO dto, long userId) {
        Story oldStory = new Story(dto.getId(), dto.getStory());
        Story newStory = storyRepository.save(oldStory);
        User user = userService.readById(userId);
        List<Story> stories = user.getStory();
        stories.add(newStory);
        user.setStory(stories);
        System.out.println("=============" + newStory.toString() + "\n =============== " + user.toString());
        userService.update(user);
        return newStory;
    }
}

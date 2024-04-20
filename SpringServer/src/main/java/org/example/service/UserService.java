package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.UserDTO;
import org.example.entity.Story;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final StoriesService storiesService;

    public User create(UserDTO dto) {
        return userRepository.save(User.builder()
                .login(dto.getLogin())
                .password(dto.getPassword())
                .AwatarURL(dto.getAwatarURL())
                .story(dto.getStory())
                .build());
    }

    public List<User> readAll() {
        return userRepository.findAll();
    }

    public List<User> readByStoryId(Long id) {
        return userRepository.findByStoryId(id);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}

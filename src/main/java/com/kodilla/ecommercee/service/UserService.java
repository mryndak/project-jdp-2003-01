package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.domain.EntityNotFoundException;
import com.kodilla.ecommercee.domain.User;
import com.kodilla.ecommercee.domain.UserDto;
import com.kodilla.ecommercee.mapper.UserMapper;
import com.kodilla.ecommercee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;


    public List<UserDto> getUsers() {
        return userMapper.mapToUserDtoList(userRepository.findAll());
    }

    public Optional<User> getUser(final Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(final User user) {
        return userRepository.save(user);
    }

    public void deleteUser(final Long id) {
        userRepository.deleteById(id);
    }

    public UserDto createUser(UserDto userDto) {
        User user = User.builder()
                .id(userDto.getId())
                .addressId(userDto.getAddressId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .login(userDto.getLogin())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .build();
        return userMapper.mapToUserDto(userRepository.save(user));
    }

    public UserDto updateUser(UserDto userDto) {
        userRepository.findById(userDto.getId()).orElseThrow(() -> new EntityNotFoundException(User.class, userDto.getId()));
        return userMapper.mapToUserDto(userRepository.save(userMapper.mapToUser(userDto)));
    }
}

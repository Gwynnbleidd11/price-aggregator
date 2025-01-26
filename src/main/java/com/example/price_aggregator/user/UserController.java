package com.example.price_aggregator.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Void> createAdminUser(@RequestBody UserDto userDto) {
//        User user = userMapper.mapToUser(userDto);
//        user.setCreationDate(LocalDate.now());
//        userService.saveUser(user);
//        return ResponseEntity.ok().build();
//    }

//    @Secured("ROLA_ADMIN")
    @GetMapping(value = "{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable UUID userId) throws UserNotFoundException {
        return ResponseEntity.ok(userMapper.mapToUserDto(userService.getUser(userId)));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<User> usersList = userService.getAllUsers();
        return ResponseEntity.ok(userMapper.mapToUserDtoList(usersList));
    }

    @PutMapping
    public ResponseEntity<UserDto> changeUser(@RequestBody UserDto userDto) {
        User user = userMapper.mapToUser(userDto);
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(userMapper.mapToUserDto(savedUser));
    }

    @DeleteMapping(value = "{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
}

package com.jwtsecurity.controller;


import com.jwtsecurity.comman.Apis;
import com.jwtsecurity.dto.UserDto;
import com.jwtsecurity.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = Apis.CREATE_USER, method = RequestMethod.POST)
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok(userDto);
    }

    @RequestMapping(value = Apis.UPDATE_USER, method = RequestMethod.PUT)
    public ResponseEntity<UserDto> update(@PathVariable Long id, @RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok(userDto);
    }

    @RequestMapping(value = Apis.GET_USER, method = RequestMethod.GET)
    public ResponseEntity<UserDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value = Apis.DELETE_USER, method = RequestMethod.DELETE)
    public ResponseEntity<UserDto> delete(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }
}

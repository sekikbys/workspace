package com.demo01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
//    @GetMapping("/login/{user}/{psw}")
//    public String test04(@PathVariable String user,@PathVariable String psw) {
//        return "login!"+user+" "+psw;
//    }
//    @GetMapping(path = "user/{id}")
//    public User getUser(@PathVariable String id) {
//        return new User(id, "ichiro");
//    }
//
//    @GetMapping(path = "users")
//    public List<User> getUsers() {
//        return new ArrayList<User>() {
//            {
//                add(new User("001", "ichiro"));
//                add(new User("002", "jiro"));
//                add(new User("003", "saburo"));
//            }
//        };
//    }
//
//    @PostMapping(path = "user")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void createUser(final @Valid @RequestBody User user, final BindingResult bindingResult) {
//    }
//
//    @PutMapping(path = "user/{id}")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void updateUser(@PathVariable String id, @Valid @RequestBody User user,
//                           final BindingResult bindingResult) {
//    }

    @DeleteMapping(path = "user/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String id) {
    }
}
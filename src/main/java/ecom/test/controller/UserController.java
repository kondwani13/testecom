package ecom.test.controller;

import ecom.test.dto.ResponseDto;
import ecom.test.dto.user.SignInDto;
import ecom.test.dto.user.SignInResponseDto;
import ecom.test.dto.user.SignupDto;
import ecom.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signin")
    public SignInResponseDto signin(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }
}

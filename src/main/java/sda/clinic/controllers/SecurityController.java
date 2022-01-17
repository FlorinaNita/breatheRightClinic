package sda.clinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import sda.clinic.entities.AuthorityEntity;
import sda.clinic.entities.UserEntity;
import sda.clinic.repositories.AuthorityRepository;
import sda.clinic.repositories.UserRepository;
import sda.models.SignupModel;

@Controller
public class SecurityController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @GetMapping("/login")
    public ModelAndView getLogin() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping("/signup")
    public ModelAndView getSignup() {
        ModelAndView modelAndView = new ModelAndView("signup");
        modelAndView.addObject("signup", new SignupModel());
        return modelAndView;
    }

    @PostMapping("/signup")
    public ModelAndView signupUser(@ModelAttribute("signup") SignupModel signupModel) {
        ModelAndView modelAndView = new ModelAndView("redirect:/login");
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(signupModel.getEmail());
        userEntity.setUsername(signupModel.getUsername());
        userEntity.setPassword(passwordEncoder.encode(signupModel.getPassword()));
        userEntity.setGender(signupModel.getGender());
        userEntity.setEnabled(true);
        userRepository.save(userEntity);
        AuthorityEntity authorityEntity = new AuthorityEntity();
        authorityEntity.setUsername(signupModel.getUsername());
        authorityEntity.setAuthority("user");
        authorityRepository.save(authorityEntity);
        return modelAndView;
    }
}

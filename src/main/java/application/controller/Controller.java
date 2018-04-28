package application.controller;


import application.model.Users;
import application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@org.springframework.stereotype.Controller
@RestController
public class Controller {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/")
    public List<Users> getIndex(ModelMap model) {
        String title = "Inicio";
        model.addAttribute("title",title);
        return userRepository.findAll();
       // return "index";
    }
    @RequestMapping(value="/mantenimiento")
    public String mantenimiento(ModelMap model){

        String title = "Mantenimiento";
        model.addAttribute("title",title);
        return "mantenimiento";
    }

    @RequestMapping(value="/reservacion")
    public String reservacion(){
        return "reservacion";
    }
    @RequestMapping(value="/control")
    public String control(){
        return "control";
    }

    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value="/reservaciones")
    public String reservaciones(){
        return "reservaciones";
    }
}

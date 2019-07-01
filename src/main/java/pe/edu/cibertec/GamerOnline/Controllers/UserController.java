package pe.edu.cibertec.GamerOnline.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.GamerOnline.Models.User;
import pe.edu.cibertec.GamerOnline.Service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value="/user")
    public String RetriveAll(Model model) {
        model.addAttribute("users",userService.listAllUsers());
        return "user/list";
    }

    @GetMapping(value="/user/delete/{idUser}")
    public String delete(Model model, @PathVariable("idUser") Integer idUser) {
        userService.deleteUser(idUser);
        return "redirect:/user";
    }

    @GetMapping(value="/user/edit/{idUser}")
    public String edit(Model model, @PathVariable("idUser") Integer idUser) {
        User user = userService.listOneUser(idUser);
        model.addAttribute("user", user);
        return "user/edit";
    }

    @GetMapping(value="/user/create")
    public String Crear(Model model) {
        model.addAttribute("user", new User());
        return "user/create";
    }

    @PostMapping(value="/user/update")
    public String update(User user) {

        userService.saveUser(user);

        return "redirect:/user";
    }

    @PostMapping(value = "/user/save")
    public String guardar(Model model, User user) {

        userService.saveUser(user);

        return "redirect:/user";
    }
}

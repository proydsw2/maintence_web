package pe.edu.cibertec.GamerOnline.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.GamerOnline.Models.Role;
import pe.edu.cibertec.GamerOnline.Service.RoleService;

@Controller
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping(value="/role")
    public String RetriveAll(Model model) {
        model.addAttribute("roles",roleService.listAllRoles());
        return "role/list";
    }

    @GetMapping(value="/role/delete/{idRole}")
    public String delete(Model model, @PathVariable("idRole") Integer idRole) {
        roleService.deleteRole(idRole);
        return "redirect:/role";
    }

    @GetMapping(value="/role/edit/{idRole}")
    public String edit(Model model, @PathVariable("idRole") Integer idRole) {
        Role role = roleService.listOneRole(idRole);
        model.addAttribute("role", role);
        return "role/edit";
    }

    @GetMapping(value="/role/create")
    public String Crear(Model model) {
        model.addAttribute("role", new Role());
        return "role/create";
    }

    @PostMapping(value="/role/update")
    public String update(Role role) {

        roleService.saveRole(role);

        return "redirect:/role";
    }

    @PostMapping(value = "/role/save")
    public String guardar(Model model, Role role) {

        roleService.saveRole(role);

        return "redirect:/role";
    }

}

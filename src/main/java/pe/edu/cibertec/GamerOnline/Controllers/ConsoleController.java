package pe.edu.cibertec.GamerOnline.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.GamerOnline.Models.Console;
import pe.edu.cibertec.GamerOnline.Service.ConsoleService;

@Controller
public class ConsoleController {

    @Autowired
    ConsoleService consoleService;

    @GetMapping(value="/console")
    public String RetriveAll(Model model) {
        model.addAttribute("consoles",consoleService.listAllConsoles());
        return "console/list";
    }

    @GetMapping(value="/console/delete/{idConsole}")
    public String delete(Model model, @PathVariable("idConsole") Integer idConsole) {
        consoleService.deleteConsole(idConsole);
        return "redirect:/console";
    }

    @GetMapping(value="/console/edit/{idConsole}")
    public String edit(Model model, @PathVariable("idConsole") Integer idConsole) {
        Console console = consoleService.listOneConsole(idConsole);
        model.addAttribute("console", console);
        return "console/edit";
    }

    @GetMapping(value="/console/create")
    public String Crear(Model model) {
        model.addAttribute("console", new Console());
        return "console/create";
    }

    @PostMapping(value="/console/update")
    public String update(Console console) {

        consoleService.saveConsole(console);

        return "redirect:/console";
    }

    @PostMapping(value = "/console/save")
    public String guardar(Model model, Console console) {

        consoleService.saveConsole(console);

        return "redirect:/console";
    }
}

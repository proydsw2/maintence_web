package pe.edu.cibertec.GamerOnline.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.GamerOnline.Models.Category;
import pe.edu.cibertec.GamerOnline.Service.CategoryService;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value="/category")
    public String RetriveAll(Model model) {
        model.addAttribute("categories",categoryService.listAllCategories());
        return "category/list";
    }

    @GetMapping(value="/category/delete/{idCategory}")
    public String delete(Model model, @PathVariable("idCategory") Integer idCategory) {
        categoryService.deleteCategory(idCategory);
        return "redirect:/category";
    }

    @GetMapping(value="/category/edit/{idCategory}")
    public String edit(Model model, @PathVariable("idCategory") Integer idCategory) {
        Category category = categoryService.listOneCategory(idCategory);
        model.addAttribute("category", category);
        return "category/edit";
    }

    @GetMapping(value="/category/create")
    public String Crear(Model model) {
        model.addAttribute("category", new Category());
        return "category/create";
    }

    @PostMapping(value="/category/update")
    public String update(Category category) {

        categoryService.saveCategory(category);

        return "redirect:/category";
    }

    @PostMapping(value = "/category/save")
    public String guardar(Model model, Category category) {

        categoryService.saveCategory(category);

        return "redirect:/category";
    }
}

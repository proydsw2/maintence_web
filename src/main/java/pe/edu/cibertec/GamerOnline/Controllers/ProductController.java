package pe.edu.cibertec.GamerOnline.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.GamerOnline.Models.Product;
import pe.edu.cibertec.GamerOnline.Service.ProductService;


@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value="/product")
    public String RetriveAll(Model model) {
        model.addAttribute("products",productService.listAllProducts());
        return "product/list";
    }

    @GetMapping(value="/product/delete/{idProduct}")
    public String delete(Model model, @PathVariable("idProduct") Integer idProduct) {
        productService.deleteProduct(idProduct);
        return "redirect:/product";
    }

    @GetMapping(value="/product/edit/{idProduct}")
    public String edit(Model model, @PathVariable("idProduct") Integer idProduct) {
        Product product = productService.listOneProduct(idProduct);
        model.addAttribute("product", product);
        return "product/edit";
    }

    @GetMapping(value="/product/create")
    public String Crear(Model model) {
        model.addAttribute("product", new Product());
        return "product/create";
    }

    @PostMapping(value="/product/update")
    public String update(Product product) {

        productService.saveProduct(product);

        return "redirect:/product";
    }

    @PostMapping(value = "/product/save")
    public String guardar(Model model, Product product) {

        productService.saveProduct(product);

        return "redirect:/product";
    }

}

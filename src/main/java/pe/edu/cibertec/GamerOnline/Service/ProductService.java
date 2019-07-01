package pe.edu.cibertec.GamerOnline.Service;

import pe.edu.cibertec.GamerOnline.Models.Product;
import java.util.List;

public interface ProductService {
    public List<Product> listAllProducts();

    public Product listOneProduct(Integer idProduct);

    public Product saveProduct(Product product);

    public void deleteProduct(Integer idProduct);
}

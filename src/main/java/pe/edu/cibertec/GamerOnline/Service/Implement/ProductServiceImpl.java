package pe.edu.cibertec.GamerOnline.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.GamerOnline.Models.Product;
import pe.edu.cibertec.GamerOnline.Repository.ProductRepository;
import pe.edu.cibertec.GamerOnline.Service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product listOneProduct(Integer idProduct) {
        return productRepository.findById(idProduct).get();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer idProduct) {
        productRepository.deleteById(idProduct);
    }
}

package pe.edu.cibertec.GamerOnline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.GamerOnline.Models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

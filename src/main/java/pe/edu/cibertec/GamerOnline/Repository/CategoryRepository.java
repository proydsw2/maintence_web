package pe.edu.cibertec.GamerOnline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.GamerOnline.Models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

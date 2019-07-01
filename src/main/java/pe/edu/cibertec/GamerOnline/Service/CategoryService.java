package pe.edu.cibertec.GamerOnline.Service;

import pe.edu.cibertec.GamerOnline.Models.Category;
import java.util.List;

public interface CategoryService {

    public List<Category> listAllCategories();

    public Category listOneCategory(Integer idCategory);

    public Category saveCategory(Category category);

    public void deleteCategory(Integer idCategory);
}

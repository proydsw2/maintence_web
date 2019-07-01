package pe.edu.cibertec.GamerOnline.Service.Implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.GamerOnline.Models.Category;
import pe.edu.cibertec.GamerOnline.Repository.CategoryRepository;
import pe.edu.cibertec.GamerOnline.Service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> listAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category listOneCategory(Integer idCategory) {
        return categoryRepository.findById(idCategory).get();
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Integer idCategory) {
        categoryRepository.deleteById(idCategory);
    }
}

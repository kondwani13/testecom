package ecom.test.service;

import ecom.test.model.Category;
import ecom.test.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public void createCategory(Category category){
        categoryRepository.save(category);
    }
    public List<Category> listCategory(){
        return categoryRepository.findAll();
    }
    public void editCategory(int categoryId, Category updateCategory) {
        Category category = categoryRepository.getById(categoryId);
        category.setCategoryName(updateCategory.getCategoryName());
        category.setDescription(updateCategory.getDescription());
        category.setImageUrl(updateCategory.getImageUrl());
        categoryRepository.save(category);
    }
    public Boolean findById(int categoryId) {
        return categoryRepository.findById(categoryId).isPresent();
    }


}


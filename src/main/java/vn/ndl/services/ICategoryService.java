package vn.ndl.services;

import java.util.List;

import vn.ndl.models.CategoryModel;

public interface ICategoryService {

	List<CategoryModel> findAll();

	CategoryModel findById(int categoryid);

	void insert(CategoryModel category);

	void update(CategoryModel category);

	void delete(int categoryid);

	List<CategoryModel> findByName(String keyword);

}

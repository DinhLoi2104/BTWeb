package vn.ndl.daos;

import java.util.List;

import vn.ndl.models.CategoryModel;

public interface ICategoryDao {

	List<CategoryModel> findAll();

	CategoryModel findById(int categoryid);

	void insert(CategoryModel category);

	void update(CategoryModel category);

	void delete(int categoryid);

	List<CategoryModel> findByName(String keyword);
	

}

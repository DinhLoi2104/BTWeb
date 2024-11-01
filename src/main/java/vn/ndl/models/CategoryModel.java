package vn.ndl.models;

import java.io.Serializable;

public class CategoryModel implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	private int categoryid;
	private String categoryname;
	private String images;
	private int status;

	public CategoryModel() {
		super();
	}

	public CategoryModel(int categoryid, String categoryname, String images, int status) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.images = images;
		this.status = status;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}

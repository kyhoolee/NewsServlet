package org.ideamining.minzbox.api;

import java.util.ArrayList;
import java.util.List;

public class Category {

	private String name;
	private String id;
	private List<Category> superCategoryList;
	private List<Category> supCategoryList;
	
	public Category(){
		superCategoryList = new ArrayList<Category>();
		supCategoryList = new ArrayList<Category>();
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSuperCategoryList(List<Category> superCategoryList){
		this.superCategoryList = superCategoryList;
	}
	
	public void setSubCategoryList(List<Category> subCategoryList){
		this.superCategoryList = subCategoryList;
	}
	
	public List<Category> getSuperCategoryList(){
		return superCategoryList;
	}

	public List<Category> getSupCategoryList() {
		return supCategoryList;
	}
	
}

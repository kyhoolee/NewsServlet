package com.minzbox.base.transform;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
	private String content;
	private List<Image> images;
	
	public Paragraph(){
		this.content = "";
		this.images = new ArrayList<Image>();
	}
	
	public Paragraph(String content, List<Image> images){
		this.images = images;
		this.content = content;
	}
	
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	

}

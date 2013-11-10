package com.minzbox.base.transform;

public class Image {
	private String descript;
	private String link;
	
	public Image(){
		this.descript = "";
		this.link = "";
	}
	
	public Image(String descript, String link){
		this.descript = descript;
		this.link = link;
	}
	
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}

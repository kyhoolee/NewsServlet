package com.minzbox.base.transform;

import java.util.ArrayList;
import java.util.List;

import com.minzbox.base.entities.Information;

public class ReturnedNews {
	String ID;
    String URL;
    String abstractContent;
    
    List<Paragraph> newsContent;
    
    String title;
    String siteID;
    String pubDate;
    String crawlDate;
    
    
    public ReturnedNews(Information info){
    	this.ID = info.getID();
    	this.URL = info.getURL();
    	this.abstractContent = info.getAbstractContent();
    	this.title = info.getTitle();
    	this.siteID = info.getSiteID();
    	this.pubDate = info.getPubDate();
    	this.crawlDate = info.getCrawlDate();
    	
    	this.newsContent = new ArrayList<Paragraph>();
    }
    
    public List<Paragraph> getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(List<Paragraph> newsContent) {
		this.newsContent = newsContent;
	}
	
    
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getAbstractContent() {
		return abstractContent;
	}
	public void setAbstractContent(String abstractContent) {
		this.abstractContent = abstractContent;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSiteID() {
		return siteID;
	}
	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getCrawlDate() {
		return crawlDate;
	}
	public void setCrawlDate(String crawlDate) {
		this.crawlDate = crawlDate;
	}

}

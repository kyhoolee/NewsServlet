package org.ideamining.minzbox.api;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.minzbox.base.entities.Tag;
import com.minzbox.news.News;

@WebService
public class API {

	@WebMethod
	@WebResult(name="informationList")
	public List<Information> getInformationList(Option option){
		List<Information> infoList = new ArrayList<Information>();
		Information info = new Information();
		switch (option.getType()) {
		case Option.INFORMATION_BY_ALL:
			info.setTitle("this is news");
			info.setId(UUID.randomUUID().toString());
			info.setContent("congnh've coded everything");
			infoList.add(info);
			break;
		case Option.INFORMATION_BY_CATEGORY:
			info.setTitle("this is news");
			info.setId(UUID.randomUUID().toString());
			info.setContent("congnh've coded all of this category");
			infoList.add(info);
			break;
		case Option.INFORMATION_BY_PUBDATE:
			info.setTitle("this is news");
			info.setId(UUID.randomUUID().toString());
			info.setContent("congnh've coded today");
			infoList.add(info);
			break;
		case Option.INFORMATION_BY_TAG:
			info.setTitle("this is news");
			info.setId(UUID.randomUUID().toString());
			info.setContent("congnh've coded with kylh");
			infoList.add(info);
			break;
		case Option.INFORMATION_BY_TIME_INTERVAL:
			info.setTitle("this is news");
			info.setId(UUID.randomUUID().toString());
			info.setContent("congnh've coded from 4PM to 9PM");
			infoList.add(info);
			break;
		default:
			break;
		}
		return infoList;
	}
	
	@WebMethod
	public List<Tag> getNewsTagList(){
    List<Tag> listTag = new ArrayList<Tag>();
    return listTag;
	}
	
	@WebMethod
	public List<News> getInformationByID(String id){
		throw new UnsupportedOperationException();
	}
	
	@WebMethod
	public List<News> getInformationBySiteID(String siteID){
		throw new UnsupportedOperationException();
	}
	
	@WebMethod
	public List<News> getInformationByPubDate(Date pubdate){
		throw new UnsupportedOperationException();
	}
	
	@WebMethod
	public News getInformationByURL(URL url){
		throw new UnsupportedOperationException();
	}
	
	@WebMethod
	public List<News> getInformationByApproximateTitle(String title){
		throw new UnsupportedOperationException();
	}
	
	@WebMethod
	public List<News> getInformationByApproximateAbstract(String abstr){
		throw new UnsupportedOperationException();
	}
	
	@WebMethod
	public List<News> getInformationByApproximateContent(String content){
		throw new UnsupportedOperationException();
	}
}

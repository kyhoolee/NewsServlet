/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minzbox.base.entities;



/**
 *
 * @author kylee
 */
public class Information {
    String ID;
    String URL;
    String abstractContent;
    String rawContent;
    String title;
    String siteID;
    String pubDate;
    String crawlDate;

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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAbstractContent() {
        return abstractContent;
    }

    public void setAbstractContent(String abstractContent) {
        this.abstractContent = abstractContent;
    }

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
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


    
}

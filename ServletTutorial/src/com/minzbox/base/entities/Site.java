/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minzbox.base.entities;

/**
 *
 * @author kylee
 */
public class Site {
    String ID;
    String name;
    String URL;
    String abstractContent;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

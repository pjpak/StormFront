package com.DFM.StormFront.Model.Normalize;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

public class Image implements Serializable {
    private static final long serialVersionUID = -5913957382972359157L;
    private String source;
    private String guid;
    private String name;
    private String caption;
    private String credit;
    private String mimetype;
    private String title;
    private String filesize;
    private String height;
    private String width;

    public String getSource() {
        return source;
    }

    @XmlElement(name = "source")
    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    @XmlElement(name = "caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCredit() {
        return credit;
    }

    @XmlElement(name = "credit")
    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getMimetype() {
        return mimetype;
    }

    @XmlElement(name = "mime-type")
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGuid() {
        return guid;
    }

    @XmlElement(name = "guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getFilesize() {
        return filesize;
    }

    @XmlElement(name = "filesize")
    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getHeight() {
        return height;
    }

    @XmlElement(name = "height")
    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    @XmlElement(name = "width")
    public void setWidth(String width) {
        this.width = width;
    }
}

package com.gmail.klewzow.Exceptions.model;

import org.springframework.stereotype.Component;

@Component
public class WorkExampleModel {

    private String linkDemoProject;
    private String linkCodeProject;
    private String titleProject;
    private String subTitleProject;

    private String imaging;


    public WorkExampleModel() {
    }

    public String getLinkDemoProject() {
        return linkDemoProject;
    }

    public void setLinkDemoProject(String linkDemoProject) {
        this.linkDemoProject = linkDemoProject;
    }

    public String getLinkCodeProject() {
        return linkCodeProject;
    }

    public void setLinkCodeProject(String linkCodeProject) {
        this.linkCodeProject = linkCodeProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getSubTitleProject() {
        return subTitleProject;
    }

    public void setSubTitleProject(String subTitleProject) {
        this.subTitleProject = subTitleProject;
    }

    public String getImaging() {
        return imaging;
    }

    public void setImaging(String imaging) {
        this.imaging = imaging;
    }

    @Override
    public String toString() {
        return "WorkExample{" +
                ", linkDemoProject='" + linkDemoProject + '\'' +
                ", linkCodeProject='" + linkCodeProject + '\'' +
                ", titleProject='" + titleProject + '\'' +
                ", subTitleProject='" + subTitleProject + '\'' +
                '}';
    }


}

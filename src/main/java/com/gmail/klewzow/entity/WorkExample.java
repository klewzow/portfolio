package com.gmail.klewzow.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "work_example")
public class WorkExample extends BaseIdEntity {

    @Column(name = "demo")
    private String linkDemoProject;
    @NotNull(message = "Поле не должно быть пустым")
    @Size(min = 5, max = 100, message = "Слишком короткое название. Не меньше 5 символов")
    @Column(name = "code")
    private String linkCodeProject;
    @NotNull(message = "Поле не должно быть пустым")
    @Size(min = 5, max = 100, message = "Слишком короткое название. Не меньше 5 символов")
    @Column(name = "title", nullable = false, length = 50)
    private String titleProject;

    @NotNull(message = "Поле не должно быть пустым")
    @Size(min = 5, max = 100, message = "Слишком короткое название. Не меньше 5 символов")
    @Column(name = "sub_title", nullable = false, length = 50)
    private String subTitleProject;

    @Transient
    transient MultipartFile file;

    @Column(name = "img")
    private String fileName;

    @NotNull(message = "Поле не должно быть пустым")
    @Enumerated(EnumType.STRING)
    @Column(name = "lang", nullable = false, length = 10)
    private Language language;

    public WorkExample() {

    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "WorkExample{" + "linkDemoProject='" + linkDemoProject + '\'' + ", linkCodeProject='" + linkCodeProject + '\'' + ", titleProject='" + titleProject + '\'' + ", subTitleProject='" + subTitleProject + '\'' + ", file=" + file + ", fileName='" + fileName + '\'' + ", language=" + language + '}';
    }
}

/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.onenote.api;

/**
 * The type Notebook.
*/
public class Notebook extends ODataBaseEntity {

    public Notebook(){
        setODataType("#Microsoft.OneNote.Api.Notebook");
    }
            
    private Boolean isDefault;
     
    /**
    * Gets the is Default.
    *
    * @return the Boolean
    */
    public Boolean getisDefault() {
        return this.isDefault; 
    }

    /**
    * Sets the is Default.
    *
    * @param value the Boolean
    */
    public void setisDefault(Boolean value) { 
        this.isDefault = value; 
    }
            
    private UserRole userRole;
     
    /**
    * Gets the user Role.
    *
    * @return the UserRole
    */
    public UserRole getuserRole() {
        return this.userRole; 
    }

    /**
    * Sets the user Role.
    *
    * @param value the UserRole
    */
    public void setuserRole(UserRole value) { 
        this.userRole = value; 
    }
            
    private Boolean isShared;
     
    /**
    * Gets the is Shared.
    *
    * @return the Boolean
    */
    public Boolean getisShared() {
        return this.isShared; 
    }

    /**
    * Sets the is Shared.
    *
    * @param value the Boolean
    */
    public void setisShared(Boolean value) { 
        this.isShared = value; 
    }
            
    private String sectionsUrl;
     
    /**
    * Gets the sections Url.
    *
    * @return the String
    */
    public String getsectionsUrl() {
        return this.sectionsUrl; 
    }

    /**
    * Sets the sections Url.
    *
    * @param value the String
    */
    public void setsectionsUrl(String value) { 
        this.sectionsUrl = value; 
    }
            
    private String sectionGroupsUrl;
     
    /**
    * Gets the section Groups Url.
    *
    * @return the String
    */
    public String getsectionGroupsUrl() {
        return this.sectionGroupsUrl; 
    }

    /**
    * Sets the section Groups Url.
    *
    * @param value the String
    */
    public void setsectionGroupsUrl(String value) { 
        this.sectionGroupsUrl = value; 
    }
            
    private NotebookLinks links;
     
    /**
    * Gets the links.
    *
    * @return the NotebookLinks
    */
    public NotebookLinks getlinks() {
        return this.links; 
    }

    /**
    * Sets the links.
    *
    * @param value the NotebookLinks
    */
    public void setlinks(NotebookLinks value) { 
        this.links = value; 
    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getname() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setname(String value) { 
        this.name = value; 
    }
            
    private String createdBy;
     
    /**
    * Gets the created By.
    *
    * @return the String
    */
    public String getcreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the String
    */
    public void setcreatedBy(String value) { 
        this.createdBy = value; 
    }
            
    private String lastModifiedBy;
     
    /**
    * Gets the last Modified By.
    *
    * @return the String
    */
    public String getlastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the String
    */
    public void setlastModifiedBy(String value) { 
        this.lastModifiedBy = value; 
    }
            
    private java.util.Calendar lastModifiedTime;
     
    /**
    * Gets the last Modified Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getlastModifiedTime() {
        return this.lastModifiedTime; 
    }

    /**
    * Sets the last Modified Time.
    *
    * @param value the java.util.Calendar
    */
    public void setlastModifiedTime(java.util.Calendar value) { 
        this.lastModifiedTime = value; 
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
    }
            
    private String self;
     
    /**
    * Gets the self.
    *
    * @return the String
    */
    public String getself() {
        return this.self; 
    }

    /**
    * Sets the self.
    *
    * @param value the String
    */
    public void setself(String value) { 
        this.self = value; 
    }
            
    private java.util.Calendar createdTime;
     
    /**
    * Gets the created Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getcreatedTime() {
        return this.createdTime; 
    }

    /**
    * Sets the created Time.
    *
    * @param value the java.util.Calendar
    */
    public void setcreatedTime(java.util.Calendar value) { 
        this.createdTime = value; 
    }
    
    
    private java.util.List<Section> sections = new java.util.ArrayList<Section>();
    
    
     
    /**
    * Gets the sections.
    *
    * @return the java.util.List<Section>
    */
    public java.util.List<Section> getsections() {
        return this.sections; 
    }

    /**
    * Sets the sections.
    *
    * @param value the java.util.List<Section>
    */
    public void setsections(java.util.List<Section> value) { 
        this.sections = value; 
    }
    
    
    private java.util.List<SectionGroup> sectionGroups = new java.util.ArrayList<SectionGroup>();
    
    
     
    /**
    * Gets the section Groups.
    *
    * @return the java.util.List<SectionGroup>
    */
    public java.util.List<SectionGroup> getsectionGroups() {
        return this.sectionGroups; 
    }

    /**
    * Sets the section Groups.
    *
    * @param value the java.util.List<SectionGroup>
    */
    public void setsectionGroups(java.util.List<SectionGroup> value) { 
        this.sectionGroups = value; 
    }
}


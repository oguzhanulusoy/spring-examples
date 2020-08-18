package com.ulusoy.entity;

import com.mongodb.lang.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Course {

    /**
     *  F I E L D S
     */

    @Id
    @Field("id")
    private static int id = 0;
    @Field("title")
    private String title;
    @Field("prefix")
    private String prefix;
    @Field("code")
    private String code;
    @Nullable
    @Field("department")
    private String department;
    @Nullable
    @Field("department")
    private String description;

    /**
     * C O N S T R U C T O R
     * @param title
     * @param prefix
     * @param code
     * @param department
     * @param description
     */
    public Course(String title, String prefix, String code, String department, String description) {
        this.id += 1;
        this.title = title;
        this.prefix = prefix;
        this.code = code;
        this.department = department == null ? "" : department;
        this.description = description == null ? "" : description;
    }

    /**
     * G E T T E R && S E T T E R
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix.toUpperCase();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

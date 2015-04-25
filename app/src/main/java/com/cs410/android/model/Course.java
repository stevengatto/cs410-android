package com.cs410.android.model;

import java.util.List;

/**
 * Steve's still a nerd
 * Created by user on 2/25/2015.
 */
public class Course {
    public Author author;
    public String _id;
    public String title;
    public String description;
    public String date;
    public String category;
    public List<Lesson> lessons;

    // Constructor used for creating mock data
    public Course(Author author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }
}



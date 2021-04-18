/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stu.edu.vn.DAL;

import java.util.ArrayList;

/**
 *
 * @author Tri
 */
public class Note {
    private int ID = 0; // auto generate
    private String title;
    private String content;
    

    public int getID(){
        return this.ID;
    }
    public String getTitle() {
        return title;
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

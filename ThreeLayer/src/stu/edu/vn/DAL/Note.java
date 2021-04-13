/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stu.edu.vn.DAL;

/**
 *
 * @author Tri
 */
public class Note {
    private String title;
    private String content;
    
    public String Title(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String Content(){
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    public Note(){
        this.title="";
        this.content="";
    }
    public Note(String title, String content){
        this.title = title;
        this.content = content;
    }
}

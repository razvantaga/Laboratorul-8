/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author User
 */
public class ArtistController {
    private String name;
    private String country;
    
    public ArtistController(){
        name=null;
        country=null;
    }
    
    public String getName(String name){
        return name;
    }
    
    public String getCountry(String country){
        return country;
    }
    
    public void create(String name, String country){
        this.name=name;
        this.country=country;
    }
    
    public void FindByName(String name){
        String search;
        if(name.indexOf(name)==1)
            System.out.println("I find the name");
        else
           System.out.println("I don't find the name");  
    }
}

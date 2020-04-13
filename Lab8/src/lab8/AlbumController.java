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
public class AlbumController {
    private String name;
    private int artistId; 
    private int releaseYear;
    
    public AlbumController(){
        name=null;
        artistId=0;
        releaseYear=0;
    }
    
    public String GetName(String name){
        return name;
    }
    
    public int getartistId(int artistId){
        return artistId; 
    }
    
    public int getreleaseYear(int releaseYear){
        return releaseYear;
    }
    
    public void Create(String name, int artistId, int releaseYear){
        this.name=name;
        this.artistId=artistId;
        this.releaseYear=releaseYear;
    }
    
    public void findByName(String name){
        if(name.indexOf(artistId)==1)
            System.out.println("I find the artist");
        else
           System.out.println("I don't find the artist");  
    }
}

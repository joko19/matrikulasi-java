/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4prisontest;

/**
 *
 * @author joko
 */
public class Cell {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the isDoorOpen
     */
    public boolean isIsDoorOpen() {
        return isDoorOpen;
    }

    /**
     * @param isDoorOpen the isDoorOpen to set
     */
    public void setIsDoorOpen(boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }
    private String name;
    private boolean isDoorOpen;
    
    //Constructor
    public Cell(String name, boolean isDoorOpen){
 	this.name = name;
        this.isDoorOpen = isDoorOpen;
    }
}

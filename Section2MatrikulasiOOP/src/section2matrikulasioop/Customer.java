/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2matrikulasioop;

/**
 *
 * @author joko
 */
public class Customer {
    
    //properties
    String Name;
    String Address;
    int Age;
    String OrderNumber;
    String CustomerNumber;
    
    //behaviors
    void shop(){
        
    }
    
    void setAddress(String address){
        this.Address = address;
    }
    
    void addItemToCart(String item){
        
    }
    
    String askDiscount(){
        return "";
    }
    
    void displayCustomer(){
        System.out.println("Nama \t\t: " + Name + 
                "\nAlamat \t\t: " + Address +
                "\nUsia \t\t: " + Age +
                "\nNo.Pelanggan \t: " + CustomerNumber);
    }
    
}

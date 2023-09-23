/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section4prisontest;

/**
 *
 * @author joko
 */
public class Section4PrisonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrisonerStudent bubba = new PrisonerStudent("Bubba", 2.08, 4);
        Cell cell = new Cell("A", true);
        cell.setName("Kelas A");
        System.out.println(cell.getName());
        bubba.getCell();
        
    }
    
}

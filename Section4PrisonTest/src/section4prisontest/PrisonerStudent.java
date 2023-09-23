package section4prisontest;

//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonerStudent {

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
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the sentence
     */
    public int getSentence() {
        return sentence;
    }

    /**
     * @param sentence the sentence to set
     */
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    /**
     * @return the cell
     */
    public Cell getCell() {
        return cell;
    }

    /**
     * @param cell the cell to set
     */
    public void setCell(Cell cell) {
        this.cell = cell;
    }
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    
    //Constructor
    public PrisonerStudent(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight());
        System.out.println("Sentence: " +getSentence());
    }
    
}

/*
 * 
 */
package hotelldjuren;


import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;



public class HotellPets {
    public static void main(String[] args){
        List<HotellDjuren> beasts = new LinkedList<>();                    //List för att ddera alla djur hit
        
        HotellDjuren djur1 = new Hunden("Sixten", 5000); // polymorphism - in this case parent class reference is used to refer to a child class object
        beasts.add(djur1);       //adding an animal here
        HotellDjuren djur2 = new Hunden("Dogge", 10000); // polymorphism 
        beasts.add(djur2);       //adding an animal here
        HotellDjuren djur3 = new Katten("Venus", 5000); // polymorphism 
        beasts.add(djur3);       //adding an animal here
        HotellDjuren djur4 = new Katten("Ove", 3000); // polymorphism 
        beasts.add(djur4);       //adding an animal here
        HotellDjuren djur5 = new Orm("Hypno", 10); // polymorphism 
        beasts.add(djur5);       //adding an animal here
        
        String type = JOptionPane.showInputDialog("Which animal should get food?");
        
        int detected = 0;                                                          // checking variable if there is the animal's name
        for (HotellDjuren all: beasts) {
            if (type.equalsIgnoreCase(all.getName())){                          //searching through the animals // polymorphism // "anropp" HotellDjuren
               JOptionPane.showMessageDialog(null, all.writeOut());
               detected += 1;
               break;
            }
        }
        if (detected==0){                                            // if coach makes a mistake or decides to play with the program
            JOptionPane.showMessageDialog(null, "No such animal is found." );
        }
    }
        /*
        beasts.add(new Hunden("Sixten", 5000));
        beasts.add(new Hunden("Dogge", 10000));
        beasts.add(new Katten("Venus", 5000));
        beasts.add(new Katten("Ove", 3000));
        beasts.add(new Orm("Hypno", 1000));
        */
        
}
    
    
    


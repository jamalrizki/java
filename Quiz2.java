import javax.swing.JOptionPane; 

public class Quiz2 {     
    static int nQuestions = 0;     
    static int nCorrect = 0;     
    static String ask(String question) {         
        while (true) {  
            String answer = JOptionPane.showInputDialog(question);       
            answer = answer.toUpperCase();  
            boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));       
            if (valid) return answer;  
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");   
        }  
    } 

    static void check(String question, String correctAnswer) { 
        nQuestions++;        
        String answer = ask(question);         
        if (answer.equals(correctAnswer)) {  
            JOptionPane.showMessageDialog(null,"Correct!");           
             nCorrect++;         
            } 
        else {  
            JOptionPane.showMessageDialog(null,"Incorrect. The answer is "+correctAnswer+"."); 
            }   
         }    
    public static void main(String[] args) {        
        String question = "What is the name of Pandemic?\n";
		question += "A. Sars \n";
		question += "B. The Plague \n";
		question += "C. Measels \n";
		question += "D. Covid-19 \n";
		question += "E. It's a Plandemic \n";       
        check(question,"D");         
        question = "Do masks help?\n";        
        question += "A. Yes\n";        
        question += "B. No\n";         
        question += "C. Only sometimes\n";         
        question += "D. Depends on the Brand\n";         
        question += "E. Dont care\n";         
        check(question,"A");         
        question = "Are You Vaccinated?\n";         
        question += "A. Yes\n";         
        question += "B. No\n";         
        question += "C. No Microchips For Me Thanks\n";         
        question += "D. Had One Dose\n";         
        question += "E. Not Sure";         
        check(question,"A");  
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
    }
}

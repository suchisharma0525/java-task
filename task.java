import java.util.Scanner;
class task
{ 
   
    public static int count(String sentence, char character) 
    { 
        int count = 0; 
  
        for (int i=0; i<sentence.length(); i++) 
        { 
            
            if (sentence.charAt(i) == character) 
            count++; 
        }  
        return count; 
    } 
      
   
    public static void main(String args[]) 
    { 
	    Scanner input=new Scanner(System.in);
	    System.out.println("enter the string: ");
	    String sentence=input.nextLine();
		System.out.println("enter the character: ");
        char character = input.next().charAt(0); 
		System.out.println("the occurance of character is: "+count(sentence, character)); 
    } 
} 

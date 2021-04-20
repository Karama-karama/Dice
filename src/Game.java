import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Dice developed by Karama Aissaoui
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      // Variables
        int i,l; 
        String input;
        boolean verif;
        
      // Check the validity of the input n°1 = number of throws
		do {
    	   System.out.println("Number of throws");
           l = sc.nextInt(); }
        while ( l < 1  || l > 100000);
		// Check the validity of the input n°2 = the sequence of rolled results
		   // Check if the results given match the number of throws
            i=0;
    		sc.nextLine();
            do { 
	    		System.out.println("The sequence =");
	            input = sc.nextLine();
	            System.out.println(input);
	        	System.out.println("Checking sequence");
	        	verif= false;
	        	//Check if the results match the numbers of the dice 1|2|3|4|5|6
	        	for (i=0;i<=input.length()-1;i++)
	                 {
	        		verif=input.substring(i,i+1).matches("1|2|3|4|5|6");
	        		if (verif==true)
		        		{ 
		        		System.out.println("Match");}
		        		else 
		        			{break;}
		        		}
                } 
              while (input.length()!=l || i<l-1 || verif == false);
            
    		System.out.println("Good let's work on the sequence now");
    		System.out.println("*******************EX1********************");
    		// Output of Ex1 " How many 66 are there in the sequence"
    		i=0;
    		int ex1=0;
    		do {
    			if (input.charAt(i)== Character.forDigit(6, 16) && (i+2)<=l-1) {
    				System.out.println(input.charAt(i)+" matches 6 at position"+i);
    				if (input.substring(i,i+2).equals("66") && input.charAt(i+2)!= Character.forDigit(6, 16)) {
    					if (i!=0 && input.charAt(i-1)!= Character.forDigit(6, 16))
	    					{System.out.println(" Checking char at i-1 ="+input.charAt(i-1));
    						System.out.println(" check i-1 and Matches 66 at position :"+i);
	    					ex1=ex1+1;
	    					i=i+3;
	    					}
    					else { if (i==0)
	    						{System.out.println("Matches 66 at position :"+i);
		    					ex1=ex1+1;
		    					i=i+3;
	    						}
    					else {i=i+3;}
    						
    					}
    				}
    				else {
        				i++;

    				}
    				
    			}
    			else {
    				i++;
    			}
    			// Last 2 digits 
    			if (i==l-2 && input.substring(l-2,l).equals("66") && input.charAt(i-1)!= Character.forDigit(6, 16) ) {
    				System.out.println("Matches 66 at position :"+i);
					ex1=ex1+1;
    			}
    			
    			
    		} while (i<= l-1);
    		System.out.println("Output ex1 ="+ex1); 
    		System.out.println("*******************EX2********************");
    		
    		// Output of Ex2 " The longest successive sub-sequence without 6 "
    		int begin =0;
    		int end =1;
            int a ,b;
            i=0;
            // Using an ArrayList to store the different length of sequences 
            ArrayList<Integer> ex2 = new ArrayList<Integer>(1);
    		ex2.add(begin,0);
    		do {      a= Character.getNumericValue(input.charAt(begin)) ; 
	    	          b= Character.getNumericValue(input.charAt(begin+1));	
	    	          switch (a-6) {
	    	          case 0:
	    	            System.out.println("a=6");
		    	            switch (b-6) {
			    	          case 0:
			    	            System.out.println(" a= 6 et b=6");
			    	            System.out.println(" begin= "+begin +" end= "+end);
			    	            ex2.add(0);
			    	            begin=begin+1;
			    	            end=end+1;
			    	            i=i+1;
			    	            break;
			    	          
			    	          default:
			    	            System.out.println("a= 6 et b!=6");
			    	            System.out.println(" begin= "+begin +" end= "+end);
			    	            ex2.add(0);
			    	            begin++;
			    	            end++;
			    	            i++;
			    	        }
		    	            break;
		    	          
		    	          default:
	    	            System.out.println("a !=6");
	    	            switch (b-6) {
		    	          case 0:
		    	        	    System.out.println(" a!=6 et b=6");
		    	            	ex2.set(i, ex2.get(i)+1);
			    	            begin=begin+1;
			    	            end=begin+1;
			    	            i++;
			    	            ex2.add(0);
	    	            break ;
		    	          default:
			    	            System.out.println("a!=6 et b!=6");
			    	            System.out.println(" begin= "+begin +" end= "+end);
			    	            if (a<=b) {
			    	            	System.out.println(" a <= b");
			    	            	System.out.println(" begin= "+begin +" end= "+end);
			    	            	begin++;
			    	            	end++;
			    	            	ex2.set(i, ex2.get(i)+1);
			    	            }
			    	            else {
			    	            	System.out.println(" a > b");
			    	            	System.out.println(" begin= "+begin +" end= "+end);
			    	            	ex2.add(1);
			    	            	begin++;
			    	            	end++;
			    	            	i++;
			    	            }
			    	        }
	    	            
	    	        }
    		} while (begin+1<l);
    		System.out.println(" EX2 = "+ex2);
    		Collections.sort(ex2);
    		System.out.println("Output EX2 = "+ex2.get(i));
    		System.out.println("*******************EX3********************");
    		// Output of EX3 : The longest length of a a lucky series ( 5 or 6 or 5&6)
    		ex2.clear();
    		i=0;
    		begin=0;
    		ex2.add(0,0);
    		do {      a= Character.getNumericValue(input.charAt(begin)) ; 
		    		switch (a) {
			          case 6:
			        	    System.out.println(" Getting lucky here 6 !");
			            	ex2.set(i, ex2.get(i)+1);
			            	begin++;
							break ;
			          case 5:
			        	    System.out.println(" Getting lucky here 5 !");
			            	ex2.set(i, ex2.get(i)+1);
			            	begin++;
							break ;
			          default:
		  	            System.out.println("Not so lucky :/"); 
		  	            i++;
		  	            ex2.add(0);
		            	begin++;

		    		}
    		
    		   } while(begin<=l-1);
    		System.out.println(" EX2 = "+ex2);
    		ex2.removeAll(Collections.singletonList(0));
    		Collections.sort(ex2);
    		 int ex3 =0;
    		 int ex =0; 
    		 for (int j=ex2.size()-1;j>=0;j--) {
    	     		if (ex3 < Collections.frequency(ex2, ex2.get(j))) {
    	     			ex3 =Collections.frequency(ex2, ex2.get(j));
    	     			ex=ex2.get(j);
    	     		}
    		 }
     		System.out.println(" Occurences = "+ex3);
    		System.out.println("Output EX3 = "+ex);

}}
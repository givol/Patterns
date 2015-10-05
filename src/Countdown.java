/**
 * Created by painter on 9/9/15.
 */

    	public class Countdown {

    	    public static String pattern(int n){
    	        //Happy Coding ^_^
    	    String string1 = "";
    	    for(int j=n; j>0; j--) {
    	    	for(int i=j; i>0; i--) {
    	    		string1 += i;
    	    	}
    	    	string1 += "\n";
    	    }
    	    return string1;
    }
    	    	
    	    	
   

    public static void main(String[] args){

        System.out.println("Hello");
        System.out.println("You can use this method to test your work and see output");
        System.out.println("Don't forget to also use the Tests");
        System.out.print(pattern(4));
    }
}

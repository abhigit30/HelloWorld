import java.util.Scanner;

public class HelloWorld {
	
	public static boolean isValid(String word) {
		for(char c : word.toCharArray()) {
			if(!(Character.isLetter(c) || c=='!' || c==' ')) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!!");
		Scanner sc=new Scanner(System.in);
        //fill the code here
       System.out.println("Enter the first string");
       String first = sc.nextLine();
       
       System.out.println("Enter the second string");
       String second = sc.nextLine();
       
       if(first.length()!=second.length()) {
    	   		System.out.println("Length of the strings " + first + 
    	   				" and " + second + " does not match");
    	   		return;
       }
       
       boolean invalid1 = isValid(first);
       boolean invalid2 = isValid(second);
       
       if(invalid1 && invalid2) {
    	   		System.out.println(first + " and " + second + 
    	   				" contains invalid symbols");
    	   		return;
       }
       else if(invalid1) {
    	   		System.out.println(first + " contains invalid symbols");
    	   		return;
       }
       else if(invalid2) {
	   		System.out.println(second + " contains invalid symbols");
	   		return;
       }
       
       StringBuilder result = new StringBuilder();
       
       for(int i=0; i<first.length(); i++) {
    	   		if(first.charAt(i)=='!') {
    	   			result.append(second.charAt(i));
    	   		}
    	   		else {
    	   			result.append(first.charAt(i));
    	   		}
       }
       
       System.out.println(result.toString());

	}

}

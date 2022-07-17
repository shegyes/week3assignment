package com.stephenhegyes;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Average letters
		double letters = 0;
				
		for (String name : names) {
			letters += name.length();
		}
				
		System.out.println(letters / names.length);
		
		//String Concatenation
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < names.length; i++) {
            builder.append(names[i]);

            if (i != names.length - 1) {
                builder.append(" ");
            }
        }

        String joined = builder.toString();
        System.out.println(joined);
        
        //question 5
        int[] nameLengths = {0,0,0,0,0,0};
        
        for (int i = 0; i < names.length; i++) {
        	nameLengths[i] = names[i].length();
        	System.out.println(nameLengths[i]);
        }
        
        //Question 6
        int sum = 0;
        for (int number : nameLengths) {
        	sum += number;
        }
        System.out.println(sum);
			
			
		
	}

}

class Test{


public static void main(String[] args) {

	// int
	int x=10;
        int y=20;

        System.out.println(x);
 	//System.out.println(x+" "+x+x+x+" "+(x+x)+x);
       System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
       
        // short

	short ss=3276;
	 System.out.println(ss);

       // long
       long ll=15000;
	 System.out.println(ll);

      // byte

     byte b=12;
     System.out.println(b);

    int i=0654474;
     System.out.println(i);
   
   // Run time
  
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Input a number: ");
   int n=sc.nextInt();
    System.out.println("Number: "+n);

 
    // char
    char ch='H'; // 2  bytes
   System.out.println(ch);
    String s="ABC";
  char ca[]=s.toCharArray();
   for(int ii=65;ii<=90;ii++){
    System.out.println((char)ii);
  }
    

// boolean
   boolean flag=false;
   System.out.println(flag); 

  
	


	


    }

}


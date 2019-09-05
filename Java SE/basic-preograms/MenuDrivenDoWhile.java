class MenuDrivenDoWhile{    
    public static void main(String args[]){

   java.util.Scanner sc=new java.util.Scanner(System.in);
     boolean choice=true;
     do{
         System.out.println("Menu-Dowhile");
         System.out.println("-------------");
         System.out.println("1.Save");
         System.out.println("2.List All");
         System.out.println("3.Find");
         System.out.println("4.Delete");
         System.out.println("5.Update");
         System.out.println("6.Exit");
         System.out.println("Enter your choice: ");
         int ch=sc.nextInt();

         switch(ch){
             case 1:
             System.out.println("Saving data");
             break;
             case 2:
             System.out.println("Listing all data");
             break;
             case 3:
             System.out.println("Finding one record");
             break;
             case 4:
             System.out.println("Deleting record");
             break;
             case 5:
             System.out.println("Updating record");
             break;
             case 6:
             System.out.println("Thank you. Visit again");
             choice=false;
             break;
             default:
             System.out.println("Invalid Choice. try again: ");

         } // end ofswitch
     }while(choice); // end of while

    } // end of main method
}
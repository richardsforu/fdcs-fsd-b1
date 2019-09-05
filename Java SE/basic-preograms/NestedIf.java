class NestedIf{
    public static void main(String args[]){



        int age=40;
        char gender='M';
        int exp=9;

         if(age >= 35){
                if(exp >=8) {
                      
                    System.out.println("Eligible to apply job");
                }else{
                    System.out.println("Experience should be >=8");
                }
         }else{
             System.out.println("Not Eligible");
         }

    
        
       

    }
}
class Loops
{
    public static void main(String a[])
    {

       /* int i=1;
         while(i<=10)
         {
             System.out.println("Hi" + i); //println, by default every print statment enters into a new line
             i++;
         }*/
         //Nested while Loop
          int i=1;
         while(i<=10)
         {
             System.out.println("Hi " + i);
              //println, by default every print statment enters into a new line
              int j=1;
              while(j<=3)
              {
                System.out.println("Henlo " + j);
                j++;
              }
             i++;
         }

         //do while loop
        /* do{

         }(while x>10);

         for(int x=1;x<10;x++)*/
    }
}
//static variable
              //declaring a variable static means--its common for all the objects
              //sttaic variable is shared by al the objects
              //so if we change its value, it will reflect those changes in all the objects
              //so it should be accessed using class name not object name
            /* class Phone()
             {
              static int price=100;
             }
             public static void main(String args)
             {
                Phone.price=150;
             }*/

            //we can use static variables in nonnsatic methods but non static variables cannot be used in static methods
            //bcoz the method doesnt know, which object we r referrring to
           
            //sttaic variables are stored in a separate place in JVM
              
            //static methods

class Stud
{
     static int pincode;
     static
     {
        System.out.println("Am in static blockk"); //no matter how many objects we created---it gets called only once
     }
   static void print()
   {
   // System.out.println(pincode+ " pincode ");
   System.out.println("Am in print");
   }
}
class Static
{
    public static void main(String a[]) //declared main means we dont need to create an obj to call main--this is the strating point of any program
    {
             Stud s1=new Stud();
             Stud s2=new Stud();
            // Stud.pincode=506001;
             s1.print();
             s2.print();
             //we can use non static variable inside static method if we have object reference like---Stud.print(obj1)
    }
}

//static block
//to initialize a static variable
//it will be called/executed only once, no matter how many times we create an object

//to initialize instance variables we can do it in constructor
//in general
//class is loaded first(into class loader present in JVM) then objects are instantiated

//if the class is already loaded, it wont load again--thats why sttaic block is execuetd only omnce

//if u donmt create an object, class will not load not even once

//so do it explicitly--u need to add this':

Class.forName(className:"Stud");// this loads the class Stud, might also throw exception so add in main throws ClassNotFoundException
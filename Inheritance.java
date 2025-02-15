// we can use methods of some super class

//use extends keyword for child class to get methods of parent class
//to do mutilevel inheritance--just use one more class extends to recent child class--- like MoreAdvCalc extends AdvCalc
//Calc-----AdvCalc----MoreAdvCalc--single and multi level inheritance

//mutiple Inheritance--is not supported by java--feature is removed to avoid ambiguity

import tools.AdvCalc; 
 //package==folder
//we have created the classes inside the package tools, so in the main method u have to import it

//import tools.*;  //it imports all the classes inside tools package

//also arraylist is in util package
//import java.lang.*; //it is imported by default--we dont have to import explicitly it has String, System etc;
//every class in java belongs to a package-- so System is a class, String is a class

//access modifiers
//to access something outside the package--make it public, like variables, methods

//public--can be use anywhere
//private--only  in that class, no where else

//default---can be used in same package

//protected-- can be used in same class, same package, diff package but sub class

// import x.y.*; ///imports all the files inside y folder
public class Inheritance
{
    public static void main(String a[])
    {
         AdvCalc c1= new AdvCalc();
         System.out.println(c1.add(12,4));
         System.out.println(c1.sub(12,4));
         System.out.println(c1.mul(12,4));
         System.out.println(c1.div(12,4));
         
    }
}
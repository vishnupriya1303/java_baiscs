//binding data members and variables into single unit
//it means no one outside the class can access it.--declare as private
class Stud
{
    private int age;

    //constructor--has same name as class name, no return type
    //is called everytime an object to that class is created
    //used for default variables/instance variables initialization
    //and to connect to databases
    //to perform any operation/assigning values--do it in methods
    public Stud() //default constructor
    { 
        age=20;
        System.out.println("Am in constructor");
    }
    public Stud(int age)
    {
        this.age=age;
    }
    int pri()
    {
       // System.out.println(age);
       System.out.println("Am in method pri");
       return age;
    }
   /* void setage(int x) //always method name should be readable// like gettters to get value, set for setting value--jordans method
    {
        age=x;
    }*/
    
    //this keyword is used to access instance variable when local and instance variables are having same name
    void setage(int age)
    {
        this.age=age;
    }
}
class Encapsulation
{
    public static void main(String a[])
    {
           Stud s1=new Stud();
           Stud s2=new Stud();
          // s1.setage(24); //to modify that vraiable also we need mthod in it
           System.out.println(s1.pri());
          // System.out.println(s1.age);//throws error as we cannot access age as its private to that class
           //but we can access it through the method

           //anonymous object
           //whenever we create a new object without any reference--its an anonymous object

           new Stud().pri();  //object created--constructor will be called---but it has no reference--it means we cant use it again

           //but we can use it to call a method once
           //cannot bereused, as object already created

    }
}
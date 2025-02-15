
//every class in java extends Object class even if we dont mention it

//this()---to call default constructor of same class
//super()-- to call default constructor of Super class
class A //extends object--doesnot matter even if mentioned/ not
{
    public A()
    {
        //super(); //this has no super class like class A extends C, but actually it has Object class extending , so its calling constr of object class
    System.out.println("In A");
    }
    public A(int a)
    {
    System.out.println("In A int");
    }
}
class B extends A
{
    public B()
    {
        
        System.out.println("In B");
    }
    public B(int b)
    {
        //super();//this actually exists without mentioning it calls default const of A, if we want parameterizefd one--pass parameters
        //super(b); //prints both int int
        this(); // this method is used to execute the constructor of same class--as no parameters are there--it executes default one
        System.out.println("In B int");
    }
}
class ThisSuper
{
    public static void main(String a[])
    {
         //B b1=new B();  //we r creating an object to B(child class), but it calls constructors of its parent and child class also
         //it calls the constructor of its super and sub class also---this works in case of default constructor only

         B b1=new B(10); //we have created parameterized obj--it will call only B's parameterized constructor

         //bcoz in constructor by default there is method called Super();//not visible
         //and it will call default constructpor of parent class, as there r no parameters passed.
    }
}
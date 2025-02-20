class A{
void pri()
{
    System.out.println("In A");
}
}
class B extends A
{
    void pri()
{
    System.out.println("In B");
}
}
class C extends A
{
    void pri()
    {
        System.out.println("In C");
    }
}

public class Dynamic_mthod_dispatch {
    public static void main(String a[])
    {
          A a1= new A(); // we r creating a variable of class A and object of also A;
          a1.pri();

          //since the classes B and C--extending A--we can create an obj of these child classes to variable of parent class also;

          a1=new B();
          a1.pri();

          a1=new C();
          a1.pri(); 
           //this means which class's method is getting called is dependeding on runtime---runtime polymorphism
    }
}

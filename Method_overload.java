//its called compile time polymorphism/method overloading
//it means if two methods are having same name,,, they should have atleast diff num of parameters or diff data type of paramenters
//same data types, same mthod name, same jumber of variables are not allowed in java
//method overriding comes in inheritance
class Calci
{
    public int add(int a, int b)
    {
        return a+b;
    }
    /*public int add(int a, int b)//throws an error, so u can change data type of one of the parameters or increase or decrease numb of param 
    {
        return a+b;
    }*/
}
class Method_overload
{
    public static void main(String a[])
    {
        Calci cal=new Calci();
        System.out.println(cal.add(12,11));
        System.out.println(cal.add(19,8));
    }
}
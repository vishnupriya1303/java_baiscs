class C
{
   public int add(int a,int b)
   {
    return a+b;
   }
}
class AdvC extends C
{
    //add method is overriding the method defin of parent class
    public int add(int a,int b) // if we comment out this method//it shows a+b output, i mean parent class's add func
    {
     return a+b+5;
    }
}
class Overriding
{
    public static void main(String a[])
    {
        AdvC a1=new AdvC();
        System.out.println(a1.add(10,15));
    }
}
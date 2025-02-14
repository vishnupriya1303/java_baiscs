//binding data members and variables into single unit
//it means no one outside the class can access it.--declare as private
class Stud
{
    private int age=20;
    int pri()
    {
       // System.out.println(age);
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
           s1.setage(24); //to modify that vraiable also we need mthod in it
           System.out.println(s1.pri()));
          // System.out.println(s1.age);//throws error as we cannot access age as its private to that class
           //but we can access it through the method

    }
}
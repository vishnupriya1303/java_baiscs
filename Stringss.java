//String is a class in java
class Strings
{
    public static void main(String a[])
    {
          /* String name=new String("monu");// how u create a string

           //or we can directly give  = "monu"--it will create an object behind
           //here name is a referenve variable referring to a String object

           System.out.println(name);
            System.out.println(name.hashCode()); //is giving integral representation of any value
            System.out.println("Hello " + name);
             System.out.println(name.charAt(1));
              System.out.println(name.concat(" Beligini")); // as string is an object it is having inbuilt methods/functions
               System.out.println(name);*/

               

              //String constant pool
              //inside  jvm --there is heap and stack
              //heap has string constant pool and it stores all strings inside it
              //if we create a var name="monu" , in string constant pool this literal "monu" is stored and has an address x, 
              //in stack this name is mapped to x
              //so if we create name2='monu', in stack name2 also has address x

              //it means whenever we create a string var in java, it checks if its already present in pool, else it will create a new add

              //if we concatenate sth to name,
              //pool creates a new add for modified name, and new address is stored in stack now, and old name in pool is ready to become garbage

              //mutabel--changeable
              //immutable--cannot be changed, once created--by default strings in java are immutable

              //to create mutable strings--we have 2 classes(String Buffer and String Builder)

              StringBuffer sb=new StringBuffer("monuu");
              System.out.println(sb.capacity()); //default capacity is 16, that means even when sb is empty, no value, its capacity is 16
             
              //capacity changes according to what we pass like if sb="monuu", CAPACITY=16+5
              //IT MEANS ALWAYS 16 EXTRA
              //TO AVOID RELOCATION IT STORES EXTRA SPACE/BUFFER
              sb.append(" vinay");
              System.out.println(sb);

              //string builder has same methods like stringbuffer, except that it is not thread safe
              

    }
}
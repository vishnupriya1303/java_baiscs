class Hello
{
    public static void main(String a[])
    {
       /* int num=44;
        double x=9.12;
        System.out.print(num);
        System.out.print("\n");
        System.out.print(x);
        System.out.print("\n");
    /*LITERALS
        int bi=0b1101;
        System.out.print(bi);
        System.out.print("\n");
        //for hexadecimal
        int hex=0X7E;
        System.out.print(hex);
        System.out.print("\n");
        int var=11_1_11_1;// in a long number can put underscores for better readability but still prints the same original number
        System.out.print(var);
        System.out.print("\n");
        //if var is defined as double and we gave int as literal, compiler automaticaly typecasts from int to double
        double d=923;
        System.out.print(d);
        System.out.print("\n");
        //12e10---it means 12*(10^10)
        //bool x=1;----throws error
        char ch='b';
        ch++;//works same as increment operator in int--it means a+1 becomes b etc;
        System.out.print(ch);
        System.out.print("\n");
        System.out.print("hey monuu!!");*/

        //conversions and casting

        //conversion is automatic conversion, casting is explicit conversion
       /* implicit conversion when larger range to smaller range--//narrowing
        eg: converting assigning byte to int

        //explicit conversion--widening, like assigning int to byte
        //while assigning if its within the range, it will take that value, else it will store that In Java, values ≥ 128 wrap around into the negative range using Two’s Complement.*/
/*
        byte x=12;
        int i=x;//byte to int so implicitly done

        int ar=1000;
        byte b=(byte)ar; // here 1000%256 --byte range is from -128 to 127 but a byte is in 8 bits size, it means 2^8 distinct values
    System.out.print(b);// so 1000%256 = 232 , now its binary from is 11101000  MSB is 1 so its negative acc to java ,and do 232-256=-24 answer
    
    //type promotions
    byte z=10;
    byte y=120;
    int p=z*y;//byte * byte is exceeding int, so java automaticaly promotes that product into int;
    System.out.print(p);*/

    /*Arithmetic operators
    int c=20;
    int b=90;

    int add=b%c;//b/c;//c*b;//c-b;//c+b;
    System.out.print(add);*/
    
    /*assignment operators
    +=,-=,*=,/=
    or simply i+=1  is same as i++ , same with i-- */ 
    // int a=i++// post increment when assigning/fetching value it fteches value first then increments
   //int b= ++i //pre increment first increments then fetches the value;


  /*comparision operators or relational operators-- to compare two values// gives bool output
  // ==,!=<=,>=,  

boolean u=12>10;
System.out.print(u);*/

//logical operators
//TO COMPARE TWO OR MORE CONDITIONAL STATMENTS
//AND,OR, NOT (&, |, !)
//short circuit logical oper: (&&,||,!)--it does save ur time by checking one condition and return answer if possible
/* EG: a && b--if a is false, it returns false as for and AND both need to be true
      a || b --if a is true its enough*/
      //can have multiple logical operators in one statement
      //! gives the opposite value !true is false etc


// conditional statements: if else,else if
//ternary operator : condition? expression1: expression2;, its like a shortcut for if else
//eg : result: a>b?a:b;
//switch statement: in substitution to multiple if else
/* switch(n)
{
    case 1:
        system.out.print("monday");
        break;
    case 2:
        .....
        break;
    default:
        ..
}*/

//classes and objects
//class is a blueprint
//object is an instance for a class
//we give JVM a blueprint, it gives us the object
//class can have vairables and methods


    }

}
class Newswitch
{
    public static void main(String a[])
    {
       String day="mon";
      /*switch(day)
       {
        case "Sun" -> System.out.print("9am");//if u write  -> in new java no need to add break stmt
        case "mon" ->  System.out.print("7am");
        default -> System.out.print("6am");
       }
      String ans;
      switch(day)
       {
        case "Sun" -> ans="9am";//if u write  -> in new java no need to add break stmt
        case "mon" -> ans= "7am";
        default -> ans="6am";
       }*/

        /*String ans;
      ans=switch(day)
       {
        case "Sun" -> "9am";//if u write  -> in new java no need to add break stmt
        case "mon" ->  "7am";
        default ->  "6am";
       };
       System.out.print(ans);*/
       String res;
      res=switch(day)
       {
        case "Sun" : yield "9am";//if u write  -> in new java no need to add break stmt
        case "mon" : yield "7am";
        default :yield "6am";
       };
        System.out.print(res);
    }
}
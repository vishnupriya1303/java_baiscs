class Arr
{
    public static void main(String args[])
    {
        /*
    int arr[]=new int[4];
    //ARR indexing starts from 0;
    int num[]={1,2,3,4,5};
    num[4]=12;
    for(int i=0;i<4;i++)
    {
    System.out.println(num[i]);
    }*/

   //multi dimensional arrays--array consisting arrays as elements
   int nums[][]=new int[2][3];
   /*for(int i=0;i<2;i++)
   {
    for(int j=0;j<3;j++)
    {
        System.out.print(nums[i][j]+" ");
    }
    System.out.println();
   }*/
  
  int rando;
    for(int i=0;i<2;i++)
   {
    for(int j=0;j<3;j++)
    {
        rando=(int)(Math.random()*100); //generates some values like 0.23,0.05, etc, so do * 100 to get atleast 2 digit value, then typecast to integer
        nums[i][j]=rando; 
        //System.out.print(nums[i][j]+" ");
    }
    //System.out.println();
   }

  //Another way of printing multi dimensional arrays::::
  for(int[] a:nums) //bcoz every element of nums is an arr[], so a is an int array type
  {
    for(int b:a)//
    {
        System.out.print(b + " ");
    }
    System.out.println();
  }

  //jagged arrays
  //we have to specify the num of rows in the array, but not the num of cols in each array like cols size is variable, not fixed
     int arr1=new int[3][];
    }
}
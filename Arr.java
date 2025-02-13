import java.util.ArrayList;
class Arr
{
    public static void main(String args[])
    {
      /*  /*
    int arr[]=new int[4];
    //ARR indexing starts from 0;
    int num[]={1,2,3,4,5};
    num[4]=12;
    for(int i=0;i<4;i++)
    {
    System.out.println(num[i]);
    }

   //multi dimensional arrays--array consisting arrays as elements
   int nums[][]=new int[2][3];
   /*for(int i=0;i<2;i++)
   {
    for(int j=0;j<3;j++)
    {
        System.out.print(nums[i][j]+" ");
    }
    System.out.println();
   }
  
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

  //jagged arrays--irregular 2D arrays
  //we have to specify the num of rows in the array, but not the num of cols in each array like cols size is variable, not fixed
     int arr1=new int[3][];
     //other methods are like .clone(),int arr2=Arrays.copyof(arr,arr.length()),.sort(),etc
     */


     //Array List--dynamic sized array
    
    ArrayList<Integer>  nums = new ArrayList<>();
    nums.add(12);
    nums.add(20);//to add elements
    System.out.println(nums.size());
     System.out.println(nums.get(1)); //.get(index) is to access the element at that index
     nums.set(1,90);//to update elements at an index
      System.out.println(nums.get(1));
      nums.add(120);
      nums.add(85);
      nums.remove(3);
      nums.clear();
      //to print an arraylist is same like array
      for(int a: nums)
      {
        System.out.println(a);
      }
      System.out.println(nums.contains(90));
      //3D ARRAY
      //drawback of arrays:  fixed memory allocation in heap--waste 
      //array of objects--pendings

      


    }
}
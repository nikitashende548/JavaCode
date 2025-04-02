package Array;

public class array_max_Ex004 {
    public static void main(String[] args) {
     int[] num ={32, 46,32,45,11, 66};
            int max = num[0];
//        for (int nums: num)
//        {
//            if (nums>max)
//            {
//                max =nums;
//            }
//        }
//        System.out.println(max);

        //type 3 to right the code
          for (int i =0; i<num.length;i++)
          {
              if(num[i]>max)
              {
                max =num[i];
              }
          }
        System.out.println(max);
    }
}

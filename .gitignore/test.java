package fyz2;
public class Zixianghe {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0 || array==null) {
            return 0;
        }
       int currentSum = 0;     //存储当前连续n项的和
       int max = 0;            //存储连续子元素和的最大值
       for (int i = 0; i < array.length; i++) {
           //核心部分，好好理解.
           if(currentSum<=0){      //如过当前连续n项的和小于等于0,则没必要与后面的元素相加
               currentSum = array[i];      //currentSum重新赋值
           }else{
               currentSum += array[i];     //如果currentSum的值大于0,则继续与后面的元素相加,
           }
           if(currentSum>max){         //每次改变currentSum的值都有与max进行比较
               max = currentSum;       //如果currentSum的值大于max,则将currentSum的值赋值给max
           }
       }
       return max;
    }  

    public static void main(String[] args) {
    int[] array = {6,-3,-2,7,-15,1,2,2};
    int result = FindGreatestSumOfSubArray(array);
    System.out.println(+result);
    }
}

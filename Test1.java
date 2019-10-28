1.有一堆石头，每块石头的重量都是正整数。

每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：

如果 x == y，那么两块石头都会被完全粉碎；
如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
最后，最多只会剩下一块石头。返回此石头最小的可能重量。如果没有石头剩下，就返回 0。

 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/last-stone-weight-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int i:stones){
            sum+=i;
        }
        int maxweight=sum/2;
        int[] dp=new int[maxweight+1];
        for(int i=0;i<stones.length;i++){
            for(int j=maxweight;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-2*dp[maxweight];
    }
}


2.
class Num{
    public int num;
}
public class Demo {
    public static void main(String[] args) {
        Num num1=new Num();
        num1.num=10;
        Num num2=new Num();
        num2.num=20;
        swap(num1,num2);
        System.out.println(num1.num);
        System.out.println(num2.num);
    }
    public static void swap(Num num1,Num num2){
        int tmp=num1.num;
        num1.num=num2.num;
        num2.num=tmp;
    }

}

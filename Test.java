/**
 * ClassName:Test
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Date:2019/10/28 18:10
 * @Author:DangWei
 */
public class Test {
    public static void main(String[] args) {
         //01背包
        //  w[i]为第i个物品的重量    v[i]为第i个物品的价值   有N个物品    背包容量为M
        //二维数组
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                if(w[j]<j){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        // 一维数组     逆序
        for(int i=1;i<=N;i++){
            for(int j=M;j>=w[i];j--){
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        //完全背包     顺序
        for(int i=1;i<=N;i++){
            for(int j=w[i];j<=M;j--){
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        //分组背包
        for(int i=1;i<=N;i++)//第几组
            for(int j=M;j>=1;j--)//允许的重量
                for(int k=1;k<=这组的物品数;k++)//每组选物品
                    if(物品的重量<=j)
                        dp[j]=max(dp[j],dp[j-物品的重量]+val[i][k]);

    }

}

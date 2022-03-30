package algorithms;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] account = {
                {1,2,3},{4,5,6}
        };

        MaxWealth obj = new MaxWealth();
        System.out.println(obj.maxWealth(account));
    }

    public int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person<accounts.length; person++) {
            int sum = 0;
            for (int row = 0; row<accounts[person].length; row++) {
                sum += accounts[person][row];
            }
            //now we have sum of accounts of a person
            //check with overall values
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

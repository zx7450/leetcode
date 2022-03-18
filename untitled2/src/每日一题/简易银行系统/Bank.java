package 每日一题.简易银行系统;

/**
 * @author zx
 * @date 2022/3/18 14:15
 */
class Bank {//Quiz2043

    long[] usersannount;
    int n;

    public Bank(long[] balance) {
        usersannount=balance;
        n= usersannount.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1>n||account2>n)
            return false;
        else if (usersannount[account1-1]<money)
            return false;
        else {
            usersannount[account1-1]-=money;
            usersannount[account2-1]+=money;
            return true;
        }
    }

    public boolean deposit(int account, long money) {
        if (account>n)
            return false;
        usersannount[account-1]+=money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account>n||usersannount[account-1]<money)
            return false;
        usersannount[account-1]-=money;
        return true;
    }
}

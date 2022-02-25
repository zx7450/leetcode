package 每日一题.复数乘法;

/**
 * @author zx
 * @date 2022/2/25 9:20
 */
public class Quiz537 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] complex1=num1.split("\\+|i");//根据正则表达式对复数进行实部和虚部拆分
        String[] complex2=num2.split("\\+|i");
        int real1=Integer.parseInt(complex1[0]);
        int img1=Integer.parseInt(complex1[1]);
        int real2=Integer.parseInt(complex2[0]);
        int img2=Integer.parseInt(complex2[1]);
        return String.format("%d+%di",real1*real2-img1*img2,real1*img2+real2*img1);
    }
}

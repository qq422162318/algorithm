package 算法题;
/**
 * 66. 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 提示：输入【9】
 *     输出【1,0】
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 */
public class likou66 {
    public static void main(String[] args) {
        likou66 likou66 = new likou66();
        int[] num={9};
        int[] ints = likou66.plusOne(num);
        for (int i : ints) {
            System.out.print(i+",");
        }
    }
    public int[] plusOne(int[] digits){
        for (int i = digits.length-1; i >=0 ; i--) {
                if (digits[i]!=9){
                    digits[i]++;
                    return digits;
                }
                digits[i]=0;
            }
        //创建数组时默认全部置0
        int[] temp=new int[digits.length+1];
        temp[0]=1;
        return temp;
    }
}

package 算法题;

import java.util.LinkedList;

/**
 * 297. 二叉树的序列化与反序列化
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * 提示: 输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * 示例 1：
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 * 示例 2：
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * 输入：root = [1]
 * 输出：[1]
 * 示例 4：
 * 输入：root = [1,2]
 * 输出：[1,2]
 * 提示：
 * 树中结点数在范围 [0, 104] 内
 * -1000 <= Node.val <= 1000
 */
public class likou297 {
    public static void main(String[] args) {
        likou297 likou297 = new likou297();
        String s = "1,2,3,#,#,4,5";
        Codec codec = new Codec();
        TreeNode deserialize = codec.deserialize(s);
        System.out.println(deserialize);
        String serialize = codec.serialize(deserialize);
        System.out.println(serialize);
    }

    public static class Codec {
        //静态变量（必须）
        static String SEP = ",";
        static String NULL = "#";

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serialized(root, sb);
            return sb.toString();
        }

        private void serialized(TreeNode root, StringBuilder sb) {
            if (root == null) {
                sb.append(NULL).append(SEP);
            } else {
                sb.append(root.val).append(SEP);
                serialized(root.left, sb);
                serialized(root.right, sb);
            }
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] split = data.split(",");
            LinkedList<String> strings = new LinkedList<>();
            for (String s : split) {
                strings.addLast(s);
            }
            return deserialized(strings);
        }

        private TreeNode deserialized(LinkedList<String> strings) {
            if (strings.isEmpty()) return null;
            String node = strings.removeFirst();
            if (node.equals(NULL)) return null;
            TreeNode treeNode = new TreeNode(Integer.valueOf(node));
            treeNode.left = deserialized(strings);
            treeNode.right = deserialized(strings);
            return treeNode;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

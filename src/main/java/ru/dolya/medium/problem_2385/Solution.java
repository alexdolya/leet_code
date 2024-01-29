package ru.dolya.medium.problem_2385;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(9);
        root.left.right.right = new TreeNode(2);

        System.out.println(amountOfTime(root, 3));

        System.out.println(findMaxDepth(root.left));
        System.out.println(findMaxDepth(root.right));

        System.out.println(findDepth(root, 0, 3));
    }


    public static int amountOfTime(TreeNode root, int start) {
        int count = 0;


        return count;
    }

    public static int findMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Рекурсивно находим глубину левой и правой ветвей
        int leftDepth = findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);

        // Возвращаем максимальную глубину ветви (увеличенную на 1 для учета текущего узла)
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static int findDepth(TreeNode root, int currentDepth, int start) {
        if (root == null) {
            return 0;
        }
        if (root.val == start) {
            return currentDepth;
        }

        // Рекурсивно ищем в левой и правой ветвях
        int leftDepth = findDepth(root.left, start, currentDepth + 1);
        int rightDepth = findDepth(root.right, start, currentDepth + 1);

        // Если значение не найдено в поддеревьях, возвращаем 0
        if (leftDepth == 0 && rightDepth == 0) {
            return 0;
        }

        // Возвращаем максимальную глубину из левой и правой ветвей
        return Math.max(leftDepth, rightDepth);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

import com.sun.source.tree.Tree;

public class BinaryTree {
    private TreeNode root;
    private class TreeNode
    {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void createBinaryTree()
    {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);


        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;


    }




    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();


    }
}

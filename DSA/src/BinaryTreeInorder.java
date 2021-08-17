public class BinaryTreeInorder {
    Node root;
    private class Node
    {
        private int data;
        private Node left;
        private Node right;

        public Node(int data)
        {
            this.data = data;
            left = null;
            right = null;

        }

    }
    public void createTree()
    {
        Node first = new Node(6);
        Node second = new Node(8);
        Node third = new Node(9);
        Node forth = new Node(3);
        Node fifth = new Node(1);
        Node sixth = new Node(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
        third.left = sixth;
    }
    public void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args)
    {
        BinaryTreeInorder bti = new BinaryTreeInorder();
        bti.createTree();
        System.out.println("PreOreder");
        bti.preOrder(bti.root);
        System.out.println("\nInOreder");
        bti.inOrder(bti.root);
        System.out.println("\nv               cfr1PostOrder");
        bti.postOrder(bti.root);
    }

}

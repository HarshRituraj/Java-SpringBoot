package tree;

public class Tree {

	public static void inOrderTraversal(Node ptr)
	{
		if(ptr!=null)
		{
			inOrderTraversal(ptr.getLeftChild());
			System.out.println(ptr.getData());
			inOrderTraversal(ptr.getRightChild());
		}
	}
	
	public static void preorderTraversal(Node ptr)
	{
		if(ptr != null)
		{
			System.out.println(ptr.getData());
			preorderTraversal(ptr.getLeftChild());
			preorderTraversal(ptr.getRightChild());
		}
		
	}
	
	public static void postOrderTraversal(Node ptr)
	{
		if(ptr != null)
		{
			postOrderTraversal(ptr.getLeftChild());
			postOrderTraversal(ptr.getRightChild());
			System.out.println(ptr.getData());
		}
	}
	
	public static void main(String[] args) {
		
		Node root = new Node();
		root.setData(10);
		
		Node c2 = new Node();
		c2.setData(20);
		c2.setLeftChild(null);
		c2.setRightChild(null);
		root.setLeftChild(c2);
		
		Node c3 = new Node();
		c3.setData(30);
		c3.setLeftChild(null);
		c3.setRightChild(null);
		root.setRightChild(c3);
		
		Node c4 = new Node();
		c4.setData(40);
		c4.setLeftChild(null);
		c4.setRightChild(null);
		c2.setLeftChild(c4);
		
		Node c5 = new Node();
		c5.setData(50);
		c5.setLeftChild(null);
		c5.setRightChild(null);
		c2.setRightChild(c5);
		
		Node c6 = new Node();
		c6.setData(60);
		c6.setLeftChild(null);
		c6.setRightChild(null);
		c3.setLeftChild(c6);
		
		Node c7 = new Node();
		c7.setData(70);
		c7.setLeftChild(null);
		c7.setRightChild(null);
		c3.setRightChild(c7);
		
//		inOrderTraversal(root);
//		preorderTraversal(root);
		postOrderTraversal(root);

	}

}

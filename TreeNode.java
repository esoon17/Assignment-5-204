/*
 * Name: Esther Soon
 * Class: CMSC 204-38176
 * Instructor: Farnaz Eivazi
 * Date: 4/12/2022
*/
 /**@author Esther Soon*/

public class TreeNode<T> {
	
	protected T data;
	protected TreeNode<T> left;
	protected TreeNode<T> right;
	
	/**
	 * Create a new TreeNode with left and right child set to null and data set to the dataNode
	 * @param dataNode - the data to be stored in the TreeNode
	 */
	public TreeNode(T dataNode) {
		this.data = dataNode;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * used for making deep copies
	 * @param node - node to make copy of
	 */
	public TreeNode(TreeNode<T> node) {
		this.data = node.data;
		this.left = node.left;
		this.right = node.right;
	}
	
	/**
	 * Return the data within this TreeNode
	 * @return the data within the TreeNode
	 */
	public T getData() {
		return this.data;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

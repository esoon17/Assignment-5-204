/*
 * Name: Esther Soon
 * Class: CMSC 204-38176
 * Instructor: Farnaz Eivazi
 * Date: 4/12/2022
*/
 /**@author Esther Soon*/

import java.util.ArrayList;

public class MorseCodeTree {
	
	private TreeNode<String> root;
	
	/**
	 * Constructor - calls the buildTree method
	 */
	public MorseCodeTree() {
		buildTree();
	}
	
	/**
	 * Returns a reference to the root
	 * @return reference to root
	 */
	public TreeNode<String> getRoot(){
		return this.root;
	}
	
	/**
	 * Sets the root of the MorseCodeTree
	 * @param newNode - a newNode that will be the root of MorseCodeTree
	 */
	public void setRoot(TreeNode<String> newNode) {
		root = newNode;
	}
	
	/**
	 * Adds element to the correct position in the tree based on the code This method will call the recursive method addNode
	 * @param code the code for the new node to be added, example ".-."
	 * @param letter - the data of the new TreeNode to be added
	 */
	public void insert(String code, String letter) {
		addNode(this.root, code, letter);
	}
	
	/**
	 * 
	 * @param root - the root of the tree for this particular recursive instance of addNode
	 * @param code - the code for this particular recursive instance of addNode
	 * @param letter - the data of the new TreeNode to be added
	 */
	public void addNode(TreeNode<String> root, String code, String letter) {
		if (code.length() == 1) {
			if (code.equals(".")) {
				root.left = new TreeNode<String>(letter);
			}
			if (code.equals("-")) {
				root.right = new TreeNode<String>(letter);
			}
		} else if (code.length() != 1) {
			if (code.charAt(0) == '.') {
				addNode(root.left, code.substring(1), letter);
			}
			if (code.charAt(0) == '-') {
				addNode(root.right, code.substring(1), letter);
			}
		}
	}
	
	/**
	 * 
	 * @param code - the code that describes the traversals to retrieve the string (letter)
	 * @return the string (letter) that corresponds to the code
	 */
	public String fetch(String code) {
		return fetchNode(root, code);
	}
	
	/**
	 * This is the recursive method that fetches the data of the TreeNode that corresponds with the code A '.' (dot)
	 * means traverse to the left. A "-" (dash) means traverse to the right. The code ".-" would fetch the data of 
	 * the TreeNode stored as the right child of the left child of the root
	 * @param root - the root of the tree for this particular recursive instance of addNode
	 * @param code - the code for this particular recursive instance of addNode
	 * @return the string (letter) corresponding to the code
	 */
	public String fetchNode(TreeNode<String> root, String code) {
		String letter="";
		if (code.length() == 1) {
			if (code.equals(".")) {
				return root.left.getData();
			}
			if (code.equals("-")) {
				return root.right.getData();
			}
		} else if (code.length() != 1) {
			if (code.charAt(0) == '-') {
				return fetchNode(root.right, code.substring(1));
			}
			if (code.charAt(0) == '.') {
				return fetchNode(root.left, code.substring(1));
			}
		}
		return letter;
	}
	
	/**
	 * This operation is not supported in the MorseCodeTree
	 * @param data - data of node to be deleted
	 * @return reference to the current tree
	 * @throws UnsupportedOperationException
	 */
	public MorseCodeTree delete(String data) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * This operation is not supported in the MorseCodeTree
	 * @return reference to the current tree
	 * @throws UnsupportedOperationException
	 */
	public MorseCodeTree update() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	/**
	 * This method builds the MorseCodeTree by inserting the nodes of the tree level by level based on the code.
	 */
	public void buildTree() {
		setRoot(new TreeNode<String>("")); 
		insert(".", "e");
		insert("-", "t");
		insert("..", "i");
		insert(".-", "a");
		insert("-.", "n");
		insert("--", "m");
		insert("...", "s");
		insert("..-", "u");
		insert(".-.", "r");
		insert(".--", "w");
		insert("-..", "d");
		insert("-.-", "k");
		insert("--.", "g");
		insert("---", "o");
		insert("....", "h");
		insert("...-", "v");
		insert("..-.", "f");
		insert(".-..", "l");
		insert(".--.", "p");
		insert(".---", "j");
		insert("-...", "b");
		insert("-..-", "x");
		insert("-.-.", "c");
		insert("-.--", "y");
		insert("--..", "z");
		insert("--.-", "q");
	}
	
	/**
	 * Returns an ArrayList of the items in the linked Tree in LNR (Inorder) Traversal order Used for testing to make sure tree is built correctly
	 * @return an ArrayList of the items in the linked Tree
	 */
	public ArrayList<String> toArrayList(){
		ArrayList<String> array = new ArrayList<>();
		LNRoutputTraversal(root, array);
		return array;
	}
	
	/**
	 * The recursive method to put the contents of the tree in an ArrayList in LNR (Inorder)
	 * @param root - the root of the tree for this particular recursive instance
	 * @param list - the ArrayList that will hold the contents of the tree in LNR order
	 */
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		if (root == null) {
			return;
		}
		LNRoutputTraversal(root.left, list);
		list.add(root.data);
		LNRoutputTraversal(root.right, list);
	}
	
	
	
	
	
	
	
	
	
}

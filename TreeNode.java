package abc;
/** TreeNode class
 * 
 * @author Jonas da Silva
 *
 */


public class TreeNode<T> {
	
	protected T data;
	protected TreeNode<T> rightChild;
	protected TreeNode<T> leftChild;
	
	//constructor
	public TreeNode(T dataNode) {
		rightChild = null;
		leftChild = null;
		data = dataNode;
	}
	
	//constructor that creates deep copy
	public TreeNode (TreeNode node) {
		new TreeNode<T>(node);
	}
	
	//gets data
	public T getData() {
		return data;
	}

}

package main.programming.binaryTrees.traversals

class TreeNode(var data: Int, var left: TreeNode? = null, var right: TreeNode? = null)
fun initializeBinaryTree(): TreeNode {
    val a = TreeNode(2)
    val b = TreeNode(3)
    return TreeNode(1, a, b)
}
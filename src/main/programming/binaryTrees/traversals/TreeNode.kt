package main.programming.binaryTrees.traversals

class TreeNode(var data: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun initializeBinaryTree(): TreeNode {
    val c = TreeNode(4)
    val d = TreeNode(5)
    val a = TreeNode(2, c, d)
    val b = TreeNode(3)
    return TreeNode(1, a, b)
}
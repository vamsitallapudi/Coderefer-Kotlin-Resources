package main.programming.binaryTrees.traversals

import java.util.*

class PreOrderTraversal {
    fun preorderTraversalRecursive(root: TreeNode?): List<Int> {
//        if root is null, return list of empty array
        if (root == null) {
            return listOf()
        }
//        iterate recursively into left child and right child
        return listOf(root.data) + preorderTraversalRecursive(root.left) + preorderTraversalRecursive(root.right)
    }

    fun preOrderTraversalIterative(root:TreeNode?): List<Int> {
        val myList = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        if (root == null) {
            return myList
        }
        stack.add(root)
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            myList.add(node.data)
            node.right?.let {stack.add(it) }
            node.left?.let { stack.add(it) }
        }
        return myList
    }
}

fun main() {
    print(PreOrderTraversal().preorderTraversalRecursive(initializeBinaryTree()))
    print(PreOrderTraversal().preOrderTraversalIterative(initializeBinaryTree()))
}
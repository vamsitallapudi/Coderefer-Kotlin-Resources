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

    fun preOrderTraversalIterative(root: TreeNode?): List<Int> {
        val myList = mutableListOf<Int>()
        // creating stack to store the left and right nodes while processing root node
        val stack = Stack<TreeNode>()
//        checking edge case and returning empty list
        if (root == null) {
            return myList
        }
        stack.add(root) // adding root to stack initially
        while (stack.isNotEmpty()) {
            val node = stack.pop() //popping each value of stack
            myList.add(node.data)
            //adding right one first as its a stack and we
            node.right?.let { stack.add(it) }
            node.left?.let { stack.add(it) }
        }
        return myList
    }
}

fun main() {
    print(PreOrderTraversal().preorderTraversalRecursive(initializeBinaryTree()))
    print(PreOrderTraversal().preOrderTraversalIterative(initializeBinaryTree()))
}
package main.programming.binaryTrees.traversals

import java.util.ArrayDeque

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
        val stack = ArrayDeque<TreeNode>()
//        checking edge case and returning empty list
        if (root == null) return myList
        var node = root
        while (node != null || stack.isNotEmpty()) {
            if (node != null) {
                stack.push(node) // pushing before processing children
                myList.add(node.data) //adding before going to left subtree
                node = node.left
            } else {
                val p = stack.pop() // now popping stack to traverse right subtree
                node = p.right
            }
        }
        return myList
    }
}

fun main() {
    print(PreOrderTraversal().preorderTraversalRecursive(initializeBinaryTree()))
    print(PreOrderTraversal().preOrderTraversalIterative(initializeBinaryTree()))
}
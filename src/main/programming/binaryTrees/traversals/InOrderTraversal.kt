package main.programming.binaryTrees.traversals

import java.util.*

class InOrderTraversal {
    fun inOrderTraversalRecursive(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return inOrderTraversalRecursive(root.left) + listOf(root.data) + inOrderTraversalRecursive(root.right)
    }

    fun inorderTraversalIterative(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        if (root == null) return list
        var node = root
        val stack = Stack<TreeNode>()
//        traversing the tree whenever right node is not null or the stack contains items
        while (node != null || stack.isNotEmpty()) {
//            processing all the left nodes of the current node
            if (node != null) {
                stack.push(node)
                node = node.left
            } else {
                node = stack.pop()
                list.add(node.data) // adding to the list after all left children
                node = node.right // processing the right subtree
            }
        }
        return list
    }
}

fun main() {
    print(InOrderTraversal().inorderTraversalIterative(initializeBinaryTree()))
}
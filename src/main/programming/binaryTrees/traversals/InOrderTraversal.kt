package main.programming.binaryTrees.traversals

import java.util.*

class InOrderTraversal {
    fun inOrderTraversalRecursive(root: TreeNode?) : List<Int> {
        if (root == null) return emptyList()
        return inOrderTraversalRecursive(root.left) + listOf(root.data) + inOrderTraversalRecursive(root.right)
    }

    fun inorderTraversalIterative(root:TreeNode?) : List<Int> {
        val list = mutableListOf<Int>()
        if (root == null) return list
        var node = root
        val stack = Stack<TreeNode>()
//        traversing the tree whenever right node is not null or the stack contains items
        while (node !=null || stack.isNotEmpty()) {
//            processing all the left nodes of the current node
            while (node != null) {
                stack.add(node)
                node= node.left
            }
            node = stack.pop()
            list.add(node.data) // adding the current node's value to the list
            node = node.right // processing the right subtree
        }
        return list
    }
}

fun main() {
    print(InOrderTraversal().inorderTraversalIterative(initializeBinaryTree()))
}
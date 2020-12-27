package main.programming.binaryTrees.traversals

import java.util.ArrayDeque

class InOrderTraversal {
    fun inOrderTraversalRecursive(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return inOrderTraversalRecursive(root.left) + listOf(root.data) + inOrderTraversalRecursive(root.right)
    }

    fun inorderTraversalIterative(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        if (root == null) return list
        var node = root
        val stack = ArrayDeque<TreeNode>()
//        traversing the tree whenever right node is not null or the stack contains items
        while (node != null || stack.isNotEmpty()) {
//            processing all the left nodes of the current node
            node =
                    if (node != null) {
                        stack.push(node)
                        node.left //traversing to left node without processing root data
                    } else {
                        val p = stack.pop()
                        list.add(p.data) // adding to the list if no left child
                        p.right // processing the right subtree
                    }
        }
        return list
    }
}

fun main() {
    print(InOrderTraversal().inorderTraversalIterative(initializeBinaryTree()))
}
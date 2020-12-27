package main.programming.binaryTrees.traversals

import java.util.ArrayDeque
import java.util.LinkedList

class PostOrderTraversal {
    fun postOrderRecursive(root: TreeNode?) : List<Int>{
        if(root == null) return emptyList()
        return postOrderRecursive(root.left) + postOrderRecursive(root.right) + listOf(root.data)

    }
    fun postOrderIterative(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()
        val stack = ArrayDeque<TreeNode>()
        // using linked list because adding at first is efficient O(1) compared to arraylist O(N)
        val list = LinkedList<Int>()
        stack.push(root) // pushing the root node first
        while (stack.isNotEmpty()) {
            val node = stack.pop() // popping the element from stack
            list.addFirst(node.data) // adding first element
            node.left?.let { stack.push(it) }
            node.right?.let { stack.push(it) }
        }
        return list
    }
}

fun main() {
    val x= initializeBinaryTree()
    print(PostOrderTraversal().postOrderRecursive(x))
    print(PostOrderTraversal().postOrderIterative(x))
}
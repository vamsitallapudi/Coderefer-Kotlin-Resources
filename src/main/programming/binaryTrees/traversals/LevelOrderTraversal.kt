package main.programming.binaryTrees.traversals

import java.util.*

class LevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue = LinkedList<TreeNode>()
        val list = mutableListOf<List<Int>>()
        if (root == null) return list
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val count = queue.size
            val subList = LinkedList<Int>()
            for (i in 0 until count) {
                val node = queue.poll()
                subList.add(node.data)
                if (node.left != null) {
                    queue.addLast(node.left)
                }
                if (node.right != null) {
                    queue.addLast(node.right)
                }
            }
            list.add(subList)
        }
        return list
    }
}

fun main() {
    print(LevelOrderTraversal().levelOrder(initializeBinaryTree()))
}
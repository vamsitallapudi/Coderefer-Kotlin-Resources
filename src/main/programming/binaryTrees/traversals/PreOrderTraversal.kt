package main.programming.binaryTrees.traversals

class PreOrderTraversal {

    fun preorderTraversal(root: TreeNode?): List<Int> {
//        if root is null, return list of empty array
        if (root == null) {
            return listOf()
        }
//        iterate recursively into left child and right child
        return listOf(root.data) + preorderTraversal(root.left) + preorderTraversal(root.right)
    }
}

fun main() {
    print(PreOrderTraversal().preorderTraversal(initializeBinaryTree()))
}
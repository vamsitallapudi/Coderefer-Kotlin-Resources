package main.programming.binaryTrees.traversals

class PostOrderTraversal {
    fun postOrderRecursive(root: TreeNode?) : List<Int>{
        if(root == null) return emptyList()
        return postOrderRecursive(root.left) + postOrderRecursive(root.right) + listOf(root.data)

    }
}

fun main() {
    print(PostOrderTraversal().postOrderRecursive(initializeBinaryTree()))
}
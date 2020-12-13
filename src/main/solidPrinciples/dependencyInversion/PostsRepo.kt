package main.solidPrinciples.dependencyInversion

interface PostsRepo {
    fun fetchPosts() : List<Post>
}

class PostsLocalRepo(val localDataSource: PostsLocalDataSource) : PostsRepo {
    override fun fetchPosts(): List<Post> {
        return localDataSource.dao.getPosts()
    }
}
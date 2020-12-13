package main.solidPrinciples.dependencyInversion

class FakeDao {
    fun getPosts() :List<Post> {
        return listOf(Post("abc"), Post("cd"))
    }
}
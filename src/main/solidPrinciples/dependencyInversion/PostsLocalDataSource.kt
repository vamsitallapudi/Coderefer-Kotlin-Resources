package main.solidPrinciples.dependencyInversion

data class PostsLocalDataSource(val dao: FakeDao)

val globalPosts = mutableListOf<Post>()

open class User (val username: String, val password : String) {

    var id:Int = 0
    val posts = mutableListOf<Post>()

    open fun createPost(content : String):Post {
        val post = Post(this,content)
        posts.add(post)
        globalPosts.add(post)
        println("$username created a post")
        return post
    }

    open fun readPost(){
        if (posts.isNotEmpty()){
            for (post in posts){
                println("Post by ${post.author.username} : ${post.content}")
            }
        }
        else {
            println("No posts available")
        }
    }

 open fun readAllPost(){
        if (globalPosts.isNotEmpty()){
            for (post in globalPosts){
                println("Post by ${post.author.username} : ${post.content}")
            }
        }
        else {
            println("No posts available")
        }
    }

    open fun deletePost(post: Post){
        if (posts.contains(post)){
            posts.remove(post)
            globalPosts.remove(post)
            println("$username deleted a post")
        }
    }

    open fun editPost(post: Post, newContent:String){
        if (posts.contains(post)){
            post.content = newContent
        }
        if (globalPosts.contains(post)){
            post.content = newContent
        }
    }

    fun logOut(){
        println("$username logged out")
    }



}
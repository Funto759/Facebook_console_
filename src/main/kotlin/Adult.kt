open class Adult(username:String, password:String):User(username,password) {

    open fun createChildAccount (username: String, password: String):Child{
        val child = Child(username,password)
        println("Adult Created a child account for ${child.username}")
        return child
    }
    fun permitChildPost(post: Post){
      if (!post.approved){
          post.approved = true
          println("Post by ${post.author.username} has been approved.")
          posts.add(post)
          globalPosts.add(post)
          println("$post")
      }
    }

    fun permitChildEditPost(post: Post){
      if (!post.approvedEdit){
          post.approvedEdit = true
          println("Edit post by ${post.author.username} has been approved.")
      }
    }


}
class Child(username:String, password:String) : User(username,password) {

    override fun createPost(content: String): Post {
        //        posts.add(post)
        return Post(this, content,)
    }

    override fun editPost(post: Post, newContent: String) {
        if (posts.contains(post)){
            if (post.approvedEdit){
                post.content = newContent
            }
        }
        if (globalPosts.contains(post)){
            if (post.approvedEdit){
                post.content = newContent
            }
        }

    }

}
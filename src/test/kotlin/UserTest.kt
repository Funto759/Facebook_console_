import org.junit.jupiter.api.Test

class UserTest {
    val adult =Adult("Funto Suru","Kamakazi")
    val admin = Admin("Titus","Fish")
    val child = adult.createChildAccount("Eunice","Unicorn")
    @Test
    fun creatingUsers(){
        println("Created User ${adult.username}")
        val admin = Admin("Titus","Fish")
        println("Created User ${admin.username}")
        adult.createChildAccount("Eunice","Unicorn")
    }

    @Test
    fun creatingPost(){

        adult.createPost("Happy Sunday Everybody")
        admin.createPost("Happy Monday")
        val childPost = child.createPost("Happy Friday Mummy")
        adult.permitChildPost(childPost)
        adult.readAllPost()

    }

    @Test
    fun readUsersPost(){
        adult.createPost("Happy Sunday Everybody")
        val childPost = child.createPost("Happy Friday Mummy")
        admin.createPost("Happy Christmas")
        adult.permitChildPost(childPost)

        adult.readPost()
    }

    @Test
    fun readAllPost(){

        adult.createPost("Happy Sunday Everybody")
        admin.createPost("Happy Monday")
        val childPost = child.createPost("Happy Friday Mummy")
        adult.permitChildPost(childPost)

        adult.readAllPost()
    }

    @Test
    fun EditPost(){

        val adultPost = adult.createPost("Happy Sunday Everybody")

        adult.editPost(adultPost,"Happy Sunday, My Family")
        val childPost = child.createPost("Happy Friday Mummy")
        adult.permitChildPost(childPost)

        adult.permitChildEditPost(childPost)
        child.editPost(childPost,"Happy Friday, mummy and daddy")

        adult.readPost()
    }

    @Test
    fun deletePost(){


        val post = adult.createPost("Happy Sunday Everybody")
        adult.readPost()
        adult.deletePost(post)
        adult.readPost()

    }

    @Test
    fun logOut(){
      adult.logOut()
    }
}
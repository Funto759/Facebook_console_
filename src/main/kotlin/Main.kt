fun main(args: Array<String>) {


  val admin = Admin("admin1","123")
  val adult = Adult("adult2","1234")


    val child = adult.createChildAccount("Child1", "123")
    val child2 = admin.createChildAccount("Child2", "123")

    val ad = adult.createPost("Happy Sunday")

  adult.createPost("Happy Sunday Mom")
  adult.createPost("Happy Sunday Dad")
    adult.editPost(ad,"Happy Sunday My beautiful family")
  adult.readPost()

  var a = child.createPost("Happy Sunday, Lets go to church")
  adult.permitChildPost(a)
  adult.permitChildEditPost(a)
  child.editPost(a,"Happy Monday, Im skipping church")
  adult.readAllPost()
}
class Admin(username:String, password:String):Adult(username,password) {

    override fun createChildAccount (username: String, password: String):Child{
        val child = Child(username,password)
        println("Adult Created a child account for ${child.username}")
        return child
    }

}
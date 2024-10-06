data class Post(
    var author : User,
    var content : String,
    var approved : Boolean = false,
    var approvedEdit : Boolean = false
)

data class User(
    val id: String = "",
    val name: String = "",
    val email: String = "",
    val profileImageUrl: String = "",
    val status: String = "online",
    val createdAt: Long = System.currentTimeMillis()
)
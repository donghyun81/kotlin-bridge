package bridge

data class MovingResult(val moveDirection: String, val isMovingSuccess: Boolean) {

    fun getMovingText(): String {
        if (isMovingSuccess) return " O "
        return " X "
    }
}
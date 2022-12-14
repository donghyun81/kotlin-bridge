package bridge.model

class BridgeMoving {

    fun blockResult(block: String, moving: String): String {
        if (block == moving) return PASS
        return FAIL
    }

    companion object {
        const val PASS = "O"
        const val FAIL = "X"
        const val BLANK = " "
    }

}
package bridge.model

class BridgeMoving {

    fun blockLocation(block: String, moving: String): Pair<String, String> {
        if (moving == "U") return Pair(blockResult(block, moving), BLANK)
        return Pair(BLANK, blockResult(block, moving))
    }

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
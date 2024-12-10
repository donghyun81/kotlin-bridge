package bridge

class BridgeResult(
    upSquares: List<String> = listOf(),
    downSquares: List<String> = listOf()
) {
    private val _upSquares = upSquares.toMutableList()
    private val _downSquares = downSquares.toMutableList()

    fun addUpSquares(result: String) = _upSquares.add(result)
    fun addDownSquares(result: String) = _downSquares.add(result)

    fun getUpSquares() = _upSquares.toList()
    fun getDownSquares() = _downSquares.toList()

    fun gameResult(): String {
        if (isMovingFail()) return "실패"
        return "성공"
    }

    fun isMovingFail() = _upSquares.contains(" X ") || _downSquares.contains(" X ")

    fun clearBridgeResult() {
        _upSquares.clear()
        _downSquares.clear()
    }
}
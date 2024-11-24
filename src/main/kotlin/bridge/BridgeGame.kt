package bridge

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
class BridgeGame {

    private val inputView = InputView()
    private val outputView = OutputView()

    fun run() {
        outputView.printStart()
        val bridgeSize = inputView.readBridgeSize()
        val bridge = BridgeMaker(BridgeRandomNumberGenerator()).makeBridge(bridgeSize)
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     *
     *
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun move(bridge: List<String>): Boolean {
        val upSquares = mutableListOf<String>()
        val downSquares = mutableListOf<String>()
        var movingResult: MovingResult
        bridge.forEach { square ->
            val userMovingInput = inputView.readMoving()
            movingResult = MovingResult(userMovingInput, square == userMovingInput)
            addUpSquareStringBuilder(upSquares, downSquares, movingResult)
            outputView.printMap(upSquares, downSquares)
            if (movingResult.isMovingSuccess.not()) return movingResult.isMovingSuccess
        }
        return true
    }

    private fun addUpSquareStringBuilder(
        upSquares: MutableList<String>,
        downSquares: MutableList<String>,
        movingResult: MovingResult
    ) {
        if (movingResult.moveDirection == "U") {
            upSquares.add(movingResult.getMovingText())
            downSquares.add("   ")
            return
        }
        upSquares.add("   ")
        downSquares.add(movingResult.getMovingText())
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     *
     *
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun retry() {}
}

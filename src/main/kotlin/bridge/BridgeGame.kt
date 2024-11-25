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
        val bridgeResult = BridgeResult()
        val bridge = BridgeMaker(BridgeRandomNumberGenerator()).makeBridge(bridgeSize)
        move(bridge, bridgeResult)
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     *
     *
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun move(bridge: List<String>, bridgeResult: BridgeResult) {
        bridge.forEach { square ->
            val userMovingInput = inputView.readMoving()
            addUpSquareStringBuilder(bridgeResult, userMovingInput, square)
            outputView.printMap(bridgeResult)
            if (bridgeResult.isMovingFail()) return
        }
    }

    private fun addUpSquareStringBuilder(bridgeResult: BridgeResult, movingInput: String, square: String) {
        if (movingInput == "U") {
            bridgeResult.addUpSquares(getMovingResult(movingInput, square))
            bridgeResult.addDownSquares("   ")
            return
        }
        bridgeResult.addUpSquares("   ")
        bridgeResult.addDownSquares(getMovingResult(movingInput, square))
    }

    fun getMovingResult(movingInput: String, square: String): String {
        if (movingInput == square) return " O "
        return " X "
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     *
     *
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun retry() {}
}

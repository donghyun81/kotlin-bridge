package bridge.view

import camp.nextstep.edu.missionutils.Console

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
class InputView {

    private val inputValidate = InputValidate()

    fun readBridgeSize(): Int {
        val bridgeSize = Console.readLine()
        inputValidate.bridgeSizeForm(bridgeSize)
        return bridgeSize.toInt()
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    fun readMoving(): String {
        val moving = Console.readLine()
        inputValidate.bridgeSizeForm(moving)
        return moving
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        val gameCommand = Console.readLine()
        inputValidate.gameCommandForm(gameCommand)
        return gameCommand
    }

}

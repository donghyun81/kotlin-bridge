package bridge

import camp.nextstep.edu.missionutils.Console


/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
class InputView {
    /**
     * 다리의 길이를 입력받는다.
     */
    fun readBridgeSize(): Int {
        println("다리의 길이를 입력해주세요.")
        val bridgeSize = requireNotNull(Console.readLine().toIntOrNull()) { "[ERROR] 1보다 큰 정수를 입력 해주세요" }
        require(bridgeSize >= 1) { "[ERROR] 1보다 큰 정수를 입력 해주세요" }
        return bridgeSize
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    fun readMoving(): String {
        val moving = Console.readLine()
        require(moving == "U" || moving == "D") { "[ERROR] 이동할 칸은 U 또는 D로 입력 해주세요!" }
        return moving
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        return ""
    }
}

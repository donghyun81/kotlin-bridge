package bridge.view

class InputValidate() {

    fun bridgeSizeForm(input: String) {
        require(BRIDGE_SIZE_FORM.toRegex().matches(input)) { println("[ERROR] 3 부터 20까지의 숫자만 입력해주세요.") }
    }

    fun movingForm(input: String) {
        require(MOVING_FORM.toRegex().matches(input)) { println("[ERROR] U 또는 D만 입력해주세요.") }
    }

    fun gameCommandForm(input: String) {
        require(GAME_COMMAND_FORM.toRegex().matches(input)) { println("[ERROR] R 또는 Q만 입력해주세요.") }
    }

    companion object {
        const val BRIDGE_SIZE_FORM = "^[3-9]$|^1[0-9]$|^20\$"
        const val MOVING_FORM = "^U$|D\$"
        const val GAME_COMMAND_FORM = "^R$|Q\$"
    }

}
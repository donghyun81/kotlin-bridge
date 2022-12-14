package bridge.view

class InputValidate() {

    fun bridgeSizeForm(input: String) {
        require(BRIDGE_SIZE_FORM.toRegex().matches(input)) { println("[ERROR] 3 부터 20까지의 숫자만 입력해주세요.") }
    }

    fun movingForm(input: String) {
        require(MOVING_FORM.toRegex().matches(input)) { println("[ERROR] U 또는 R만 입력해주세요.") }
    }

    companion object {
        const val BRIDGE_SIZE_FORM = "^[3-9]$|^1[0-9]$|^20\$"
        const val MOVING_FORM = "^U$|R\$"
    }

}
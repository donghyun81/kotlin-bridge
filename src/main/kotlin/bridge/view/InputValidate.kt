package bridge.view

class InputValidate() {

    fun bridgeSizeForm(input: String) {
        try {
            require(BRIDGE_SIZE_FORM.toRegex().matches(input)) {
            }
        } catch (e:IllegalArgumentException){
            println("[ERROR] 3 부터 20까지의 숫자만 입력해주세요")
        }
    }

    companion object {
        const val BRIDGE_SIZE_FORM = "^[3-9]$|^1[0-9]$|^20\$"
    }

}
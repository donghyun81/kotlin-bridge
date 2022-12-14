package bridge

import bridge.view.InputValidate
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class InputValidateTest {
    lateinit var inputValidate :InputValidate

    @BeforeEach
    fun setup() {
        inputValidate = InputValidate()
    }

    @ParameterizedTest
    @ValueSource(strings = ["1","21","2",""])
    fun `다리 길이 입력 예외처리 기능 테스트`(input :String) {
        assertThrows<IllegalArgumentException>(){
            inputValidate.bridgeSizeForm(input)
        }
    }
}
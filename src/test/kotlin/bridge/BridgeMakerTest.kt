package bridge

import bridge.model.BridgeMaker
import bridge.model.BridgeRandomNumberGenerator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class BridgeMakerTest {
    lateinit var bridgeMaker :BridgeMaker
    private val bridgeRandomNumberGenerator = BridgeRandomNumberGenerator()

    @BeforeEach
    fun setup(){
        bridgeMaker = BridgeMaker(bridgeRandomNumberGenerator)
    }

    @ParameterizedTest
    @CsvSource(
        "0,U" ,
        "1,D"
    )
    fun `지나갈 수 있는 블럭의 값을 호출하는 기능 테스트`(number:Int,bridgeBlock:String){
        assertEquals(bridgeMaker.makeBlock(number),bridgeBlock)
    }
}
package bridge

import bridge.model.BridgeMoving
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class BridgeMovingTest {
    lateinit var bridgeMoving: BridgeMoving

    @BeforeEach
    fun setup(){
        bridgeMoving = BridgeMoving()
    }

    @ParameterizedTest
    @CsvSource(
        "U,U,O",
        "U,D,X"
    )
    fun `다리 이동 결과 테스트`(block:String,moving:String,movingResult:String){
        assertEquals(bridgeMoving.blockResult(block,moving),movingResult)
    }

    @ParameterizedTest
    @CsvSource(
        "U,U,O,' '",
        "U,D,' ',X"
    )
    fun `다리 이동 위치에 맞는 결과 반환 테스트`(block:String,moving:String,upResult:String,downResult:String){
        assertEquals(bridgeMoving.blockLocation(block,moving),Pair(upResult,downResult))
    }
}
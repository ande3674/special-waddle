import com.alexis.app.service.MathematicsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes= MathematicsService)
class MathematicsTest extends Specification {

    @Autowired
    MathematicsService mathematics

    def "test add"() {
        expect:
        1 == mathematics.add(1, 0)

    }
}

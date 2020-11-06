import com.alexis.app.controller.AppRestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes=AppRestController.class)
class LoadContextTest extends Specification {

    @Autowired (required = false)
    private AppRestController appRestController

    // Simple test to check if all Beans in the Spring application context are created
    def "when context is loaded then all expected beans are created"() {
        expect: "the AppRestController is created"
        appRestController //exploit Groovy Truth to check if a bean is null
                            // (this will cause test to fail if appRestController is null
    }

}

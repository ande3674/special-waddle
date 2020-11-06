import com.alexis.app.controller.AppRestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@AutoConfigureMockMvc
@WebMvcTest
//@SpringBootTest(classes= AppRestController.class)
class AppApplicationTest  extends Specification {

    @Autowired
    private MockMvc mockMvc

//    def "when get is performed then the response has status 200 and content contains Hello World!"() {
//        expect: "Status is 200 and the response contains 'Hello World!'"
//
//        mockMvc.perform(get("/"))
//            .andExpect(status().isOk())
//            .andReturn()
//            .response
//            .contentAsString == "Hello World!"
//    }

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }
}

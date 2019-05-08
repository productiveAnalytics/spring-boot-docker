package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LDC
 */

@RestController
public class HelloController {
	public static final String TEST_RESPONSE = "Hello Docker World (from OpenShift.io)";
    
    @RequestMapping("/")
    public String home() {
        return TEST_RESPONSE;
    }
}

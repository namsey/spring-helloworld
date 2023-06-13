

package org.apache.spring.helloworld.action; 

import org.springframework.web.bind.annotation.GetMapping; 

import java.util.concurrent.TimeUnit; 

@Controller
public class ExecAndWaitTestAction { 

    @GetMapping("/test")
    public String test() throws InterruptedException { 
        TimeUnit.SECONDS.sleep(15);
        return "success"; 
    } 

}

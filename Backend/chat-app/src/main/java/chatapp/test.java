package chatapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test
{
    @RequestMapping("/test")
    public String Hello()
    {
        return  "Hello World!";
    }
}

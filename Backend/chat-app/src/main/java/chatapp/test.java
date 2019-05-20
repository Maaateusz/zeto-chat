package chatapp;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class test
{
    @RequestMapping("/test")
    public String Hello()
    {
        return  "Hello World!";
    }
}

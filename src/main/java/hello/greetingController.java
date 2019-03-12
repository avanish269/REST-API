package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController
{
  private String temp="Hello, %s!";
  private AtomicLong counter=new AtomicLong();
  @RequestMapping("/greeting")         //This ensures that the website ending on /greeting are mapped to this function
  public greeting g(@RequestParam(value="name", defaultValue="World") String name)//Gives value of name depending on request and default value is World
  {
    return new greeting(this.counter.incrementAndGet(), String.format(this.temp, name));
  }
}

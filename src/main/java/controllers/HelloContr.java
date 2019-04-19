package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("hello")
public class HelloContr {
@RequestMapping(value="/world",method = RequestMethod.GET)
    public String hello(){
    return "hello";
}
@ResponseBody
@RequestMapping(value = "/test",method = RequestMethod.GET)
    public List<Person> getPerson(){
    List<Person> list = new ArrayList<>();
    Person person =new Person();
    person.setName("Klark");
    person.setLastname("Ken");
    person.setAge("18");

    Person person2 =new Person();
    person2.setName("Tom");
    person2.setLastname("Born");
    person2.setAge("20");

    list.add(person);
    list.add(person2);

    return  list;
}
}

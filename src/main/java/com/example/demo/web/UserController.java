package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    //创建线程安全的Map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long,User>());

    @RequestMapping(value="/getUserList",method= RequestMethod.GET)
    public List<User> getUserList(){
        User user = new User();
        user.setId(1111111111);
        user.setAge(15);
        user.setName("chenligang");
        users.put( 111111111L,user);
        System.out.println(users);
    List<User> r = new ArrayList<User>(users.values());
    return r;
    }

    @RequestMapping(value = "/setUser",method=RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
    users.put(user.getId(),user);
    return "success";
    }

    @RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    @RequestMapping(value="/updateUser/{id}",method=RequestMethod.GET)
    public String updateUser(@PathVariable Long id,@ModelAttribute User user){
        User user1 =users.get(id);
        users.put(id,user);
        return "success";
    }

    @RequestMapping(value="/deleteUser/{id}",method=RequestMethod.GET)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }

}
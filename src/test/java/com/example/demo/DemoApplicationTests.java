package com.example.demo;

import com.example.demo.domain.ClgProperties;

import com.example.demo.domain.UserJ;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserJRepository;
import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =DemoApplication.class)
class DemoApplicationTests {
    /*@Autowired
    private UserService userService;*/
    @Autowired
    private ClgProperties clgProperties;
    @Autowired
    private UserJRepository userJRepository;

    @Autowired
    private CacheManager cacheManager;

    /*@Autowired
    private RedisCacheManager redisCacheManager;*/

    /*@Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secoundaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate2;*/

    @Autowired(required = false)
    UserMapper userMapper;


  /*  @Test
    void contextLoads() {
       Assert.assertEquals(clgProperties.getName(),"chenligang");
        System.out.println(clgProperties.getName());
        System.out.println("11111");
        System.out.println(clgProperties.getMeng());
        System.out.println(clgProperties.getRandom());
    }*/
   /* @Test
    void test(){
        userService.create("dfff",12);
    }*/

   @Before
   public void before(){

   }

    @Test
    void test1(){
      /*UserJ user  = new UserJ();
              user.setName("CCC");
        user.setAge(123);
        userJRepository.save(user);*/
       /* UserJ user1 =userJRepository.findUser("rrrr");
        System.out.println("年龄："+user1.getAge());*/
      //  userJRepository.save(new UserJ("BBB",20));


      System.out.println("userj11:"+userJRepository.findByName("BBB"));


      System.out.println("userj22:"+userJRepository.findByName("BBB"));

      UserJ userj =new UserJ();
        userj.setId(5L);
        userj.setName("BBB");
        userj.setAge(4);

        UserJ user =userJRepository.save(userj);
        System.out.println("userj23:"+userJRepository.findByName("BBB"));
      /*System.out.println("第一次查询结果："+userJRepository.findByName("AAA").getAge());
      System.out.println("第二次查询结果："+userJRepository.findByName("AAA").getAge());*/
    }

    //两个数据源插入表1
   /* @Test
    void test2(){
        jdbcTemplate1.update("insert into clg_user(name,age) values(?,?)","chenligang","20");
    }*/
    //两个数据源插入表2
  /*  @Test
    void test4(){
        userMapper.insert("wa",20);
    }*/

   /* @Test
    void test3(){
        jdbcTemplate2.update("insert into sdb_ssg_goods(goodsName,goodsClod) values(?,?)","手套","1004");
    }*/
}

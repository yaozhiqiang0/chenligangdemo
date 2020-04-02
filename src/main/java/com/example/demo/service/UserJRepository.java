package com.example.demo.service;

import com.example.demo.domain.UserJ;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@CacheConfig(cacheNames="users")
public interface UserJRepository extends JpaRepository<UserJ,Long> {
/**cache缓存**?
    /*@Cacheable
    UserJ findByName(String name);
    UserJ findByNameAndAge(String name,Integer age);
    @Query("from UserJ u where u.name=:name")
    UserJ findUser(@Param("name")String name);*/
/** redis缓存**/

@Cacheable(key="#p0")
UserJ findByName(String name);

@CachePut(key="#p0.name")
UserJ save(UserJ user);

}

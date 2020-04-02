package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserJ implements Serializable {


    private static final long serialVersionUID = -658687305500999114L;
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String name;

    @Override
    public String toString() {
        return "UserJ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Column(nullable=false)
    private Integer age;

    public UserJ(String name,Integer age){
    this.name=name;
    this.age=age;
    }
    public UserJ(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}

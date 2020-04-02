package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;

@Controller
public class D3Controller {

    @RequestMapping(value = "/setA",method= RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        //users.put(user.getId(),user);
        return "success";
    }

    @RequestMapping(value = "/getHtml",method= RequestMethod.GET)
    public String getHtml(){


        return "relation";
    }
    @RequestMapping(value = "/getCeshi",method= RequestMethod.GET)
    public String getCeshi(){


        return "ceshi";
    }

    @RequestMapping(value = "/getCeshi1",method= RequestMethod.GET)
    public String getCeshi1(){


        return "ceshi1";
    }
    @RequestMapping(value = "/getData",method= RequestMethod.GET)
    @ResponseBody
    public String getData(){
        String fileName="dada";
        String data =getDataFromFile(fileName);
        System.out.println(data);
        return data;
    }

    public static String getDataFromFile(String fileName) {
        String path="D:/file/"+fileName+".json";
        BufferedReader read = null;
        String lastStr="";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            read = new BufferedReader(inputStreamReader);
            String tempString = "";
            while ((tempString = read.readLine()) != null) {
                lastStr += tempString;
            }
        } catch (IOException e) {

            e.printStackTrace();
            return "";
        } finally {

            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return lastStr;
    }
}

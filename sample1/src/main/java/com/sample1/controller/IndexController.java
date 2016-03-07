package com.sample1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class IndexController {


      @RequestMapping(value="/", method = RequestMethod.GET )
      public String startHtml(){
          return "/home";
      }
      @RequestMapping(value="/index.html", method = RequestMethod.GET )
      public String startHtsafml(){
          return "/home";
      }

}
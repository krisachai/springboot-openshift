/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krisa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krisac
 */
@RestController
public class HomeController {
    
    @RequestMapping("/home")
    public String index(){
    return "welcome Home";
    }
    
}

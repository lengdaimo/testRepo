package com.demo.own.controller;

import com.demo.config.Result;
import com.demo.config.ResultFactory;
import com.demo.own.vo.LoginInfoVo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@EnableAutoConfiguration
public class LoginController {

    @CrossOrigin
    @RequestMapping("/api/login")
    //@RequestMapping(value="/api/login",method=RequestMethod.POST,produces = "application/json:charset=UTF-8")
    @ResponseBody
    private Result login(@Valid @RequestBody LoginInfoVo loginInfoVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            String message=String.format("登陆失败，详细信息[%s]",bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        if(!Objects.equals("1",loginInfoVo.getUsername())||!Objects.equals("1",loginInfoVo.getPassword())){
            String message=String.format("登陆失败，详细信息[用户名密码不准确]",bindingResult.getFieldError().getDefaultMessage());
            return ResultFactory.buildFailResult(message);
        }
        return ResultFactory.buildSuccessResult("登陆成功");
    }
}

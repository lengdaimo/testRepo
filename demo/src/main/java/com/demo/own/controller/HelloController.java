package com.demo.own.controller;

import java.util.ArrayList;
import java.util.List;

import com.demo.config.R;
import com.demo.own.vo.SelectVo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/select/{selected}")
    public R index(@RequestParam String selected){
        List<SelectVo> list = new ArrayList<>();
        if(null==selected||selected.isEmpty()){
            SelectVo selectVo1=new SelectVo("input=null1","input=null1");
            SelectVo selectVo2=new SelectVo("input=null2","input=null2");
            list.add(selectVo1);
            list.add(selectVo2);
            return R.ok().put("selectList",list);
        }else{
            SelectVo selectVo1=new SelectVo("input1","input1");
            SelectVo selectVo2=new SelectVo("input2","input2");
            list.add(selectVo1);
            list.add(selectVo2);
            return R.ok().put("selectList", list);
        }
    }
}

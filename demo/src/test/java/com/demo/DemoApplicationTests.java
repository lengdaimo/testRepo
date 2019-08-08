package com.demo;

import com.demo.auto.dao.TbUserMapper;
import com.demo.own.jpa.TbUserJPA;

// import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.demo.auto.dao")
public class DemoApplicationTests {

//    @Autowired
//    private TbUserMapper tbUserMapper;
//
//    @Autowired
//    private TbUserJPA tbUserJPA;

    @Test
    public void contextLoads() {
        //System.out.println(tbUserMapper.select().getName());
        //System.out.println(tbUserJPA.findById(2).get().getName());
    }

    @Test
    public void myTest() {
        //String str = "2019-01-23 16:16:47,314 [DEBUG] [localhost-startStop-1] io.zhiye.biz.dao.SysCacheConfApiDao.queryList [BaseJdbcLogger.java : 159] ==>  Preparing: SELECT caco_id, config_key, config_val FROM `sys_cache_conf` ";
        //String[] arrayLine = StringUtils.splitByWholeSeparator(line, "DEBUG");
        //System.out.println(tbUserMapper.select().getName());
        //System.out.println(tbUserJPA.findById(2).get().getName());
    }
}

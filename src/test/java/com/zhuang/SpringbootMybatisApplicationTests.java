package com.zhuang;

import com.zhuang.common.entity.Commentt;
import com.zhuang.mapper.CommenttMapper;
import com.zhuang.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

    @Autowired
    private CommenttMapper commenttMapper;

    @Test
    public void contextLoads() {

        List<Commentt> commentList = commenttMapper.getCommentList(1);
        System.out.println(commentList);

    }

}

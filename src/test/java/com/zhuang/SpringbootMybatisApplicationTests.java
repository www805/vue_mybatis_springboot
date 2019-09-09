package com.zhuang;

import com.zhuang.common.entity.Commentt;
import com.zhuang.mapper.CommenttMapper;
import com.zhuang.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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



    @Test
    public void testProcessBuilder(){
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("ping", "127.0.0.1");
        //将标准输入流和错误流合并，通过标准输入流读取信息
        processBuilder.redirectErrorStream(true);

        try {
            //启动进程
            Process start = processBuilder.start();
            //获取输入流
            InputStream inputStream = start.getInputStream();
            //转成字符输出流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "gbk");

            int len = -1;
            char[] c = new char[1024];
            StringBuffer outputString = new StringBuffer();
            //读取进程输入流中的内容
            while ((len = inputStreamReader.read(c)) != -1){
                String s = new String(c, 0, len);
                outputString.append(s);
                System.out.println(s);
            }
            inputStream.close();
            inputStreamReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

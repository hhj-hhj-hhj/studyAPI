package com.ujs.hhj.patterndemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlPattern {
    public static void main(String[] args) throws IOException {
        // 创建一个URL实例
        URL url = new URL("https://www.zhihu.com/question/290102232/answer/3288632723");

        // 读取网页内容
        URLConnection conn = url.openConnection();

        // 通过输入流获取网页数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex = "c\\+\\+.{10}";
        Pattern p = Pattern.compile(regex);

        // 读取数据
        while ((line = br.readLine()) != null) {

            Matcher match = p.matcher(line);
            while (match.find()) {
                System.out.println(match.group());
            }
//            System.out.println(line);
        }
        br.close();
    }
}

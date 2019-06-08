package main;

import java.io.*;
import java.util.Arrays;

import static java.lang.System.in;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String res="ALTER TABLE `lechun_erp_micro_service`.`t_oms_order_test`";

        FileReader fr = new FileReader
                ("/home/jingbao/桌面/workspace/lechun-oms/designPatterns/src/main/java/main/COMMENT");
        BufferedReader bf = new BufferedReader(fr);
        String str;
        // 按行读取字符串
        String []temp=null;
        while ((str = bf.readLine()) != null) {
            System.out.println(str);
            temp=str.split("[$]");
            res=res+"CHANGE COLUMN `"+temp[0]+"` `"+temp[0]+"` "+temp[1]+" " +
                    "NULL DEFAULT NULL COMMENT '"+temp[2]+"',";
        }

        System.out.println(res);
    }
}

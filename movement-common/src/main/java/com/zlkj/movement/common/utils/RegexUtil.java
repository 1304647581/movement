package com.zlkj.movement.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.util.StringUtils;

/**
 *
 * @Description 正则表达式工具类
 * @Author HeZeMin
 * @Date 2020年04月21日 9:41
 */
public class RegexUtil {
    /**
    * @Title: is_regName
    * @Description: TODO( 字符串是否由数字，字母或汉字组成)
    * @author HeZeMin
    * @param content
    * @return
    * @throws
    */
    public static boolean is_regName(String content){
        if(StringUtils.isEmpty(content)){
            return false;
        }
        String regex="^[a-zA-Z0-9\u4E00-\u9FA5]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match=pattern.matcher(content);
        boolean b=match.matches();
        return b;
    }
    /**
    * @Title: is_regPin
    * @Description: TODO( 字符串是否由数字，字母组成)
    * @author HeZeMin
    * @param content
    * @return
    * @throws
    */
    public static boolean is_regPin(String content){
        if(StringUtils.isEmpty(content)){
            return false;
        }
        String regex="^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match=pattern.matcher(content);
        boolean b=match.matches();
        return b;
    }
    /**
    * @Title: is_authCode
    * @Description: TODO( 验证码格式是否是全数字)
    * @author HeZeMin
    * @param content
    * @return
    * @throws
    */
    public static boolean is_authCode(String content){
        if(StringUtils.isEmpty(content)){
            return false;
        }
        String regex="^[0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(content);
        boolean b = match.matches();
        return b;
    }
    /**
    * @Title: is_tel
    * @Description: TODO( 手机号格式是否正确)
    * @author HeZeMin
    * @param content
    * @return
    * @throws
    */
    public static boolean is_tel(String content){
        if(StringUtils.isEmpty(content)){
            return false;
        }
        String regex="^0?(11|12|13|14|15|16|17|18|19)[0-9]{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(content);
        boolean b = match.matches();
        return b;
    }
    /**
    * @Title: is_alphabet
    * @Description: TODO( 字符串是否由字母组成)
    * @author HeZeMin
    * @param content
    * @return
    * @throws
    */
    public static boolean is_alphabet(String content){
        if(StringUtils.isEmpty(content)){
            return false;
        }
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match=pattern.matcher(content);
        boolean b=match.matches();
        return b;
    }
    public static void main(String[] args) {
        System.out.println(is_regPin("asda12131"));
    }
}

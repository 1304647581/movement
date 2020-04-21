package com.zlkj.movement.common.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

/**
 * @Description 中文转拼音
 * @Author HeZeMin
 * @Date 2020年04月20日 15:57
 */
public class JString {

    /**
     * 返回字符串的全拼,是汉字转化为全拼,其它字符不进行转换
     *
     * @param cnStr String 字符串
     * @return String 转换成全拼后的字符串
     */
    public static String getFullSpell(String cnStr) {
        String pinyinName = "";
        char[] nameChar = cnStr.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if (nameChar[i] > 128) {
                try {
                    pinyinName += PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat)[0];
                } catch (Exception e) {
                }
            } else {
                pinyinName += nameChar[i];
            }
        }
        return pinyinName;

    }

    /**
     * 返回字符串的拼音的首字母,是汉字转化为全拼,其它字符不进行转换
     *
     * @param cnStr String 字符串
     * @return String 转换成全拼后的字符串的首字母
     */
    public static String getFirstSpell(String cnStr) {
        String pinyinName = "";
        if (null == cnStr) {
            return pinyinName;
        }
        char[] nameChar = cnStr.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if (nameChar[i] > 128) {
                try {
                    pinyinName += PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat)[0].charAt(0);
                } catch (Exception e) {
                }
            } else {
                pinyinName += nameChar[i];
            }
        }
        return pinyinName.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(JString.getFullSpell("水晶城皓石园"));
    }

}
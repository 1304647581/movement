package com.zlkj.movement.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
/**
 * @Description 生成短链接工具类
 * @Author HeZeMin
 * @Date 2020年04月20日 16:14
 */
public class ShortUrlUtil {  
	 private static final String  PATH="http://api.t.sina.com.cn/short_url/shorten.json?source=3271760578";
    public static HttpClient httpclient;  
    static {  
        // 构造 HttpClient  
        httpclient = new DefaultHttpClient();  
    }  
    /**
     * 
     * @描述 : 长链接生成短链接
     * @创建者 : guoxiaopeng
     * @创建时间 : 2017-9-20 上午9:04:08
     * @param parm  需要转换的长链接
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static String generateShortUrl(String parm) {  
        try {  
            
            // 构造发送post请求  
            HttpPost httpost = new HttpPost(PATH);  
            List<NameValuePair> params = new ArrayList<NameValuePair>();  
            // 传递请求参数  
            params.add(new BasicNameValuePair("url_long", parm));
            httpost.setEntity(new UrlEncodedFormEntity(params, "utf-8"));  
            // 发送请求并且获取执行结果  
            HttpResponse response = httpclient.execute(httpost);  
            // 获取结果内容  
            String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");
            ObjectMapper mapper = new ObjectMapper();
            List json = mapper.readValue(jsonStr, List.class);
            Map<String,String> map = (Map<String, String>) json.get(0);
            String shortPath = map.get("url_short");
            return shortPath;  
        } catch (Exception e) {  
            e.printStackTrace();  
            return "Error";  
        }  
    }  
  
    public static void main(String[] args) {  
       // String path="http://api.t.sina.com.cn/short_url/shorten.json?source=3271760578";
        String parm="https://mp.weixin.qq.com/bizmall/authinvoice?action=list&s_pappid=d3hlYjU3ODljMjdhOTY2M2M2X_apGw2LGcozSJzZKTkl-fJaDsanmzq2fha36jKndGUN&appid=wxeb5789c27a9663c6&num=1&o1=SD1096&m1=52900&t1=4294967295&source=web&type=1&redirect_url=https%3A%2F%2Fm.fushuitong.com%2Fwx%2Fsale%2Fsuccess&signature=a722675ee8a9bab9d18c174658d1e0fc99f78c48#wechat_redirect";
        for(int i=0;i<100;i++){
    	  parm+=i;
    	  String generateShortUrl = generateShortUrl(parm);
          System.out.println(generateShortUrl);
        }
      
    }  
}  
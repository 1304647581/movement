package com.zlkj.movement.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;

/**
 * @描述 : http请求
 * @创建者 : HeZeMin
 * @创建时间 : 2016-4-13 下午8:06:44
 */
public class HttpClientUtil {
	@SuppressWarnings("deprecation")
	static DefaultHttpClient httpClient = new DefaultHttpClient(new ThreadSafeClientConnManager());
	static CookieStore store = httpClient.getCookieStore();

	public HttpClientUtil() {

	}

	public static HttpEntity get(String url, String encoding) throws Exception {
		X509TrustManager trustManager = new X509TrustManager() {
			@Override
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			@Override
			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			@Override
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};
		X509HostnameVerifier hostnameVerifier = new X509HostnameVerifier() {
			@Override
			public boolean verify(String hostname, SSLSession session) {
				return false;
			}

			@Override
			public void verify(String host, SSLSocket ssl) throws IOException {
			}

			@Override
			public void verify(String host, X509Certificate cert) throws SSLException {
			}

			@Override
			public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
			}
		};
		SSLContext sslContext = SSLContext.getInstance(SSLSocketFactory.TLS);
		sslContext.init(null, new TrustManager[] { trustManager }, null);
		SSLSocketFactory socketFactory = new SSLSocketFactory(sslContext, hostnameVerifier);
		// 通过SchemeRegistry将SSLSocketFactory注册到HttpClient上
		httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory));

		HttpGet httpGet1 = new HttpGet(url);
		HttpResponse res1 = httpClient.execute(httpGet1);
		List<Cookie> cookieList = store.getCookies();
		for (Cookie cookie : cookieList) {
			String name = cookie.getName();
			String value = cookie.getValue();
			System.out.println("访问/getcookies接口成功，cookie name = " + name + ", cookie value = " + value);
		}
		return res1.getEntity();
	}

	public static String get(String url, String encoding, DefaultHttpClient client) throws Exception {
		HttpGet httpGet = new HttpGet(url);
		HttpResponse res = client.execute(httpGet);
		return getContent(res, encoding);
	}

	public static String post(String url, String queryString, String encoding) throws Exception {
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(queryString, "UTF-8"));
		httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
		httpPost.getParams().setParameter("http.socket.timeout", new Integer(60000));
		httpPost.setHeader("Connection", "close");
		HttpResponse response = httpClient.execute(httpPost);
		return getContent(response, encoding);
	}

	public static String httpPost(String url, String queryString, String encoding) throws Exception {
		X509TrustManager trustManager = new X509TrustManager() {
			@Override
			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			@Override
			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			@Override
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}
		};

		X509HostnameVerifier hostnameVerifier = new X509HostnameVerifier() {
			@Override
			public boolean verify(String hostname, SSLSession session) {
				return false;
			}

			@Override
			public void verify(String host, SSLSocket ssl) throws IOException {
			}

			@Override
			public void verify(String host, X509Certificate cert) throws SSLException {
			}

			@Override
			public void verify(String host, String[] cns, String[] subjectAlts) throws SSLException {
			}
		};
		SSLContext sslContext = SSLContext.getInstance(SSLSocketFactory.TLS);

		sslContext.init(null, new TrustManager[] { trustManager }, null);
		// 创建SSLSocketFactory
		SSLSocketFactory socketFactory = new SSLSocketFactory(sslContext, hostnameVerifier);
		// 通过SchemeRegistry将SSLSocketFactory注册到HttpClient上
		httpClient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", 443, socketFactory));
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(queryString, "UTF-8"));
		httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
		HttpResponse response = httpClient.execute(httpPost);

		return getContent(response, encoding);
	}

	/**
	 * 
	 * @描述 : 住房连post请求
	 * @创建者 : HeZeMin
	 * @创建时间 : 2018年6月14日 上午9:56:57
	 */
	public static String httpPostJson(String url, String queryString, String encoding) throws Exception {
		if (url.startsWith("https")) {
			return httpPost(url, queryString, encoding);
		} else {
			return post(url, queryString, encoding);
		}
	}

	@SuppressWarnings("deprecation")
	public static String getContent(HttpResponse res, String encoding) throws Exception {
		HttpEntity ent = res.getEntity();
		String result = IOUtils.toString(ent.getContent(), encoding);
		ent.consumeContent();
		return result;
	}

	public static InputStream getStream(String url) throws Exception {
		HttpGet httpGet = new HttpGet(url);
		HttpResponse res = httpClient.execute(httpGet);
		return res.getEntity().getContent();
	}

	public static InputStream getStream(String url, DefaultHttpClient client) throws Exception {
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("User-Agent",
				"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1) ; .NET CLR 2.0.50727; InfoPath.2; CIBA)");
		httpGet.setHeader("Referer", "http://reg.126.com/regmail126/userRegist.do?action=fillinfo");
		// httpGet.setHeader("Accept", "*/*");
		// httpGet.setHeader("Accept-Language", "zh-cn");
		// httpGet.setHeader("Accept-Encoding", "gzip, deflate");
		httpGet.setHeader("Connection", "close");
		HttpResponse res = client.execute(httpGet);
		return res.getEntity().getContent();
	}

	public static String asciiToNative(String asciicode) {
		String[] asciis = asciicode.split("\\\\u");
		String nativeValue = asciis[0];
		try {
			for (int i = 1; i < asciis.length; i++) {
				String code = asciis[i];
				nativeValue += (char) Integer.parseInt(code.substring(0, 4), 16);
				if (code.length() > 4) {
					nativeValue += code.substring(4, code.length());
				}
			}
		} catch (NumberFormatException e) {
			return asciicode;
		}
		return nativeValue;
	}

	public static void main(String args[]) throws Exception {
		String url = "https://jljerp.jinlejia.com/home/44444444444.action";
		Map<String,String> map=new HashMap<String,String>();
		map.put("orderCode", "201188884422222222222222222222222222222222222222222222");
		map.put("status", "200");
		ObjectMapper mapper = new ObjectMapper();
		String str=HttpClientUtil.httpPostJson(url, mapper.writeValueAsString(map), "utf-8");
		System.out.println(str);
	}
}

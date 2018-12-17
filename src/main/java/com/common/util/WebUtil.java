package com.common.util;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/**
 * Created by linan on 2018-12-08.
 * Description:  字符串操作，用于保存和Web输入输出有关的方法
 */
public class WebUtil {
    /**
     * Servlet打印字符串
     *
     * @param response
     * @param str
     */
    public static void out(HttpServletResponse response, String str) {
        response.setContentType("text/html; charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        try {
            if (str.length() < 100)
                response.getWriter().println(str);
            else
                gzipReponse(response, str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void gzipReponse(HttpServletResponse response, String data) {
        try {
            byte[] result = data.getBytes("UTF-8");
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            GZIPOutputStream gout = new GZIPOutputStream(out);
            gout.write(data.getBytes("UTF-8"));
            gout.close();
            result = out.toByteArray();
            response.setHeader("Content-Encoding", "gzip");
            response.setHeader("Content-Length", result.length + "");
            response.getOutputStream().write(result);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

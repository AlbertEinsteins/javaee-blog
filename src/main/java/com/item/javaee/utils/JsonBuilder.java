package com.item.javaee.utils;


import jdk.jfr.events.ExceptionThrownEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: JsonBuilder
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-05 23:51
 * @Version: 1.0
 **/
public final class JsonBuilder {
    private JsonBuilder() throws Exception {
        throw new Exception("该类不能被实例化") ;
    }

    public static Map<String, Object> buildJson(Object data, Integer code, String msg) {
        Map<String, Object> rs = new HashMap<>() ;
        rs.put("code", code) ;
        rs.put("data", data) ;
        rs.put("msg", msg) ;
        return rs ;
    }

}

package org.test.demo.Cacl;

import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.codec.digest.DigestUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.IOUtils;
import com.google.common.collect.Maps;

import sun.nio.ch.IOStatus;

public class Main {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String str = "12345";
		Map<String,Object > map = Maps.newHashMap();
		map.put("cidn", "456523233333333");
		map.put("orderNo", "45652323338545454533333");
		map.put("api", "4565232333854548854533333");
		map.put("ksi", "4565232333854548854533333");
		map.put("sbc", "4565232333854548854533333");
		map.put("uc", "4565232333854548854533333");
		
		Map<String,Object > treeMap = Maps.newTreeMap();
		treeMap.put("cidn", "456523233333333");
		treeMap.put("orderNo", "45652323338545454533333");
		treeMap.put("api", "4565232333854548854533333");
		treeMap.put("ksi", "4565232333854548854533333");
		treeMap.put("sbc", "4565232333854548854533333");
		treeMap.put("uc", "4565232333854548854533333");
		
		
		Cnid cd = new Cnid();
		cd.setApi("4565232333854548854533333");
		cd.setOrderNo("45652323338545454533333");
		cd .setCidn("456523233333333");
		cd.setKsi("4565232333854548854533333");
		cd.setSbc("4565232333854548854533333");
		cd.setUc("4565232333854548854533333");
		
		JSONObject jsonObject1 = new JSONObject(new TreeMap<String, Object>());  
		jsonObject1.toJSONString();
		
		JSONObject jsonObject2 = new JSONObject(new TreeMap<String, Object>());  
		jsonObject2.toJSONString();
		
		
		JSONObject jsonObject3 = new JSONObject(new TreeMap<String, Object>());  
		jsonObject3.toJSONString();
		
		
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(JSON.toJSON(map))));
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(JSON.toJSON(map))));
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(map)));
		System.out.println(JSON.toJSON(map).toString());
		System.out.println(JSON.toJSONString(JSON.toJSON(map)));
		System.out.println(JSON.toJSONString(map));
		System.out.println("--------------------------------");
		System.out.println(DigestUtils.md5Hex(JSON.toJSON(cd).toString()));
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(JSON.toJSON(cd))));
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(cd)));
		System.out.println(JSON.toJSON(cd).toString());
		System.out.println(JSON.toJSONString(JSON.toJSON(cd)));
		System.out.println(JSON.toJSONString(cd));
		System.out.println("--------------------------------");
		System.out.println(DigestUtils.md5Hex(JSON.toJSON(treeMap).toString()));
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(JSON.toJSON(treeMap))));
		System.out.println(DigestUtils.md5Hex(JSON.toJSONString(treeMap)));
		System.out.println(JSON.toJSON(treeMap).toString());
		System.out.println(JSON.toJSONString(JSON.toJSON(treeMap)));
	}

}

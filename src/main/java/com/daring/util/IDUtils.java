package com.daring.util;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 生成各种唯一性值工具
 * @author shenzucai
 * @time 2017.09.23 13:28
 */
public class IDUtils {

	/**
	 * 获取java工具类util中的随机uuid
	 * @author shenzucai
	 * @time 2017.09.23 13:33
	 * @param
	 * @return true
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString();
	}

	/**
	 * 获取指定数目的uuid
	 * @author shenzucai
	 * @time 2017.09.23 13:38
	 * @param number
	 * @return true
	 */
	public static List<String> getUUID(int number){
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<number;i++){
			list.add(UUID.randomUUID().toString());
		}
		return list;
	}

}

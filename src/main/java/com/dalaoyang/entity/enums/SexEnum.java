package com.dalaoyang.entity.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SexEnum implements IEnum {
	//0表示女性
    //1表示男性

    ZERO(0,"女性"),
	ONE(1, "男性");
    //数据库的值
   private Integer value; 
   //内容
   private String desc; 
   
   SexEnum(final Integer value,final String desc) {
	 this.value = value;
	 this.desc= desc;
	 
}

@Override
public Serializable getValue() {
 
	return this.value;
}
   
@JsonValue
    public String getDesc(){
    	return this.desc; 
    	
    }


public static SexEnum valueOfCode(Integer code){
    for(SexEnum value:SexEnum.values()){
        if(value.getValue()==code){
            return value;
        }
    }
    throw new RuntimeException("无匹配的");
}
}

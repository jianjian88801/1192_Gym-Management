package com.entity.view;

import com.entity.JiepinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 解聘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 00:06:36
 */
@TableName("jiepin")
public class JiepinView  extends JiepinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiepinView(){
	}
 
 	public JiepinView(JiepinEntity jiepinEntity){
 	try {
			BeanUtils.copyProperties(this, jiepinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

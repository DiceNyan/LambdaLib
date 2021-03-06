/**
 * Copyright (c) Lambda Innovation, 2013-2015
 * 本作品版权由Lambda Innovation所有。
 * http://www.li-dev.cn/
 *
 * This project is open-source, and it is distributed under
 * the terms of GNU General Public License. You can modify
 * and distribute freely as long as you follow the license.
 * 本项目是一个开源项目，且遵循GNU通用公共授权协议。
 * 在遵照该协议的情况下，您可以自由传播和修改。
 * http://www.gnu.org/licenses/gpl.html
 */
package cn.annoreg.mc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.minecraft.item.ItemBlock;

/**
 * Registers a block. Put this on your static block instance.
 * e.g. @RegBlock public static MyBlock block; will construct a MyBlock() instance and reg it.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RegBlock {

	/**
	 * Register block's oreDictionary.
	 * @par oreDict name
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface OreDict {
		String value();
	}
	
	/**
	 * Register the block's unlocalized name and icon name at once.
	 * e.g. @RegBlock.BTName("fff") in mod "academy" will give unlocalized name "fff" and icon name "academy:fff".
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface BTName {
		String value();
	}
	
	/**
	 * The ItemBlock class that this block will use.
	 */
	Class<? extends ItemBlock> item() default ItemBlock.class;
	
}

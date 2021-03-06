/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 ******************************************************************************/
package org.ebayopensource.turmeric.policy.adminui.client.model.policy;

/**
 * The Enum SupportedPrimitive.
 * 
 * @author muguerza
 */
public enum SupportedPrimitive {
	STRING("string"), BOOLEAN("boolean");
	private final String value;

	SupportedPrimitive(String v) {
		value = v;
	}

	/**
	 * Value.
	 * 
	 * @return the string
	 */
	public String value() {
		return value;
	}

	/**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the supported primitive
	 */
	public static SupportedPrimitive fromValue(String v) {
		for (SupportedPrimitive c : SupportedPrimitive.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

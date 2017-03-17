/*
 * Copyright © 2015 Yoyodyne, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.tl1.impl;

public class Messages {
	public static String RELOAD_DEVICES_SUCCESS_MESSAGE;
	public static String RELOAD_DEVICES_FAILED_MESSAGE;
	public static void initialize(){
		RELOAD_DEVICES_FAILED_MESSAGE="Cannot connect with following ips.";
		RELOAD_DEVICES_SUCCESS_MESSAGE="successfully connected with all devices";
	}
	public static String getRELOAD_DEVICES_SUCCESS_MESSAGE() {
		return RELOAD_DEVICES_SUCCESS_MESSAGE;
	}
	public static void setRELOAD_DEVICES_SUCCESS_MESSAGE(String rELOAD_DEVICES_SUCCESS_MESSAGE) {
		RELOAD_DEVICES_SUCCESS_MESSAGE = RELOAD_DEVICES_SUCCESS_MESSAGE+rELOAD_DEVICES_SUCCESS_MESSAGE;
	}
	public static String getRELOAD_DEVICES_FAILED_MESSAGE() {
		return RELOAD_DEVICES_FAILED_MESSAGE;
	}
	public static void setRELOAD_DEVICES_FAILED_MESSAGE(String rELOAD_DEVICES_FAILED_MESSAGE) {
		RELOAD_DEVICES_FAILED_MESSAGE = RELOAD_DEVICES_FAILED_MESSAGE+rELOAD_DEVICES_FAILED_MESSAGE;
	}
	

}

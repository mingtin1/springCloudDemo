/*
 *    Copyright (c) 2018-2025, djj All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: djj (wangiegie@gmail.com)
 */

package com.github.pig.common.util.exception;

/**
 * @author djj
 * @date 2017-12-29 17:05:10
 * 403 授权拒绝
 */
public class PigDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PigDeniedException() {
    }

    public PigDeniedException(String message) {
        super(message);
    }

    public PigDeniedException(Throwable cause) {
        super(cause);
    }

    public PigDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public PigDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

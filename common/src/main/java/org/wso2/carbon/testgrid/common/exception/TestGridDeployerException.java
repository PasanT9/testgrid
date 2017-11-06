/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.testgrid.common.exception;

/**
 * Created by harshan on 10/30/17.
 */
public class TestGridDeployerException extends Exception {

    private static final long serialVersionUID = -3151279311329070297L;

    public TestGridDeployerException(String msg, Exception nestedEx) {
        super(msg, nestedEx);
    }

    public TestGridDeployerException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestGridDeployerException(String msg) {
        super(msg);
    }

    public TestGridDeployerException() {
        super();
    }

    public TestGridDeployerException(Throwable cause) {
        super(cause);
    }
}
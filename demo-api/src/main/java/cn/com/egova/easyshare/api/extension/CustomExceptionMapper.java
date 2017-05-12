/**
 * Copyright 1999-2014 dangdang.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.egova.easyshare.api.extension;

import cn.com.egova.easyshare.common.constant.ErrorCode;
import cn.com.egova.easyshare.common.dto.ResultDto;
import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.log4j.Logger;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * dubbo异常统一处理
 * 业务异常在action中处理，框架异常在此集中处理并返回信息
 */
public class CustomExceptionMapper implements ExceptionMapper<ClientErrorException>{

    private final Logger logger = Logger.getLogger(CustomExceptionMapper.class);
    public Response toResponse(ClientErrorException e) {
        ResultDto resultDto = new ResultDto();
        resultDto.setCode(ErrorCode.ERROR.getCode());
        resultDto.setDesc("接口调用出现异常");
        logger.error("Exception mapper successfully got an exception: " + e + ":" + e.getMessage());
        logger.error("Client IP is " + RpcContext.getContext().getRemoteAddressString());
        return Response.status(Response.Status.OK)
                .entity(resultDto).type(MediaType.APPLICATION_JSON).build();
    }
}

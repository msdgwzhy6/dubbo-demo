package cn.com.egova.easyshare.api.human;

import cn.com.egova.easyshare.common.dto.ResultDto;
import cn.com.egova.easyshare.common.entity.Human;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 人员相关接口
 * Created by gongxufan on 2017/3/8.
 */
@Path("humans")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface HumanActionApi<T> {

    /**
     * 获取人员信息
     *
     * @param id
     * @return
     */
    @GET
    @Path("view/{id : \\d+}")
    ResultDto<Human> getHuman(@PathParam("id") Integer id);
}

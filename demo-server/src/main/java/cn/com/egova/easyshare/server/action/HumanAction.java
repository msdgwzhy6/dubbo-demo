package cn.com.egova.easyshare.server.action;

import cn.com.egova.easyshare.api.human.HumanActionApi;
import cn.com.egova.easyshare.common.constant.ErrorCode;
import cn.com.egova.easyshare.common.dto.ResultDto;
import cn.com.egova.easyshare.common.entity.Human;
import cn.com.egova.easyshare.server.service.IHumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by gongxufan on 2017/3/8.
 */
@Component
public class HumanAction<T> implements HumanActionApi<T> {

    @Autowired
    private IHumanService humanService;

    public ResultDto<Human> getHuman(Integer id) {
        ResultDto<Human> resultDto = new ResultDto<Human>();
        try {
            Human user = humanService.getHuman(id);
            resultDto.setData(user);
            resultDto.setCode(ErrorCode.OK.getCode());
            resultDto.setDesc(ErrorCode.OK.getDesc());
        } catch (Exception e) {
            e.printStackTrace();
            resultDto.setDesc(ErrorCode.ERROR.getDesc());
            resultDto.setCode(ErrorCode.ERROR.getCode());
        }
        return resultDto;
    }
}

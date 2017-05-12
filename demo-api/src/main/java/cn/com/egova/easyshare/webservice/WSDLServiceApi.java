package cn.com.egova.easyshare.webservice;

import cn.com.egova.easyshare.common.adapter.StringObjectMapAdapter;
import cn.com.egova.easyshare.common.dto.NewsDto;
import cn.com.egova.easyshare.common.dto.NewsPageDto;
import cn.com.egova.easyshare.common.dto.ResultDto;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import java.util.Map;

/**
 * Created by gongxufan on 2017/4/5.
 */
public interface WSDLServiceApi {
    NewsPageDto fetchNews(@XmlJavaTypeAdapter(StringObjectMapAdapter.class) Map params);
}

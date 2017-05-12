package cn.com.egova.easyshare.server.webservice;

import cn.com.egova.easyshare.common.dto.NewsDto;
import cn.com.egova.easyshare.common.dto.NewsPageDto;
import cn.com.egova.easyshare.common.dto.ResultDto;
import cn.com.egova.easyshare.webservice.WSDLServiceApi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by gongxufan on 2017/4/5.
 */
@Service("wSDLService")
public class WSDLService implements WSDLServiceApi {
  public NewsPageDto fetchNews(Map params) {
    NewsPageDto newsPageDto = new NewsPageDto();
    List<NewsDto> rows = new ArrayList<NewsDto>();
    NewsDto newsDto = new NewsDto();
    newsDto.setNewsName("demonews");
    newsDto.setCreateDate(new Date());
    rows.add(newsDto);
    newsPageDto.setRows(rows);
    newsPageDto.setTotal(100);
    return newsPageDto;
  }
}

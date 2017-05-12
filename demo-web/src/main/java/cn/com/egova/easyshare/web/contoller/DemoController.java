package cn.com.egova.easyshare.web.contoller;

import cn.com.egova.easyshare.api.human.HumanActionApi;
import cn.com.egova.easyshare.webservice.WSDLServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gongxufan on 2017/5/12.
 */
@Controller
@RequestMapping(value = "/")
public class DemoController {
  @Autowired
  private HumanActionApi humanAction;

  @Autowired
  private WSDLServiceApi wsdlService;

  @RequestMapping
  public String test(HttpServletRequest request) {
    return "test";
  }

  @ResponseBody
  @RequestMapping("/restTest")
  public Object restTest(HttpServletRequest request) {
    return humanAction.getHuman(1);
  }

  @ResponseBody
  @RequestMapping("/wsdlTest")
  public Object wsdlTest(HttpServletRequest request) {
    Map<String,Object> params = new HashMap<String,Object>();
    params.put("isNew",1);
    return wsdlService.fetchNews(params);
  }
}

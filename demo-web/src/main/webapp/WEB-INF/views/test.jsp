<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<%
  String host = request.getScheme()+"://"+request.getServerName();
  String context = request.getContextPath();
  String basePath = host +":"+request.getServerPort()+context;
%>
<script src="<%=basePath%>/jquery-1.8.0.min.js"></script>
<div style="width: 300px;height: 200px;margin: auto">
  <a href="javascript:;" onclick="test('rest')">rest接口测试</a>
  <br/>
  <a href="javascript:;" onclick="test('wsdl')">wsdl接口测试</a>
  <br/>
  <a href="<%=host%>:8892/services/cn.com.egova.easyshare.webservice.WSDLServiceApi?wsdl" target="_blank">获取WSDL文件</a>
</div>
<script>
  function tostring(x)
  {
    var __temp = x;

    var xmlstr;
    __temp.children().each(function(){
      if($.browser.msie){
        xmlstr = this.xml;
      }else{
        xmlstr = (new XMLSerializer()).serializeToString(this);
      }
    });
    return xmlstr;
  }
  function test(type) {
    if(type == 'rest'){
        $.post("<%=basePath%>/restTest",function (response) {
          alert(JSON.stringify(response));
        });
    }else{
      $.post("<%=basePath%>/wsdlTest",function (response) {
        alert(tostring($(response)));
      });
    }
  }
</script>

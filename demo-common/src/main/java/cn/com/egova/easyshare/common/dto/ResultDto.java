package cn.com.egova.easyshare.common.dto;

import cn.com.egova.easyshare.common.constant.ErrorCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by gongxufan on 2017/3/8.
 */
public class ResultDto<T> {
  private int code;
  private String desc;
  private T data;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public static ResultDto ok() {
    ResultDto resultDto = new ResultDto();
    resultDto.setCode(ErrorCode.OK.getCode());
    resultDto.setDesc(ErrorCode.OK.getDesc());
    return resultDto;
  }

  public static ResultDto fail() {
    ResultDto resultDto = new ResultDto();
    resultDto.setCode(ErrorCode.ERROR.getCode());
    resultDto.setDesc(ErrorCode.ERROR.getDesc());
    return resultDto;
  }

  public static ResultDto fail(String desc) {
    ResultDto resultDto = new ResultDto();
    resultDto.setCode(ErrorCode.ERROR.getCode());
    resultDto.setDesc(desc);
    return resultDto;
  }
}

package cn.com.egova.easyshare.common.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by gongxufan on 2017/3/30.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NewsDto {
  @XmlElement
  private Integer newsID;
  @XmlElement
  private String newsName;
  @XmlElement
  private String newsDescr;
  @XmlElement
  private String newsURL;
  @XmlElement
  private Integer newsTypeID;
  @XmlElement
  private Integer unitID;
  @XmlElement
  private Date createDate;
  @XmlElement
  private Date updateDate;
  @XmlElement
  private Integer displayOrder;
  @XmlElement
  private Integer openFlag = 0;
  @XmlElement
  private String op;

  public Integer getNewsID() {
    return newsID;
  }

  public void setNewsID(Integer newsID) {
    this.newsID = newsID;
  }

  public String getNewsName() {
    return newsName;
  }

  public void setNewsName(String newsName) {
    this.newsName = newsName;
  }

  public String getNewsDescr() {
    return newsDescr;
  }

  public void setNewsDescr(String newsDescr) {
    this.newsDescr = newsDescr;
  }

  public String getNewsURL() {
    return newsURL;
  }

  public void setNewsURL(String newsURL) {
    this.newsURL = newsURL;
  }

  public Integer getNewsTypeID() {
    return newsTypeID;
  }

  public void setNewsTypeID(Integer newsTypeID) {
    this.newsTypeID = newsTypeID;
  }

  public Integer getUnitID() {
    return unitID;
  }

  public void setUnitID(Integer unitID) {
    this.unitID = unitID;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }

  public Integer getOpenFlag() {
    return openFlag;
  }

  public void setOpenFlag(Integer openFlag) {
    this.openFlag = openFlag;
  }

  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }
}

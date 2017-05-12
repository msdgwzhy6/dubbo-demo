package cn.com.egova.easyshare.common.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by gongxufan on 2017/3/30.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NewsPageDto {
  @XmlElement
  private int total;
  @XmlElement
  private List<NewsDto> rows;

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public List<NewsDto> getRows() {
    return rows;
  }

  public void setRows(List<NewsDto> rows) {
    this.rows = rows;
  }
}

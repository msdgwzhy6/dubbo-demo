package cn.com.egova.easyshare.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import java.util.Date;

/**
 * Created by gongxufan on 2017/3/10.
 */
@Entity
@Table(name="tcHuman")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tableKeyGenerator")
    @TableGenerator(name = "tableKeyGenerator", table = "tcTableKeyGenerator",
            pkColumnName = "pk_key", valueColumnName = "pk_value", pkColumnValue = "humanID",
            initialValue = 1, allocationSize = 1)
    private Integer humanID;

    private String humanName;
    //人员代码
    private String humanCode;
    private String humanPassword;
    private String description;
    //所属单位
    private Integer unitID;
    private Integer displayOrder;
    private Integer identifyType;
    private Integer activeFlag;

    //新增人员信息
    private String tel;
    private String email;
    private String zipCode;
    private Date createDate;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Human() {
    }

    public Human(String humanName) {
        this.humanName = humanName;
    }

    public Integer getHumanID() {
        return humanID;
    }

    public void setHumanID(Integer humanID) {
        this.humanID = humanID;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanCode() {
        return humanCode;
    }

    public void setHumanCode(String humanCode) {
        this.humanCode = humanCode;
    }

    public String getHumanPassword() {
        return humanPassword;
    }

    public void setHumanPassword(String humanPassword) {
        this.humanPassword = humanPassword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
    }

    public Integer getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }
}

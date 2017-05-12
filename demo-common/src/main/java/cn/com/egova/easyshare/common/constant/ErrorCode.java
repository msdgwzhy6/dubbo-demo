package cn.com.egova.easyshare.common.constant;

/**
 * Created by gongxufan on 2017/3/13.
 */
public enum ErrorCode {
    OK("操作成功", 1000), ERROR("操作失败", 1001), TIMEOUT("操作超时", 1002);

    private int code;
    private String desc;

    ErrorCode(String desc, int code) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

package top.cusie.api.model.vo;

import top.cusie.api.model.vo.constants.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cusie
 * @date 2024/10/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    private int code;

    private String msg;

    public static Status newStatus(int code, String msg) {
        return new Status(code, msg);
    }

    public static Status newStatus(StatusEnum status, Object... msgs) {
        String msg;
        if (msgs.length > 0) {
            msg = String.format(status.getMsg(), msgs);
        } else {
            msg = status.getMsg();
        }
        return newStatus(status.getCode(), msg);
    }

}
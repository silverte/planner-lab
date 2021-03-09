package com.skt.swing.mcatalog.common.exceptions.vo;

import lombok.Getter;

@Getter
public enum SystemCommonError {
    SYSTEM_ERROR("ERROR.SYS.9999"),
    NOT_FOUND("ERROR.SYS.4040");

    private String code;

    SystemCommonError(String code) {
        this.code = code;
    }
}

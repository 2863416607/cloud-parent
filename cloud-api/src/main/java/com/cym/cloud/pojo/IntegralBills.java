package com.cym.cloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 账单流水
 */
@Data
@NoArgsConstructor
public class IntegralBills {

    private Integer id;
    private String uid;
    private Integer Type;//0注册、1任务、2兑换
    private String describe;
    private Double integral;

}

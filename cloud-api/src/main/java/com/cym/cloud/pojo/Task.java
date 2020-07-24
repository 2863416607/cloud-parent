package com.cym.cloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 任务
 */
@Data
@NoArgsConstructor
public class Task {

    private Integer id;
    private String taskName;
    private String describe;
    private Double integral;
    private Integer status; //0未接单、1进行中、2已完成
}

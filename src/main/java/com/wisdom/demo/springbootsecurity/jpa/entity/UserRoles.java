package com.wisdom.demo.springbootsecurity.jpa.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author wisdom
 * @Package com.baomidou.mybatisplus.samples.quickstart.entity
 * @date 2019/6/10 0010 16:48
 * @Copyright © 2016 Beijing Shiji Kunlun Software Co., Ltd.All rights reserved.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserRoles")
public class UserRoles {
    private static final long serialVersionUID = 8764921237427361096L;
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "ID")
    private String id;
    private String user_id;
    private String role_id;
    private Date created_time;
    private Date modified_time;
    private Integer status;
    private boolean is_delete = false;
}

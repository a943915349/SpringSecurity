package com.wisdom.demo.springbootsecurity.jpa.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Wisdom
 */
@Data
@Entity
@Table(name = "Role")
public class Role implements Serializable {
    private static final long serialVersionUID = 502820648863482311L;
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "ID")
    private String id;
    private String name;
    private String name_remark;
    private Date create_time;
    private Date modified_time;
    private Integer status;
    private boolean is_delete = false;
}

package com.wisdom.demo.springbootsecurity.jpa;

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
@Table(name = "Menu")
public class Menu implements Serializable {
    private static final long serialVersionUID = 6150214185701824801L;
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "ID")
    private String id;
    private String icon;
    private String name;
    private String authority;
    private String url;
    private Integer type;
    private Integer parent_id;
    private String sort;
    private Date created_time;
    private Date modified_time;
    private Integer status;
    private boolean is_delete = false;
}

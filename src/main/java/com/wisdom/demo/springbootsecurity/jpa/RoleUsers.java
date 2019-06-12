package com.wisdom.demo.springbootsecurity.jpa;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Wisdom
 */
@Data
@Entity
@Table(name = "RoleUsers")
public class RoleUsers implements Serializable {
    private static final long serialVersionUID = -893649887023588161L;
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "ID")
    private String id;
    private String role_id;
    private String menu_id;

}

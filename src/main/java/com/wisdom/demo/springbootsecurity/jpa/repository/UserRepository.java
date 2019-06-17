package com.wisdom.demo.springbootsecurity.jpa.repository;


import com.wisdom.demo.springbootsecurity.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author wisdom
 * @date 2019/6/12 0012
 */
public interface UserRepository extends JpaRepository<User,String> {
}

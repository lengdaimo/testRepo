package com.demo.own.jpa;

import com.demo.auto.model.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface TbUserJPA extends
        Serializable,
        JpaRepository<TbUser, Integer>,
        JpaSpecificationExecutor<TbUser> {
}

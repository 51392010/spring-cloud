package com.xin.jump.respository;

import com.xin.jump.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRespoitory extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
}

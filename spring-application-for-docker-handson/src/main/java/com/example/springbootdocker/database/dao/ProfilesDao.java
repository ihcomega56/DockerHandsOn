package com.example.springbootdocker.database.dao;

import com.example.springbootdocker.database.entity.ProfileEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.Optional;

@ConfigAutowireable
@Dao
public interface ProfilesDao {
    @Select
    Optional<ProfileEntity> selectLatest();
}

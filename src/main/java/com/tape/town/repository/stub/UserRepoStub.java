package com.tape.town.repository.stub;

import com.tape.town.entity.UserEntity;
import com.tape.town.repository.UserRepo;
import org.springframework.ldap.query.LdapQuery;

import javax.naming.Name;
import java.util.List;
import java.util.Optional;

public class UserRepoStub implements UserRepo {
    @Override
    public UserEntity findByUsername(String username) {
        return null;
    }

    @Override
    public UserEntity findByUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public List<UserEntity> findByUsernameLikeIgnoreCase(String username) {
        return null;
    }

    @Override
    public <S extends UserEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Name name) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Name name) {
        return false;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public List<UserEntity> findAllById(Iterable<Name> names) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Name name) {

    }

    @Override
    public void delete(UserEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Name> names) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<UserEntity> findOne(LdapQuery ldapQuery) {
        return Optional.empty();
    }

    @Override
    public Iterable<UserEntity> findAll(LdapQuery ldapQuery) {
        return null;
    }
}

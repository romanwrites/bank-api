package org.romankukin.bankapi.dao.account;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface AccountDao<T, K> {
  Optional<T> getEntity(K id) throws SQLException;

  List<T> getAllEntities() throws SQLException;

  T update(T t) throws SQLException;

  boolean create(T t) throws SQLException;

  boolean delete(T t);
}
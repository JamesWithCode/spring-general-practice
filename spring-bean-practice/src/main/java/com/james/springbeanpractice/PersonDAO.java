package com.james.springbeanpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

      @Autowired
      private JdbcConnection jdbcConnection;

      public JdbcConnection getJdbcConnection() {
            return jdbcConnection;
      }

      public void setJdbcConnection(JdbcConnection jdbcConnection) {
            this.jdbcConnection = jdbcConnection;
      }
}

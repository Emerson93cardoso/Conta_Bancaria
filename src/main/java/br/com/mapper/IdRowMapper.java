package br.com.mapper;

import br.com.domain.IdConta;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class IdRowMapper implements RowMapper <IdConta> {

        @Override
        public IdConta mapRow(ResultSet rs, int rowNum) throws SQLException {
            IdConta idConta = new IdConta();
            idConta.setId(rs.getLong("id"));
            return idConta;
        }

}

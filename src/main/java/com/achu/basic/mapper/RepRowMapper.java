package com.achu.basic.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.achu.basic.structure.SalesRep;

public class RepRowMapper implements RowMapper<SalesRep> {
    @Override
    public SalesRep mapRow(ResultSet rs, int arg1) throws SQLException {
        SalesRep rep = new SalesRep();
        rep.setId(rs.getInt("id"));
        rep.setName(rs.getString("name"));
        rep.setOpening_sales(rs.getDouble("opening_sales"));
        rep.setClosing_sales(rs.getDouble("closing_sales"));

        return rep;
    }

}


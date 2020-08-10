package com.achu.basic.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.achu.basic.structure.SalesRep;
import com.achu.basic.mapper.RepRowMapper;



@Repository
public class RepDaoImpl implements RepDao{

    public RepDaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }
    NamedParameterJdbcTemplate template;


    @Override
    public List<SalesRep> findAll() {
        return template.query("select * from salesrep", new RepRowMapper());
    }

    @Override
    public List<SalesRep> findAllPaginated(Long start , Long size){
        Long offset = size * (start - 1);
     final String sql = "SELECT  * FROM salesrep ORDER BY id OFFSET " + offset + " ROWS FETCH NEXT " + size + "ROWS ONLY";
        return template.query(sql, new RepRowMapper());
    }

    @Override
    public void addRep(SalesRep rep){
        final String sql = "insert into salesrep(id,name,opening_sales,closing_sales) values(:id,:name,:opening_sales,:closing_sales)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id",rep.getId())
                .addValue("name",rep.getName())
                .addValue("opening_sales",rep.getOpening_sales())
                .addValue("closing_sales",rep.getClosing_sales());

        template.update(sql,param,holder);
    }

    @Override
    public void updateRep(SalesRep rep){
        final String sql = "update salesrep set name=:name, opening_sales=:opening_sales, closing_sales=:closing_sales where id=:id";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id",rep.getId())
                .addValue("name",rep.getName())
                .addValue("opening_sales",rep.getOpening_sales())
                .addValue("closing_sales",rep.getClosing_sales());

        template.update(sql,param,holder);
    }

    public void executeUpdateRep(SalesRep rep){
        final String sql = "update salesrep set name=:name, opening_sales=:opening_sales, closing_sales=:closing_sales where id=:id";
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id",rep.getId());
        map.put("name",rep.getName());
        map.put("opening_sales",rep.getOpening_sales());
        map.put("closing_sales",rep.getClosing_sales());
        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }

    @Override
    public void deleteRep(SalesRep rep) {
        final String sql = "delete from salesrep where id=:id";
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id", rep.getId());
        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
    }


}




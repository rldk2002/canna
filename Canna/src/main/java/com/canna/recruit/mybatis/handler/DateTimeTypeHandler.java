package com.canna.recruit.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeTypeHandler extends BaseTypeHandler<DateTime> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, DateTime parameter, JdbcType jdbcType)
			throws SQLException {
		DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		ps.setString(i, parameter.toString(formatter));
	}

	@Override
	public DateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(rs.getString(columnName).toString());
	}

	@Override
	public DateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(rs.getString(columnIndex).toString());
	}

	@Override
	public DateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").parseDateTime(cs.getString(columnIndex).toString());
	}

}

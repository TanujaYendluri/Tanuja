package hcl.EmployShow;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public String insertRecord(){
	String sql = "insert into employ values(?,?,?,?,?)";
	jdbcTemplate.update(sql,new Object[]{
		new Integer(848),
		"Prasanna",
		"Java",
		"Trainer",
		new Integer(84555)});
return "record inserted";
}
}


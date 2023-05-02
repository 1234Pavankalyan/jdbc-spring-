package new2;
import java.util.List;

import javax.sql.DataSource;
public interface StudentDAO {
public  void setDataSource(DataSource ds);
public void create(String name,int Age);
}

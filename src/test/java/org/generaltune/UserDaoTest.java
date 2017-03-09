package org.generaltune;

import org.generaltune.dao.EmployeeDao;
import org.generaltune.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhumin on 2017/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private EmployeeDao employeeDao;

    @Test
    public void testSave() throws Exception{
        Employee employee = new Employee();
        employee.setDesignation("中国河北石家庄");
        employee.setFirstname("张飞");
        employee.setLastname("燕人张翼德");
        employee.setSalary(234);

        employeeDao.save(employee);
    }
}

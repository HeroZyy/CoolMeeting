package org.javaboy.meeting.service;

import org.javaboy.meeting.mapper.DepartmentMapper;
import org.javaboy.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author zyy
 * @微信 z17779287224
 * @GitHub https://github.com/HeroZyy
 */
@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }

    public List<Department> getAllDeps() {
        return departmentMapper.getAllDeps();
    }

    public Integer adddepartment(String departmentname) {
        Department dep = departmentMapper.getDepByName(departmentname);
        if (dep != null) {
            //有了就不用插入了
            return -1;
        }
        return departmentMapper.adddepartment(departmentname);
    }

    public Integer deletedep(Integer departmentid) {
        return departmentMapper.deletedep(departmentid);
    }

    public Integer updatedep(Integer id, String name) {
        return departmentMapper.updatedep(id,name);
    }
}

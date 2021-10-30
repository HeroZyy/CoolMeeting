package org.javaboy.meeting.model;

/**
 * @author zyy
 * @微信 z17779287224
 * @GitHub https://github.com/HeroZyy
 */
public class Department {
    private Integer departmentid;
    private String departmentname;

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
}

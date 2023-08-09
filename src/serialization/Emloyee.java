package serialization;

import java.io.Serializable;
import java.util.stream.Stream;

public class Emloyee implements Serializable {
    public int empId;
    public String empName;

    public Emloyee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

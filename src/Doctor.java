import java.util.*;
public class Doctor
{
    protected String name;
    protected String birth;
    protected int id;
    protected String speciality;
    protected String address;
    protected int salary;
    protected int departmentId;
    public ArrayList<Doctor> docs = new ArrayList<>();


    Scanner in=new Scanner(System.in);

    public Doctor(){}

    public Doctor(String name, int id, String speciality, String address,String birth,int salary) {
        this.name = name;
        this.id = id;
        this.speciality = speciality;
        this.address = address;
        this.birth =birth;
        this.salary =salary;
    }

    public Doctor(String name, int id, String speciality, String address,String birth,int salary,int departmentId) {
        this.name = name;
        this.id = id;
        this.speciality = speciality;
        this.address = address;
        this.birth =birth;
        this.salary =salary;
        this.departmentId = departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public String getBirth() {
        return birth;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void addDoctor()
    {
        System.out.println("entre the name of the doctor");
        name=in.next();
        System.out.println("entre the id of the doctor");
        id=in.nextInt();
        System.out.println("entre the department id of the doctor");
        departmentId=in.nextInt();
        System.out.println("entre the specialization of the doctor you want to add it");
        speciality=in.next();
        System.out.println("entre the address of the doctor");
        address=in.next();
        System.out.println("entre the birth date of the doctor");
        birth=in.next();
        System.out.println("entre the salary of the doctor");
        salary=in.nextInt();

        docs.add(new Doctor(name,id,speciality,address,birth,salary,departmentId));
        System.out.println("the doctor who has name : " + name + " is added successfully !");
    }

    public void displayDoctorsFixed()
    {
        for(Doctor d : docs)
        {
            System.out.println(d);
        }
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", id=" + id +'\''+
                ", department ID='" + departmentId + '\''+
                ", speciality='" + speciality + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }


}

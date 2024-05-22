import java.util.ArrayList;

public class Department
{
    protected String name;
    protected int id;
    protected ArrayList <Doctor> doctors;
    protected ArrayList <Patiants> patiants;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Department(String name, int id, ArrayList<Doctor> doctors , ArrayList <Patiants> patiants)
    {
        this.name = name;
        this.id = id;
        this.doctors = doctors;
        this.patiants=patiants;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }






}

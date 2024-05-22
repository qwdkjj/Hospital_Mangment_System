import java.util.ArrayList;
import java.util.*;
public class TreatmentRecord extends Doctor
{
    Scanner in=new Scanner(System.in);
    protected int treatmentID;
    protected String treatmentDate;
    protected double treatmentCost;
    protected int departmentId;   // معالجة داخلية
    // معالجة داخلية
    private int clinic_id;
    private Doctor treatingDoctor;

    private ArrayList<TreatmentRecord> in_treats=new ArrayList<>();
    ArrayList<Doctor> doctor_responsiple=new ArrayList<>();

    public TreatmentRecord(){}
    public TreatmentRecord(String treatmentDate, double treatmentCost, int departmentId, int clinic_id,  Doctor tratingDoctor)
    {
        this.treatmentDate = treatmentDate;
        this.treatmentCost = treatmentCost;
        this.departmentId = departmentId;
        this.clinic_id = clinic_id;
        this.treatingDoctor = tratingDoctor;
    }
    public TreatmentRecord(int treatmentID,double treatmentCost,String treatmentDate,int departmentId, ArrayList<Doctor> doctor_responsiple)
    {
        this.departmentId = departmentId;
        this.doctor_responsiple=doctor_responsiple;
        this.treatmentCost = treatmentCost;
        this.treatmentDate = treatmentDate;
        this.treatmentID = treatmentID;
    }


    public String getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(String treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }



    public void addRecordTreatment()
    {
        System.out.println("Please enter the Treatment_ID ");
        treatmentID=in.nextInt();
        System.out.println("Please enter the Date of treatment ");
        treatmentDate=in.next();
        System.out.println("Please entre the COST_Of_TREATMENT ");
        treatmentCost=in.nextDouble();

    }


    public void eturnInternalTreatmentRecordsList()
    {
        System.out.println("entre the Departmen ID of the PATIANTS you want to treat ");
        departmentId=in.nextInt();
        ArrayList<Doctor>docs2=docs;
        for (int i=0; i<1; i++)
        {


            //if(d.getDepartmentId()==departmentId)
            //{

                in_treats.add(new TreatmentRecord(treatmentID, treatmentCost,treatmentDate,departmentId,docs));
            //}

        }

    }


}

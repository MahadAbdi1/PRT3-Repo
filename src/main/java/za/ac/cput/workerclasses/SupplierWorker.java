package za.ac.cput.workerclasses;

import java.util.Date;

public class SupplierWorker {
    String suppl_id;
    String suppl_name;
    String  Suppl_Address;

    public SupplierWorker(String suppl_id, String suppl_name, String suppl_Address)
    {
        this.suppl_id = suppl_id;
        this.suppl_name = suppl_name;
        this.Suppl_Address = suppl_Address;
    }

    public String getSuppl_id() {
        return suppl_id;
    }

    public void setSuppl_id(String suppl_id) {
        this.suppl_id = suppl_id;
    }

    public String getSuppl_name() {
        return suppl_name;
    }

    public void setSuppl_name(String suppl_name) {
        this.suppl_name = suppl_name;
    }

    public String getSuppl_Address() {
        return Suppl_Address;
    }

    public void setSuppl_Address(String suppl_Address) {
        Suppl_Address = suppl_Address;
    }

    @Override
    public String toString() {
        return "SupplierWorker{" +
                ", suppl_id=" + suppl_id + ", suppl_name=" + suppl_name + ", Suppl_Address=" + Suppl_Address + '}';

    }

    public static void main(String[] args) {

        SupplierWorker sup = new SupplierWorker("772","Makro","cape town");
        System.out.println(sup);
    }

}

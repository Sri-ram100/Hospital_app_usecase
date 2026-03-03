
package hospital;

public class Patient {
    public String patientId;
    public String name;
    public int age;
    public String phone;
    public String address;

    public Patient(String patientId, String name, int age, String phone, String address) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient{id='" + patientId + "', name='" + name + "', age=" + age +
               ", phone='" + phone + "', address='" + address + "'}";
    }
}

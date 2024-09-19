package practicalLesson.problemSolvingTask.Task_2;

import java.util.Scanner;

public class DriverProfile extends WorkerProfile{
    private String drivingLicence;

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public DriverProfile(String name, int age, int salary, String drivingLicence) {
        super(name, age, salary);
        this.drivingLicence = drivingLicence;
    }

    @Override
    public String profileInfo() {
        return super.profileInfo().replace(".", "") + String.format(", категория прав: %s", drivingLicence);
    }
}

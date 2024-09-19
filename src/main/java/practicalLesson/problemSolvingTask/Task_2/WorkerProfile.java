package practicalLesson.problemSolvingTask.Task_2;

public class WorkerProfile {
    private String name;
    private int age;
    private int salary;

    public WorkerProfile(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String profileInfo(){
        return String.format("Имя: %s, возрваст: %s, зарплата: %s.", name, age, salary);
    }
}

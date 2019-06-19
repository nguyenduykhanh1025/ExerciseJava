package oop3;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String className;
    private String address;


    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.address = builder.address;
        this.birthday = builder.birthday;
        this.className = builder.className;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }


    public static class StudentBuilder {
        private int id;
        private String firstName;
        private String lastName;
        private String birthday;
        private String className;
        private String address;

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}

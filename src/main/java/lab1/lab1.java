package lab1;

import java.util.Objects;
public class lab1 {
    public static class Person{
        protected String firstName, middleName, lastName, address;
        protected int age;
        Person(String firstName, String middleName, String lastName, int age){
            this.firstName=firstName;
            this.middleName=middleName;
            this.lastName=lastName;

            this.age=age;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public String getMiddleName(){
            return this.middleName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public String getAddress(){
            return this.address;
        }
        public int getAge(){
            return this.age;
        }
    }

    /**
     * Patient class. Inherited from Person.
     */
    public static class Patient extends Person{
        String socialGroup, bloodGroup;
        private Patient(Builder b) {
            super(b.firstName, b.middleName, b.lastName, b.age);
            this.socialGroup=b.socialGroup;
            this.bloodGroup=b.bloodGroup;
        }
        public static class Builder{
            private String firstName, middleName, lastName, socialGroup, bloodGroup;
            private int age;
            public Builder(){}
            public Builder setFirstName(String name){
                if (name.length()>0)
                    this.firstName = name;
                else
                    throw new IllegalArgumentException("Illegal Argument");
                return this;
            }
            public Builder setMiddleName(String name){
                if (name.length()>0)
                    this.firstName = name;
                else
                    throw new IllegalArgumentException("Illegal Argument");
                return this;
            }
            public Builder setLastName(String name){
                if (name.length()>0)
                    this.firstName = name;
                else
                    throw new IllegalArgumentException("Illegal Argument");
                return this;
            }
            public Builder setBloodGroup(String blood_group){
                this.bloodGroup=blood_group;
                return this;
            }
            public Builder setSocialGroup(String social_group){
                this.socialGroup=social_group;
                return this;
            }
            public Builder setAge(int age){
                this.age=age;
                return this;
            }
            public Patient build(){
                return new Patient(this);
            }

        }

        @Override
        public String toString() {
            return "Patient{" +
                    "firstName='" + firstName + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", age=" + age +
                    ", socialGroup='" + socialGroup + '\'' +
                    ", bloodGroup='" + bloodGroup + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Patient patient = (Patient) o;
            return Objects.equals(firstName, patient.firstName) && Objects.equals(middleName, patient.middleName) &&Objects.equals(lastName, patient.lastName) &&Objects.equals(address, patient.address) &&Objects.equals(age, patient.age) && Objects.equals(socialGroup, patient.socialGroup) && Objects.equals(bloodGroup, patient.bloodGroup);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, middleName,lastName, address, age, bloodGroup);
        }
    }

}

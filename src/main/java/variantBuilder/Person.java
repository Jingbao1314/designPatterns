package variantBuilder;

/**
 * @author jijngbao
 * @date 19-5-19
 */
public class Person {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    static class Builder{
        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public Builder BuilderName(String name) {
            this.name = name;
            return this;
        }

        public String getAge() {
            return age;
        }

        public Builder BuilderAge(String age) {
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
    public Person(Builder builder){
        this.name=builder.getName();
        this.age=builder.getAge();
    }

    public static void main(String[] args) {
        Person person=new Builder().BuilderAge("22").BuilderName("jzt").build();
        System.out.println(person.getAge());
    }
}

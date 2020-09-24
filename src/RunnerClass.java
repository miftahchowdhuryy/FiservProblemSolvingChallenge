public class RunnerClass {
    public static void main(String[] args) {

        PersonalData pc = new PersonalData("12345", "An old name", "6 N Tejon St., Colorado Springs, CO, 80903");
        AggregateData agd = new AggregateData();
        MyObjectMapper.from(pc).to(agd);
        System.out.println(agd);
    }
}

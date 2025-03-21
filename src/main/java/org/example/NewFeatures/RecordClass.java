package org.example.NewFeatures;

record employeeDTO ( String name, int age, String personalDetails){

}
public class RecordClass {
    /**
     * What are Record classes in java? for data carrier classes. just carry data
     * introduced in java 16, useful for creating immutable data carrier objects.
     * Reduces boiler plate code: Automatically generates constructors, getters, equals(), hashCode(), and toString()
     *
     * what is immutability?
     * data remains consistent, and thread safe.
     *
     * Scenarios:
     * i. API Response: Restful APIs, record classes are perfectly suitable for represeting the structure of the JSON response
     * ii. Data base Queries: Record classes can represent the results of database queries, especially when retrieving multiple columns.
     * iii. Configuration: can store Application configuration settings
     * iv. Intermediate results: processing data streams and performing complex calculations , hold intermediate results.
     * v. Pattern Matching
     */
    public static void main(String[] args) {

        employeeDTO dto=new employeeDTO("sahitya",24,"India");
         System.out.println(dto);

    }
}

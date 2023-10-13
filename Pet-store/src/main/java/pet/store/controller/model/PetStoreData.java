package pet.store.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pet.store.entity.Customer;
import pet.store.entity.PetStore;

@Data
@NoArgsConstructor
@Getter
@Setter
public class PetStoreData {
   

   private Long petStoreId;
   private String petStoreName;
   private String petStoreAddress;
   private String petStoreCity;
   private String petStoreState;
   private String petStoreZip;
   private String petStorePhone;
   private Set<PetStoreCustomer> customers = new HashSet<>();
   
   
   public PetStoreData(PetStore petStore) {
		petStoreId = petStore.getPetStoreId();
		
		for (Customer customer : petStore.getCustomers()) {
			  customers.add(new PetStoreCustomer(customer));
		}
	}
   
   @Data
   @NoArgsConstructor
       static class PetStoreCustomer{
    	   private Long customerId;
         private String customerfirstName;
         private String customerlastName;
         private String customerEmail;
   private Set<String> employees = new HashSet<>();
    	   
   PetStoreCustomer(Customer customer){
	   
	 customerId = customer.getCustomerId();
     customerfirstName = customer.getCustomerfirstName();
     customerlastName = customer.getCustomerlastName();
     customerEmail = customer.getCustomerEmail();
   }
}
}








//package pet.store.controller.model;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.Value;
//import pet.store.entity.Customer;
//import pet.store.entity.Employee;
//import pet.store.entity.PetStore;
//
//@Data
//@NoArgsConstructor
//public class PetStoreData {
//    private Long petStoreId;
//    private String petStoreName;
//    private String petStoreAddress;
//    private String petStoreCity;
//    private String petStoreState;
//    private String petStoreZip;
//    private String petStorePhone;
//    private PetStoreCustomer customers;
//    private PetStoreEmployee employees;
//
//    
//    public PetStoreData(PetStore petStore) {
//        this.petStoreId = petStore.getPetStoreId();
//        this.petStoreName = petStore.getPetStoreName();
//        this.petStoreAddress = petStore.getPetStoreAddress();
//        this.petStoreCity = petStore.getPetStoreCity();
//        this.petStoreState = petStore.getPetStoreState();
//        this.petStoreZip = petStore.getPetStoreZip();
//        this.petStorePhone = petStore.getPetStorePhone();
//     
//       
//       this.customers = new PetStoreCustomer((Customer) petStore.getCustomers());
//       this.employees = new PetStoreEmployee((Employee) petStore.getEmployees());
//    }
//
//    @Value
//    public static class PetStoreCustomer {
//        private Long customerId;
//        private String customerfirstName;
//        private String customerlastName;
//        private String customerEmail;
//
//        public PetStoreCustomer(Customer customer) {
//            this.customerId = customer.getCustomerId();
//            this.customerfirstName = customer.getCustomerfirstName();
//            this.customerlastName = customer.getCustomerlastName();
//            this.customerEmail = customer.getCustomerEmail();
//       }
//    }
//
//    @Value
//    public static class PetStoreEmployee {
//    	private long employeeId;
//        private String EmployeefirstName;
//        private String employeelastName;
//        private Integer employeephone;
//        private String employeejobTitle;
//
//        public PetStoreEmployee(Employee employee) {
//            this.employeeId = employee.getEmployeeId();
//            this.EmployeefirstName = employee.getEmployeefirstName();
//            this.employeelastName = employee.getEmployeelastName();
//            this.employeephone = employee.getEmployeephone();
//            this.employeejobTitle = employee.getEmployeejobTitle();
//        }
//
//  }
//}

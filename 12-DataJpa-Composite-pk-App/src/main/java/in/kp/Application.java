package in.kp;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kp.entity.Account;
import in.kp.entity.AccountPK;
import in.kp.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx  = SpringApplication.run(Application.class, args);

		AccountRepo bean = cntx.getBean(AccountRepo.class); 
		AccountPK pk = new AccountPK();
		pk.setAccNum(154552765637984l);
		pk.setAccType("Savings");  
//		
//		Account acc = new Account();
//		acc.setHolderName("Kapil");
//		acc.setBranch("Raghogarh");
//		acc.setAccountPk(pk);
//		
//		bean.save(acc);
//		
//		System.out.print("Record Save...");
		
		Optional<Account> findById = bean.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
	} 

}

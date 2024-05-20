package in.kp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kp.entity.Account;
import in.kp.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account,AccountPK> {

}

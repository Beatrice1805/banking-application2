package org.fasttrackit.bankingapplication.Repository;

import org.fasttrackit.bankingapplication.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {


}

package interface_1;

import interface_1_refactor.BankMessage;
import interface_1_refactor.EnterpriseFinance;
import interface_1_refactor.PersonBankingFinance;

/**
 * packageName : oop.isp.before
 * fileName : BBAnk
 * author : choi moon seok
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class UnhappyBank implements BankMessage, PersonBankingFinance, EnterpriseFinance {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), interface_1_refactor.Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), interface_1_refactor.Duty.ENTERPRISE_FINANCE));
    }


}

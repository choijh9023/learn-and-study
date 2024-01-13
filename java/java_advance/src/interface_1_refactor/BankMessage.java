package interface_1_refactor;

public interface BankMessage {
    default String messageSend(String bankName, Duty duty) {

        return String.format("%s 는 %s를 합니다", bankName, duty,duty.description());
    }
}
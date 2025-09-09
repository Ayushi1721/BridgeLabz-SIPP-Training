package LambdaExpressions;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{" + transactionId + "}";
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T001", "T002", "T003");

        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        System.out.println(invoices);
    }
}


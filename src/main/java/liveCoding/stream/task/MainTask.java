package liveCoding.stream.task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class MainTask {
    static void main() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //1
        System.out.println("Transactions: 1");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("Transactions: 2");
        transactions.stream()
                .map(t -> t.getTrader().getCite())
                .distinct()
                .forEach(System.out::println);

        System.out.println("Transactions: 3");
        transactions.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCite().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("Transactions: 4");
        System.out.println(transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining()));

        System.out.println("Transactions: 5");
        System.out.println(transactions.stream()
                .map(t -> t.getTrader())
                .anyMatch(t -> t.getCite().equals("Milan")));

        System.out.println("Transactions: 6");
        System.out.println(transactions.stream()
                .filter(t -> t.getTrader().getCite().equals("Cambridge"))
                .map(t -> t.getValue())
                .reduce(0, (a, b) -> a + b));

        System.out.println("Transactions: 7");
        System.out.println(transactions.stream()
                .min(Comparator.comparing(Transaction::getValue)));

        System.out.println("Transactions: 8");
        System.out.println(transactions.stream()
                .max(Comparator.comparing(Transaction::getValue)));
        System.out.println("Transactions: 9");
        IntSummaryStatistics summaryStatistics = transactions.stream().collect(Collectors.summarizingInt(Transaction::getValue));
        System.out.println(summaryStatistics);

//        transactions.stream().collect(Collectors.groupingBy(Transaction::getTrader,Collectors.filtering()))
    }
}

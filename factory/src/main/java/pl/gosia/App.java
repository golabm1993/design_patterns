package pl.gosia;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        VotingFactory votingFactory = new VotingFactory();

        CanVote person1 = votingFactory.canVote(7);

        person1.voting();

        CanVote person2 = votingFactory.canVote(18);

        person2.voting();
    }
}

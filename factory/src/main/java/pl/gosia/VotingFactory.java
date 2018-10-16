package pl.gosia;

public class VotingFactory {

    public CanVote canVote(Integer age) {
        if (age < 18)
            return new Minor();
        else return new Adult();
    }
}

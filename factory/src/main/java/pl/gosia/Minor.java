package pl.gosia;

public class Minor implements CanVote {
    @Override
    public void voting() {
        System.out.println("Cannot vote");
    }
}

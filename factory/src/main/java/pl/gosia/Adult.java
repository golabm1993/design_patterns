package pl.gosia;

public class Adult implements CanVote {
    @Override
    public void voting() {
        System.out.println("Can vote");
    }
}

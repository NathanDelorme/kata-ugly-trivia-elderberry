package info.dmerej;

public enum QuestionCategories {
    POP("Pop"),
    SCIENCE("Science"),
    SPORTS("Sports"),
    ROCK("Rock");

    public final String category;

    QuestionCategories(String category) {
        this.category = category;
    }
}

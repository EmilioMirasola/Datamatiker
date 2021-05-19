package term1.systemudvikling.aarhusøko;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FruitFoodBox extends FoodBoxCategory {
    private final List<Article> articles;
    private LocalDate start;
    private LocalDate end;

    public FruitFoodBox(LocalDate start, LocalDate end) {
        super("Fruit box", 300);
        this.start = start;
        this.end = end;
        this.articles = new ArrayList<>();
    }

    public List<Article> getArticles() {
        return new ArrayList<>(articles);
    }

    public void addArticle(Article article) {
        this.articles.add(article);
    }


    public void removeArticle(Article article) {
        this.articles.remove(article);
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }
}
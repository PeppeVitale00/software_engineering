import java.util.ArrayList;
import java.util.List;

public class NetflixConcrete implements Netflix {
    private List<User> users;
    private String newMovieTitle;
    private String genre;

    public NetflixConcrete() {
        users = new ArrayList<>();
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for (User user : users) {
            user.update(newMovieTitle, genre);
        }
    }

    public void addNewContent(String movieTitle, String genre) {
        this.newMovieTitle = movieTitle;
        this.genre = genre;
        notifyUsers();
    }
}

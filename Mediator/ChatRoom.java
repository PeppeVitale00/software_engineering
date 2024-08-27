// Concrete Mediator
import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // Non inviare il messaggio all'utente che l'ha inviato
            if (u != user) {
                u.receive(message);
            }
        }
    }
}

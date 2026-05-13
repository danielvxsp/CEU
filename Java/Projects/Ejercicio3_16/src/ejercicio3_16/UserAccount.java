package ejercicio3_16;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author qwefg
 */
public class UserAccount {

	public String alias;
	public String email;
	public List<UserAccount> followers;
	// tweets from Tweet
	// timeline from Tweet
	
	public UserAccount(String alias, String email) {
		this.alias = alias;
		this.email = email;
		this.followers = new ArrayList<>();
		//
		//
	}

	public String getAlias() { return alias; }
	
	public void follow(UserAccount user2) {
        // Evitamos que un usuario se siga a sí mismo y que se dupliquen seguidores
		if (user2 != this && !user2.followers.contains(this)) {
		user2.followers.add(this);
		}
	}
}

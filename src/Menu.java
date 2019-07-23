import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    private ArrayList<User> userLog;
    private ArrayList<Post> postLog;

    private int menuChoice;

    //postGenerator postGenerator = newPost();

    public Menu() {
        //instantiate userLog & postLog here, put it in the ArrayList
        this.userLog = new ArrayList<>();
        this.postLog = new ArrayList<>();
        this.menuChoice = menuChoice;
    }

    public void run() {
        // Menu Class to:
        // 1--create a user
        // 2--Write a post, & choose from user list
        // 3--Print all users (ArrayList w/assigned user #)
        // 4--Print all posts (ArrayList w/assigned post #)
        do {
            System.out.println("Menu: Choose an option below or 0 to exit" );
            System.out.print("  1 = Create a user");
            System.out.print("  2 = Create a post");
            System.out.print("  3 = Print all users");
            System.out.print("  4 = Pint all posts");
            menuChoice = keyboard.nextInt();
            keyboard.skip("\n");
            if(menuChoice != 0) {
                menuSelection(menuChoice);
            }
        }while (menuChoice != 0);
        System.out.println("Good-bye");
    }

    private void menuSelection(int menuChoice){
        BlogGenerator blogGenerator = new BlogGenerator(); //this will be used by both case 1 & case 2
        switch (menuChoice){
            case 1:
                System.out.println("Now creating a new user."); //call User = new User method
                User user = blogGenerator.createUser();
                this.userLog.add(new User());  //.add -->adds users to the ArrayList
                break;
            case 2:
                System.out.println("Choose your username, enter 'y' or 'n'");
                String currentUser = keyboard.nextLine();
                //currentUser = currentUser(username);
                if (currentUser.equals("Y")) {
                    System.out.println(userLog);
                    System.out.println("Type the username and hit enter.");
                    keyboard.nextLine();
                }else{
                    System.out.println("That is not a choice.");
                }
                Post post = blogGenerator.createPost(currentUser()); //call Post = New Post method
                this.postLog.add(post); //.add -->post items to the ArrayList
                    //put a user in here from the user list to create the post with a user attached
                    //then put those in the () parameters
                break;
            case 3:
                viewUser(); //call method for userLog ArrayList
                System.out.println("Now printing all posts.");
                break;
            case 4:
                viewPosts(); //call method for postLog ArrayList
                System.out.println("Now printing all users.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private void viewPosts () {
        for (Post post : postLog) {
            System.out.println("-------");
            System.out.println(post.toString());
        }
        System.out.println("-------");
        System.out.println("");
    }

    private void viewUser () {
        for (User user : userLog) {
            System.out.println("--------");
            System.out.println(user.toString());
        }
        System.out.println("--------");
        System.out.println("");
    }

    private User currentUser(){
        User thisUser = null;
        for(User user: userLog) {
            if (user.getUsername().equals(user));{  //connect to the getUsername method
                thisUser = user;
            }
        }
        return thisUser;
    }
    //lines 18-22 code from lesson94 -->Creates ArrayList of type users,

    //method to store user info into ArrayList
    //Is this where I will create the for loop to cycle/loop through the list?
    //Iterator iter = users.iterator();
    //end code from lesson94
         /*
         for(in count = 0; count< posts.size(); count++){
             User u = (user) user.get(count); //return (value), 1st object, this makes it type post (forcing the cast)
             System.out.println(u);
             //this allows each post # (sequential) to be pulled and then printed (print individual fields)

*/
}

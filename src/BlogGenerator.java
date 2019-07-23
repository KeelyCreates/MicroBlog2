import java.util.Scanner;

public class BlogGenerator {
    private Scanner keyboard;

    public BlogGenerator() {

        this.keyboard = new Scanner(System.in);
    }

    public Post createBlog() {
        //building a blog post, need to add all info from createUser method
        Post post = createPost(createUser());
        String confirm;
        Post newPost;

        do {
            newPost = createPost(new User()); //create a new user and pass it into the post
            System.out.println("\n" + newPost.toString() + "\n");
            System.out.println("Do you want to continue? (Enter y for yes");
            confirm = keyboard.nextLine();
        } while (!confirm.toLowerCase().equals("y"));
        return newPost;
    }

    //creating users
    public User createUser(){
        User user = createUser();

        System.out.println("Create your user account. Begin, hit S for start.");
        keyboard.nextLine().toUpperCase().equals("s");

         //took out the do(user.equals("s"){}
            System.out.println("First Name: ");
            user.setFirstName(keyboard.nextLine());
            System.out.println("Last Name: ");
            keyboard.nextLine();  //did not like it with the other format
            System.out.println("Email: ");
            user.setEmail(keyboard.nextLine());
            System.out.println("Set your username: ");
            keyboard.nextLine();  //did not like it with the other format
            System.out.println("Do you want an Avatar? Y for yes and N for no.");
            keyboard.nextLine().toUpperCase();
            if (user.equals("Y")) {
                System.out.println("Paste url here: ");
                keyboard.nextLine();
            } else {
                System.out.println("No avatar added");
            }
        //}while (user.equals("n")) {
            //System.out.println("Are your finished? Enter D for done.");
            //keyboard.nextLine().toUpperCase();
        System.out.println("Your account was created!");
        return new User();
    }

    //create a new blog post
    public Post createPost(User user){
        Post post = createPost(createUser());
        post.setUser(user);

        System.out.println("Create content for your post: ");
        post.setContent(keyboard.nextLine());
        return new Post();
    }
    //not sure why Post post = createPost() needs a parameter
}

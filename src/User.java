
public class User {
        private int id; //private
        private int postNum;  //private, will be sequential

        private static int userCount;
        private String avatarUrl;
        private String username;
        private String firstName;
        private String lastName;
        private String email;

        //public add(Users u) {
        //users.add(u);
        //}
//Constructor that requires all User fields at creation
        public User()
        {
            userCount++; //creates users in number order
            //reestablish that the variables declared in 'class User'
            // will be connected to these instances of the variables
            this.avatarUrl = avatarUrl;
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String getAvatarUrl() {return avatarUrl;}  //
        public void setAvatarUrl(String avatarUrl) {this.avatarUrl = avatarUrl;}

        public String getUsername() {return username;}
        public void setUsername(String username) {this.username = username;}

        public String getFirstName() {return firstName;}
        public void setFirstName(String firstName) {this.firstName = firstName;}

        public String getLastName() {return lastName;}
        public void setastName(String lastName) {this.lastName = lastName;}

        public String getEmail() {return email;}
        public void setEmail(String email) {this.email = email;}

        @Override
        public String toString(){
            return avatarUrl+""+username+""+firstName+""+lastName+""+email;
        }

}

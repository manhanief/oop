

class User{
    String name;
    String password;

    User(String names,String Passwords)
    {
        this.name = names;
        this.password = Passwords;
        
    }

    public void Admin(){

        System.out.print (password);

        if(name=="Amin" && password=="Amin123"){
            System.out.print("Succesful Loggin In");
        }else{
            
            System.out.print("Wrong username/password");
        }
    }

    
    
     
}

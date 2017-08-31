package AuthorAndBook;

public class Author {
    private String _name;
    private String _email;
    private char _gender;

    public Author(String name, String email, char gender){
        _name = name;
        _email = email;
        _gender = gender;
    }

    public String getName(){
        return _name;
    }
    public String getEmail(){
        return _email;
    }
    
    public void setEmail(String email){
        _email=email;
    }


}

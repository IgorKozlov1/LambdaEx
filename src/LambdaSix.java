import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSix {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        strings.add("Ivan");
        strings.add("not");
        strings.add(null);
        strings.add("Stephan");
        strings.add("blablabla");

        List<UserOne> users=new ArrayList<>();
        List<String>userNames=new ArrayList();
        for(String name:strings){
            if(name!=null&&!name.contains(" ")&&Character.isUpperCase(name.charAt(0))){
                userNames.add(name);
            }
        }
        Collections.sort(userNames);
        for(String name:userNames){
            UserOne user=new UserOne(name);
            users.add(user);
        }
        for(UserOne userOne:users){
            System.out.println(userOne.getName());
        }

        List<UserOne> userslambda=strings.stream()
                .filter(name->name!=null&&!name.contains(" ")&&Character.isUpperCase(name.charAt(0)))
                .sorted()
                .map(UserOne::new)
                .collect(Collectors.toList());

    }
}
        class UserOne{
        private String name;
        public UserOne(String name){
            this.name=name;
        }
        String getName(){
            return name;
        }
        }
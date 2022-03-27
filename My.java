package src;
public class My {
    public static void printResult(String index, String name, String sex, String birthday, String age, String project, String enter, String describe){
        String newIndex = index.length() <= 3? index + "\t\t": index + "\t";
        String newName = name.length() <= 2? name + "\t\t": name + "\t";
        String newSex = sex + "\t\t";
        String newBirthday = birthday + "\t";
        String newAge = age + "\t\t";
        String newProject = project.length() <= 2? project + "\t\t": project + "\t";
        String newEnter = enter + "\t\t";
        System.out.println(newIndex + newName + newSex + newBirthday + newProject + newAge + newEnter + describe);
    }
    public static void main(String[] args){
        String index = "10"; String name = "李贞可"; String sex = "男";
        String birthday = "2000-21-25"; String age = "25"; String project = "数学uu";
        String enter = "2019"; String describe = "我是一名老师，我的任务是讲课";
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t科目\t\t入学日期\t\t描述");
        printResult(index, name, sex, birthday, age, project, enter, describe);
    }
}

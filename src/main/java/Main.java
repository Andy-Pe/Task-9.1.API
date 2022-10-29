public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Николай";
        post.passport = "4626 № 452885";
        post.patronymic = "Иванович";
        post.phone = "7-965-556-54-44";
        post.surname = "Лаптев";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 6;
        post.birthday.year = 1980;
    }
}

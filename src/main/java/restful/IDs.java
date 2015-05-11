package restful;

/**
 Этот класс имитирует базу данных, в дальнейшем можно удалить
 */
public class IDs {

    public String title="";
    public String keywords="";
    public String desc="";
    public String img="";
    public String text="";
    public String author="";

    public IDs(String id) {   // Тут присваивается идентификатор и идет его обработка
        Integer idis=Integer.valueOf(id);
        if(idis==1) {
            title = "Java и web";
            keywords = "Java web";
            desc = "kf";
            img = "/img.img";
            text = "Some text";
            author = "Pinguin";
        }
        else if(idis==2){
            title = "Cats";
            keywords = "Cat pussy";
            desc = "gdg";
            img = "/img.img";
            text = "Some text about cats";
            author = "kitty";
        }
    }

    public String getTitle() {
        return title;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getDesc() {
        return desc;
    }

    public String getImg() {
        return img;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
}

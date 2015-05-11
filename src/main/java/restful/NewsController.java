package restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    private String title="";
    private String kwds="";
    private String desc="";
    private String img="";
    private String text="";
    private String author="";

    @RequestMapping(value="/news")
    public News news(@RequestParam(value="id", defaultValue="404") String id){ //Тут мы получаем наш GET
        IDs ids = new IDs(id);  // Тут я имитирую подключение к БД, дальше идет присваивание значений
        title=ids.title;
        kwds=ids.keywords;
        desc=ids.desc;
        img=ids.img;
        text=ids.text;
        author=ids.author;
        return new News(id,title,kwds,desc,img,text,author); // передача значений для их обработки в JSON
    }
}

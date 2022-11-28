/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Objects;

public class SqlRequest {
    public static void getSQL(String json) throws ParseException {
        String beginSQL = "select * from students where ";
        JSONParser jsonParser = new JSONParser();
        JSONObject obj =  (JSONObject) jsonParser.parse(json);
        String name = (String) obj.get("name");
        String country = (String) obj.get("country");
        String city = (String) obj.get("city");
        String age = (String) obj.get("age");
        StringBuilder builder = new StringBuilder(beginSQL);
        boolean flag = false;
        if (!Objects.equals(name, "null")){
            builder.append(" name=").append(name);
            flag = true;
        }
        if (!Objects.equals(country, "null")){
            if (flag){
                builder.append( " AND");
            }
            builder.append(" country=").append(country);
            flag = true;
        }
        if (!Objects.equals(city, "null")){
            if (flag){
                builder.append( " AND");
            }
            builder.append(" city=").append(city);
            flag = true;
        }
        if (!Objects.equals(age, "null")){
            if (flag){
                builder.append( " AND");
            }
            builder.append(" age=").append(age);
        }
        builder.append(";");
        System.out.println(builder);
    }
}

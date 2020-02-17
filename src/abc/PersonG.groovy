package abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * Person.javaをPersonG.javaにコピーする
 * [Groovy]→[Convert file extension to Groovy]を実行すると、PersonG.groovyファイルになる。
 */
public class PersonG {
        protected int id = 1;
        protected String name = "東田　雅宏";
        protected String birth = "1962/03/31";

        static public void main(String[] args) {
            PersonG person = new PersonG();
            person.currentProfile();
        }

        protected void currentProfile() {
            System.out.println("登録番号: "+ id + ", 名前: " + name + ", 年齢: " + age(birth));
        }

        protected long age(String birthDay) {
            LocalDate b = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            return ChronoUnit.YEARS.between(b, LocalDate.now());
        }
}
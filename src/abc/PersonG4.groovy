package abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * PersonG3.groovyをPersonG4.groovyにコピーする
 *  with()メソッド使わずに、名前付き引数のコンストラクタを使う。
 *    Groovyでは名前付き引数のコンストラクタが自動生成されている。
 *  ageパラメタ記述の括弧を省略する。
 */
class PersonG4 {
        def id, name, birth

        static def main(args) {
            def person = new PersonG4(id : 1, name : /東田　雅宏/, birth : "1962/03/31")
            person.currentProfile()
        }

        def currentProfile() {
            println "登録番号: $id, 名前: $name, 年齢: ${age birth}"
        }

        def age(birthDay) {
            def b = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyy/MM/dd"))
            ChronoUnit.YEARS.between(b, LocalDate.now())
        }
}